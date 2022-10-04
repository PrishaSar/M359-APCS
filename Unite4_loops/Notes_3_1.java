package Unite4_loops;
import java.util.Scanner;
public class Notes_3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isDone = true;
        int count = 0;
        int scores = 0;

        while (!isDone){
            //prompt user if new number
            System.out.println("Do you have a new number to enter? (type y/n)");
            String reply = input.nextLine();
            if(reply.equalsIgnoreCase("y")){
                count ++;
                System.out.println("What is it? (type int)");
                int num = input.nextInt();
                scores += num;
            }
            else{
                isDone = true;
            }
        }
        System.out.println("Your average is: " + (scores/count));

    }
}
