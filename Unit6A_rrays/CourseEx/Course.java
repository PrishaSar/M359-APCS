package Unit6A_rrays.CourseEx;

public class Course {
    private String teacher;
    private String subject;
    private String curGrade;
    private int period;

    //Full constructor
    public Course(String teacher, String subject, String curGrade, int period){
        this.teacher = teacher;
        this.subject = subject;
        this.curGrade = curGrade;
        this.period = period;
    }
    //constructor w/o teacher or grade (lunch, study hall)
    public Course(String subject, int period){
        this.teacher = "N/A";
        this.subject = subject;
        this.curGrade = "N/A";
        this.period = period;
    }

    //toString that returns course data on one line (new line at the end)
    public String toString(){
        return "Period " + period + "\t" + subject + " - " + teacher + "\tGrade: " + curGrade + "\n";
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCurGrade() {
        return curGrade;
    }

    public void setCurGrade(String curGrade) {
        this.curGrade = curGrade;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
