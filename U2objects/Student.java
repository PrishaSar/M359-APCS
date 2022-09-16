package U2objects;

public class Student {
    //instance variables
    //new data type: string
    private String name;
    private int gradeLevel;
    private double gpa;

    //constructor
    public Student(String studName, int studGradeLevel, double studGpa){
        name = studName;
        gradeLevel = studGradeLevel;
        gpa = studGpa;
    }

    //but if only name is given? (contructor)
    public Student(String studName){
        name = studName;
        
        gradeLevel = 9;
        gpa = -1;
    }

    //methods:
    public void printInfo(){
        System.out.println("Name: " + name + "\nGrade: "+ gradeLevel + "\nGPA:" + gpa);
        System.out.println();
    }

    public void setGradeLevel(int newGradeLevel){
        gradeLevel = newGradeLevel;
    }

    public int getGradeLevel(){
        return gradeLevel;
    }
}
