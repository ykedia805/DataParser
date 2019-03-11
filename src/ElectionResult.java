public class ElectionResult {
    double demVotes ;
    double gopVotes;
    double totalVotes;
    double demPer;
    double gopPer;
    double difference;
    double perPointDifference;
    String state;
    String county;
    double combinedFips;

    public ElectionResult(double votes_dem , double votes_gop, double total_votes, double per_dem, double per_gop, double diff, double per_point_diff, String state_abbr, String county_name, double combined_fips){
        this.demVotes = votes_dem;
        this.gopVotes = votes_gop;
        this.totalVotes = total_votes;
        this.demPer = per_dem;
        this.gopPer = per_gop;
        this.difference = diff;
        this.perPointDifference = per_point_diff;
        this.state = state_abbr;
        this.county = county_name;
        this.combinedFips = combined_fips;

    }

    public double getdemVotes() {
        return demVotes;
    }

    public void setDemVotes(double demVotes) {
        this.demVotes = demVotes;
    }

    public double getGopVotes() {
        return gopVotes;
    }

    public void setGopVotes(double gopVotes) {
        this.gopVotes = gopVotes;
    }

    public double getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(double totalVotes) {
        this.totalVotes = totalVotes;
    }

    public double getDemPer() {
        return demPer;
    }

    public void setDemPer(double per_dem) {
        this.demPer = per_dem;
    }

    public double getGopPer() {
        return gopPer;
    }

    public void setGopPer(double per_gop) {
        this.gopPer = per_gop;
    }

    public double getDifference() {
        return difference;
    }

    public void setDifference(double diff) {
        this.difference = diff;
    }

    public double getPerPointDifference() {
        return perPointDifference;
    }

    public void setPerPointDifference(double per_point_diff) {
        this.perPointDifference = per_point_diff;
    }

    public String getState() {
        return state;
    }

    public void setState(String state_abbr) {
        this.state = state_abbr;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county_name) {
        this.county = county_name;
    }

    public double getCombinedFips() {
        return combinedFips;
    }

    public void setCombinedFips(double combined_fips) {
        this.combinedFips = combined_fips;
    }


    @Override
    public String toString() {
        return "ElectionResult{" +
                "votes_dem=" + demVotes +
                ", votes_gop=" + gopVotes +
                ", total_votes=" + totalVotes +
                ", per_dem=" + demPer +
                ", per_gop=" + gopPer +
                ", diff=" + difference +
                ", per_point_diff=" + perPointDifference +
                ", state_abbr=" + state +
                ", county_name=" + county +
                ", combined_fips=" + combinedFips +
                '}';
    }

}


