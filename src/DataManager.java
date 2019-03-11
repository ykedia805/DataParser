import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private List<State> states;

    public DataManager() {
        states = new ArrayList<State>();

    }

    public void addState(State s){
        states.add(s);
    }
    public void removeStates(State s){
        states.remove(s);
    }
}
