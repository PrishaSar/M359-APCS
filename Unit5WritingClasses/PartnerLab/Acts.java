package Unit5WritingClasses.PartnerLab;

public class Acts {
    // instance variables
    String type;
    private int runTime;
    private int popularity;
    private boolean hasBeenShown;
    private People person1;
    private People person2;
    private People person3;
    private int numPeople;

    // constructor
    public Acts(String type, int runTime, int popularity, boolean hasBeenShown, People person1, People person2, People person3) {
        this.type = type;
        this.runTime = runTime;
        this.popularity = popularity;
        this.hasBeenShown = hasBeenShown;
        this.person1 = new People(person1.getSkill(), person1.getName(), person1.isBackstage());
        this.person2 = new People(person2.getSkill(), person2.getName(), person2.isBackstage());
        this.person3 = new People(person3.getSkill(), person3.getName(), person3.isBackstage());
        numPeople = getNumPeople();
    }

    /**
     * Calculates the number of people performing in the show
     * @return People performing
     */
    public int getNumPeople(){
        int count = 0;
        if (person1.getName().equals("N/A")){
            count++;
        }
        if (person2.getName().equals("N/A")){
            count++;
        }
        if (person3.getName().equals("N/A")){
            count++;
        }
        return 3 - count;
    }

    // getters and setters
    public String getType() {
        return type;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public boolean isHasBeenShown() {
        return hasBeenShown;
    }

    public void setHasBeenShown(boolean hasBeenShown) {
        this.hasBeenShown = hasBeenShown;
    }

    public People getPerson1() {
        return person1;
    }

    public void setPerson1(People person1) {
        this.person1 = person1;
        numPeople = getNumPeople();
    }

    public People getPerson2() {
        return person2;
    }

    public void setPerson2(People person2) {
        this.person2 = person2;
        numPeople = getNumPeople();
    }

    public People getPerson3() {
        return person3;
    }

    public void setPerson3(People person3) {
        this.person3 = person3;
        numPeople = getNumPeople();
    }
}
