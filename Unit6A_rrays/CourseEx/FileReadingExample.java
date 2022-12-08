package Unit6A_rrays.CourseEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileReadingExample {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("studentScheduleData.txt");
        Scanner fileIn = new Scanner(myFile);
        //find number of students in the file
        int numOfStud = fileIn.nextInt(); //6
        fileIn.nextLine(); //dummy read for new line after #

        //create an array of student objects to store in our class
        Student[] studs = new Student[numOfStud];

        for(int i = 0; i < numOfStud; i++) {

            String stud = fileIn.nextLine();
            Course[] sched = new Course[8];

            for (int s = 0; s < 8; s++) {
                String teacher = fileIn.nextLine();
                String cl = fileIn.nextLine();
                String grade = fileIn.nextLine();
                int per = fileIn.nextInt();
                if (fileIn.hasNextLine()) {
                    fileIn.nextLine();                //dummy read to clear new line after #
                    }

                Course myCourse = new Course(teacher, cl, grade, per);
                sched[s] = myCourse;
            }

            //now create student object

            Student curStudent = new Student(stud, sched);
            studs[i] = curStudent;

        }

        //now go and display all those students
        for(Student a: studs){
            System.out.println(a);
        }


    }
}
