package Unit6A_rrays.CourseEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileReadingExample {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("oneSchedule.txt");
        Scanner fileIn = new Scanner(myFile);

        String stud = fileIn.nextLine();
        Course[] sched = new Course[8];

        for(int i = 0; i<8; i++){
            String teacher = fileIn.nextLine();
            String cl = fileIn.nextLine();
            String grade = fileIn.nextLine();
            int per = fileIn.nextInt();
            if (fileIn.hasNextLine()) {
                fileIn.nextLine();                //dummy read to clear new line after #
            }

            Course myCourse = new Course(teacher, cl, grade, per);
            sched[i] = myCourse;
        }

        for(Course c: sched){
            System.out.println(c);
        }

//        Student Molly = new Student(stud, sched);

    }
}
