package Unit5WritingClasses.PartnerLab;

public class Show {
    // instance variables
    private int runTime;
    private Acts act1;
    private Acts act2;
    private Acts act3;
    private boolean isWeekend;
    private boolean isEvening;
    private int timeRemaining;

    /**
     * Full constructor for a show
     * @param act1 - An Act object that is part of the show and contributes to the show's runTime. It must be more than 10 minutes long.
     * @param act2 - The second Act object that is part of the show and contributes to the show's runTime. It must be more than 10 minutes long.
     * @param act3 - The third Act object that is part of the show and contributes to the show's runTime. It must be more than 10 minutes long.
     * @param isWeekend - a boolean that is true if the show takes place on the weekend.
     * @param isEvening - a boolean that is true if the show takes place in the evening.
     */
    public Show(Acts act1, Acts act2, Acts act3, boolean isWeekend, boolean isEvening) {
        this.act1 = act1;
        this.act2 = act2;
        this.act3 = act3;
        this.runTime = setRunTime();
        this.timeRemaining = this.runTime;
        this.isWeekend = isWeekend;
        this.isEvening = isEvening;
    }

    /**
     * This function calculates the entire run time of the show by getting the times of each of the acts
     * adds 10 extra minutes for the opening and closing of the show.
     * if the show is longer than an hour and a half, add an intermission, which takes 10 minutes
     * @return - totalRun, the total time in minutes of the show
     */
    private int setRunTime(){
        int totalRun = 5;
        totalRun += act1.getRunTime() + act2.getRunTime() + act3.getRunTime();
        totalRun += 5;
        if(totalRun > 90){
            totalRun += 10;
        }
        runTime = totalRun;
        timeRemaining = totalRun;
        return totalRun;
    }

    /**
     * Runs an act in the show and updates the counter that keeps track of how many minutes are left until
     * the whole show ends. When the act runs, it changes the act boolean variable hasBeenShown to true.
     * If the entire show is over, set all the act boolean variables to false again.
     *
     * @param act - the Act that has just finished.
     */
    public void runAct(Acts act){
        timeRemaining -= act.getRunTime();
        act.setHasBeenShown(true);
        if(timeRemaining < 20){
            act1.setHasBeenShown(false);
            act2.setHasBeenShown(false);
            act3.setHasBeenShown(false);
        }
    }


    /**
     *This calculates the approximate revenue earned from a show (in hundreds), depending on the popularity
     * of each eact in the show and the time of the week the show takes place. 
     * The higher the popularity, the more revenue.
     * If the show is on a weekened or in the evening, the revenue increases.
     * @return - returns the approximate revenue earned from a show (in hundreds)
     */
    public int calcRevenue(){
        int rev = 0;
        rev += this.act1.getPopularity() + this.act2.getPopularity() + this.act3.getPopularity();
        if (this.isEvening()){
            rev += 5;
        }
        if(this.isWeekend()){
            rev += 6;
        }
        return rev;
    }

    // getters and setters
    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public boolean isEvening() {
        return isEvening;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setEvening(boolean evening) {
        isEvening = evening;
    }

    public Acts getAct1() {
        return act1;
    }

    public void setAct1(Acts act1) {
        this.act1 = act1;
    }

    public Acts getAct2() {
        return act2;
    }

    public void setAct2(Acts act2) {
        this.act2 = act2;
    }

    public Acts getAct3() {
        return act3;
    }

    public void setAct3(Acts act3) {
        this.act3 = act3;
    }

    public int getTimeRemaining() {
        return timeRemaining;
    }
}
