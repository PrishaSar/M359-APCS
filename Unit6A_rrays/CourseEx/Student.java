package Unit6A_rrays.CourseEx;

public class Student {
    private String name;
    private Course[] classes;

    //full constructor
    public Student (String name, Course[] classes){
        //copy name
        this.name = name;
        //copy courses
        this.classes = new Course[classes.length];
        for (int i = 0; i <classes.length; i++){
            this.classes[i] = new Course(classes[i].getTeacher(), classes[i].getSubject(),
                    classes[i].getCurGrade(), classes[i].getPeriod());
        }
    }

    //toString that returns string with students name with all periods
    public String toString(){
        String output = "Student: " + name + "\n";
        for(int i = 0; i < classes.length; i++){
            output += classes[i];
        }
        return output;
    }
}
