package Unit3_Boolean_If_Statements.ShoeCourseJUnitEx;

public class Course {
    private String classTitle;
    private int numStudentEnrolled;
    private String teacherName;

    public Course(String classTitle, int numStudentEnrolled, String teacherName) {
        this.classTitle = classTitle;
        this.numStudentEnrolled = numStudentEnrolled;
        this.teacherName = teacherName;
    }

    public String getClassTitle() {
        return classTitle;
    }

    public void setClassTitle(String classTitle) {
        this.classTitle = classTitle;
    }

    public int getNumStudentEnrolled() {
        return numStudentEnrolled;
    }

    public void setNumStudentEnrolled(int numStudentEnrolled) {
        this.numStudentEnrolled = numStudentEnrolled;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public boolean equals(Course other){
        if(this.classTitle.equals(other.classTitle) && this.numStudentEnrolled == other.numStudentEnrolled){
            return true;
        }
        else{
            return false;
        }
    }

    public int compareTo(Course other){
        int result = this.classTitle.compareTo(other.classTitle);
        if(result == 0){
            double stud = this.numStudentEnrolled - other.numStudentEnrolled;
            if (stud < 0){
                return (int)stud -1;
            }
            else if(stud > 0){
                return (int)stud + 1;
            }
            else{
                return 0;
            }
        }
        else {
            return result;
        }
    }
}
