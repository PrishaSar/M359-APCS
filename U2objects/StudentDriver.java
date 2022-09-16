package U2objects;

public class StudentDriver {
    public static void main(String[] args) {
        System.out.println("hello");

        Student a = new Student("Mike", 11, 3.78);
        Student b = new Student("Varsha");

        //but how do you grab the Student object?
        a.printInfo();
        b.printInfo();

        a.setGradeLevel(12);
        a.printInfo();

        System.out.println(a.getGradeLevel());
    }
}
