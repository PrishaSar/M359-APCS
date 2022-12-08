package Unit6A_rrays.TriviaLab;

import java.io.FileNotFoundException;
import java.util.Scanner;
public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {
        TriviaGame mystery = new TriviaGame("labQuestions.txt", "Mystery");
        startGame(mystery);
    }

    public static void startGame(TriviaGame trivia){
        Scanner gamePlay = new Scanner(System.in);
        System.out.println("Welcome to the " + trivia.getTriviaName() + "! What's your name?");
        String playerName = gamePlay.nextLine();
        System.out.println("Hello" + playerName + "! To play, read the question and make your best guess.");
        System.out.println("When you have one, type the letter you choose. The game ends when you tell it to or after you finish all the questions.");
        System.out.println("Let's start!\n");
        boolean keepPlaying = true;
        while (keepPlaying){
            //pick & display question method here
        }
        //end game method here
    }

    public static void oneRound(TriviaGame trivia){
        Question q = trivia.getRandQues();
        System.out.println(q);
    }
}
