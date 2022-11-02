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

    // constructor
    public Show(int runTime, Acts act1, Acts act2, Acts act3, boolean isWeekend, boolean isEvening) {
        this.act1 = act1;
        this.act2 = act2;
        this.act3 = act3;
        this.runTime = setRunTime();
        this.timeRemaining = this.runTime;
        this.isWeekend = isWeekend;
        this.isEvening = isEvening;
    }

    /**
     *
     * @return
     */
    private int setRunTime(){
        int totalRun = 5;
        totalRun += act1.getRunTime() + act2.getRunTime() + act3.getRunTime();
        totalRun += 5;
        if(totalRun > 80){
            totalRun += 10;
        }
        runTime = totalRun;
        timeRemaining = totalRun;
        return totalRun;
    }

    /**
     * Runs an act in the show and updates the counter that keeps track of how many minutes are left until
     * the whole show end. It also shows
     * @param act
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
