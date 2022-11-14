//Isabella Chen, Prisha Saraiya, Mr. Moon, period 7
//Purpose of Class: To create an act and keep track of the people in it.
package Unit5WritingClasses.PartnerLab;

public class Acts {
    // instance variables
    private String type;
    private int runTime;
    private double popularity;
    private boolean hasBeenShown;
    private People person1;
    private People person2;
    private People person3;
    private int numPeople;

    private static int totalRunTime = 0;

    /**
     * This function returns the total runtime in minutes of all the acts created.
     * @return - static variable totalRunTime
     */
    public static int getTotalRunTime(){
        return totalRunTime;
    }

    // constructor
    public Acts(String type, int runTime, double popularity, People person1, People person2, People person3) {
        this.type = type;
        this.runTime = runTime;
        totalRunTime += runTime;
        this.popularity = popularity;
        this.hasBeenShown = false;
        this.person1 = person1;
        this.person2 = person2;
        this.person3 = person3;
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
        totalRunTime -= this.runTime;
        this.runTime = runTime;
        totalRunTime += this.runTime;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
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
