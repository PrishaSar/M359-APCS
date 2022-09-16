package U2objects;

import java.util.Scanner;

public class MathExample {
    /*
     * Prisha Saraiya
     * Mr.Moon - Period 7
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //PART 1
        System.out.println("Enter x1: ");
        int x1 = input.nextInt();

        System.out.println("Enter y1: ");
        int y1 = input.nextInt();

        System.out.println("Enter x2: ");
        int x2 = input.nextInt();

        System.out.println("Enter y2: ");
        int y2 = input.nextInt();

        double dist = Math.sqrt(Math.pow(y1-y2,2) + Math.pow(x1-x2,2));

        System.out.println("The distance between (" + x1 + ", " + y1 + ") and ("+ x2 + ", " + y2 + ") is " + dist + ".");


        //PART 2
        System.out.println("Enter the maximum possible integer value.");
        int max = input.nextInt();

        System.out.println("Enter the minimum possible integer value.");
        int min = input.nextInt();

        int randomNum = (int)(Math.random() * (max - min + 1)) + min;
        System.out.println("A random number between " + min + " and " + max + " is " + randomNum + ".");

        //PART 3
        System.out.println("Write a number.");
        int num = input.nextInt();
        System.out.println("The absolute value of " + num+ " is " +Math.abs(num));

        System.out.println("The same number to the fourth power is " + Math.pow(num, 4));

        System.out.println("Between " + num + "and 5, the smaller number is " + Math.min(num, 5));

        System.out.println("The higher number is " + Math.max(num, 5));



    }
}
