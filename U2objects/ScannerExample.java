package U2objects;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt user for name
        System.out.println("What is your name?");
        String name = input.nextLine();

        //Prompt user for age
        System.out.println("What is your age?");
        int age = input.nextInt();

        //promt user for gpa
        System.out.println("What is your GPA?");
        double gpa = input.nextDouble();

        //Print summary
        System.out.println("Your name is:" + name);
        System.out.println("Your age is:" + age);
        System.out.println("Your GPA is:" + gpa);

}
}



