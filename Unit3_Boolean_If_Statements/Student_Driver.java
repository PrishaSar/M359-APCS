package Unit3_Boolean_If_Statements;

public class Student_Driver {
    public static void main(String[] args) {
        Student a = new Student("hello", "me", 2934);
        Student b = new Student("ho", "e", 234534);

        int comp = a.studCompareTo(b);

        System.out.println(comp);
    }

}
