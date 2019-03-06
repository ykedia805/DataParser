import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Utils {
    public static String readFileAsString(String filepath) {
        StringBuilder output = new StringBuilder();

        try (Scanner scanner = new Scanner(new File(filepath))) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                output.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return output.toString();
    }

    public static ArrayList<ElectionResult> parse2016ElectionResults(String data) {
        String quote = " \"\" ";
        int quoteNum = 0;
        ArrayList<ElectionResult> results = new ArrayList<>();
        String[] individualLines = data.split("\n");
        for (int i = 1; i < individualLines.length; i++) { // skips first  line which is the labels of each column
            for (int index = 0; index < individualLines[i].length(); index++) {
               deleteFirstNumandComma(individualLines, index, i);
               deletePercentSign(individualLines,index,i);
               deleteQuotesAndComma(individualLines, index, i, quoteNum, quote);
               results = addElectionResultsObject(individualLines);
            }
        }




    }
    private static void deleteFirstNumandComma(String[] individualLines, int index, int i){
        if(individualLines[i].substring(index,index+1).equals(",")){ // gets rid of the first number and the comma
            if(index < 6){
                individualLines[i].replace(individualLines[i].substring(0,index+1),"");
            }
        }
    }

    private static void deletePercentSign(String[] individualLines, int index, int i){
        if(individualLines[i].substring(index,index+1).equals("%")){
            individualLines[i].replace(individualLines[i].substring(index,index+1),"");
        }
    }

    private static int getSecondQuoteIndex(String s) {
        String quote = " \"\" ";
        for (int i = 1; i < s.length() ; i++) {
            if(s.substring(i,i+1).equals(quote.substring(1,2))){
                return i;
            }
        }
        return -1;
    }
    private static void deleteQuotesAndComma(String[] individualLines, int index, int i, int quoteNum, String quote){
        if(quoteNum == 0) { // gets rid of comma inside quotes and then both of the quotes
            if (individualLines[i].substring(index, index + 1).equals(quote.substring(1, 2))) {
                int secondQuote = getSecondQuoteIndex(individualLines[i].substring(index));
                for (int j = index; j < secondQuote; j++) {
                    if (individualLines[i].substring(j, j + 1).equals(",")) {
                        individualLines[i].replace(individualLines[i].substring(j, j + 1), "");
                    }
                }
                individualLines[i].replace(individualLines[i].substring(index, index + 1), "");
                individualLines[i].replace(individualLines[i].substring(secondQuote, secondQuote + 1), "");
                quoteNum++;
            }
        }
    }

    private static ArrayList<ElectionResult> addElectionResultsObject(String[] individualLines){
        ArrayList<ElectionResult> results = new ArrayList<>();
        for (int lineNum = 0; lineNum < individualLines.length; lineNum++) { //splits and creates new ElectionResult obj, then adds it to arraylist
            String[] dataLines = individualLines[lineNum].split(",");
            ElectionResult result = new ElectionResult(Integer.parseInt(dataLines[0]),Integer.parseInt(dataLines[1]),Integer.parseInt(dataLines[2]),Integer.parseInt(dataLines[3]),
                Integer.parseInt(dataLines[4]),Integer.parseInt(dataLines[5]),Integer.parseInt(dataLines[6])
                ,dataLines[7],dataLines[8],Integer.parseInt(dataLines[9]));

             results.add(result);
    }

         return results;
    }

}
