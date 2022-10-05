package Unite4_loops;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = (int)(Math.random()*1000) + 1;
        int count = 0;
        boolean wrong = true;
        while(wrong){
            count++;
            System.out.println("Guess a number from 1 - 1000.");
            int guess = input.nextInt();
            input.nextLine();
            if(guess < num){
                System.out.println("Your guess is too small.");
            }
            else if(guess > num){
                System.out.println("Your guess is too big.");
            }
            else{
                wrong = false;
                System.out.println("Correct! You got it right in " + count + " tries!");
            }
        }

    }
}
