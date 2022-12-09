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
        System.out.println("Hello " + playerName + "! To play, read the question and make your best guess.");
        System.out.println("When you have one, type the letter you choose. The game ends when you tell it to or after you finish all the questions.");
        System.out.println("Let's start!\n");
        boolean keepPlaying = true;
        while (keepPlaying && trivia.getQsPlayed() < trivia.getQs().length){
            oneRound(trivia, gamePlay);
            System.out.println("Would you like to keep playing? (yes/no)");
            if(gamePlay.nextLine().equalsIgnoreCase("n")
                    || gamePlay.nextLine().equalsIgnoreCase("no")){
                keepPlaying = false;
            }
        }
        System.out.println("We hope you enjoyed playing the " + trivia.getTriviaName() + " trivia!");
        System.out.println(trivia.getStats());

    }

    public static void oneRound(TriviaGame trivia, Scanner userinput){
        Question q = trivia.getRandQues();
        q.setHasBeenUsed(true);
        System.out.println(q);
        System.out.println("What is your guess?");
        String userAnswer = userinput.nextLine();
        if(userAnswer.equalsIgnoreCase(q.getAns())){
            correctAns(q, trivia);
        }
        else{
            incorrectAns(q, trivia);
        }
        trivia.setQsPlayed(trivia.getQsPlayed() + 1);
    }

    private static void correctAns(Question q, TriviaGame trivia){
        System.out.println("Your answer, " + q.getAns() + ", is correct!");
        System.out.println("You won " + q.getPoints() + " point(s).");
        trivia.setPoints(trivia.getPoints() + q.getPoints());
        trivia.setStreak(trivia.getStreak() + 1);
        trivia.setCorrect(trivia.getCorrect() + 1);
    }

    private static void incorrectAns(Question q, TriviaGame trivia){
        System.out.println("Your answer is incorrect.\nThe correct answer is " + q.getAns() + ".");
        double pointsLost = (double)q.getPoints()/2;
        System.out.println("You lost " + pointsLost + " points.");
        trivia.setPoints(trivia.getPoints() - pointsLost);
        trivia.setStreak(0);
        System.out.println("Total points: " + trivia.getPoints());
        System.out.println("Answer Streak: " + trivia.getStreak());
    }

}
