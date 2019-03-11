public class County {
    private String name;
    private int fips;
    private ElectionResults election;
    private EducationResults education;
    private EmploymentResults employment;

    public County(String name, int fips, ElectionResults election, EducationResults education, EmploymentResults employment) {
        this.name = name;
        this.fips = fips;
        this.election = election;
        this.education = education;
        this.employment = employment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFips() {
        return fips;
    }

    public void setFips(int fips) {
        this.fips = fips;
    }

    public ElectionResults getElection() {
        return election;
    }

    public void setElection(ElectionResults election) {
        this.election = election;
    }

    public EducationResults getEducation() {
        return education;
    }

    public void setEducation(EducationResults education) {
        this.education = education;
    }

    public EmploymentResults getEmployment() {
        return employment;
    }

    public void setEmployment(EmploymentResults employment) {
        this.employment = employment;
    }
}
