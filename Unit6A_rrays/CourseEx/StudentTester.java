package Unit6A_rrays.CourseEx;

public class StudentTester {
    public static void main(String[] args) {
        Course per1 = new Course("O'Donnell", "ELA", "A", 1 );
        Course per2 = new Course("McGonagall", "Transfiguration", "A", 2 );
        Course per3 = new Course("Scianna", "Quantum Physics", "A-", 3 );
        Course per4 = new Course("Moon", "Calc B/C", "A-", 4 );
        Course per5 = new Course("Lunch",5 );
        Course per6 = new Course("Hamman", "Psychology", "A", 6 );
        Course per7 = new Course("Moon", "APCSA", "A+", 7);
        Course per8 = new Course("Sponsel", "Adventure", "A+", 8);

        Course[] sched = {per1, per2, per3, per4, per5, per6, per7, per8};
        Student st1 = new Student("Prisha", sched);
        System.out.println(st1);

        per3.setTeacher("Teberg");
        Student st2 = new Student("Isabella", sched);
        System.out.println(st2);
    }
}
