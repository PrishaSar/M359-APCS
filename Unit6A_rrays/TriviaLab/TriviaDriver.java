package Unit6A_rrays.TriviaLab;

import U2objects.ScannerExample;

import java.io.FileNotFoundException;
import java.util.Scanner;
public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {
        TriviaGame mystery = new TriviaGame("labQuestions.txt", "Mystery");
        Scanner gamePlay = new Scanner(System.in);
        System.out.println("Welcome to the " + mystery.getTriviaName() + " Trivia Game! What's your name?");
        String playerName = gamePlay.nextLine();
        System.out.println("Hello " + playerName + "! To play, read the question and make your best guess.");
        System.out.println("When you have one, type the letter you choose. The game ends when you tell it to or after you finish all the questions.");
        System.out.println("Let's start!\n");
        startGame(mystery, gamePlay);
    }

    /**
     * This function runs the general game play.
     * @param trivia - a TriviaGame object that contains all the questions.
     */
    public static void startGame(TriviaGame trivia, Scanner gamePlay){
        boolean keepPlaying = true;
        while (keepPlaying && trivia.getQsPlayed() < trivia.getQs().length){
            oneRound(trivia, gamePlay);
            System.out.println("Would you like to keep playing? (yes/no)");
            String play = gamePlay.nextLine();
            if(play.equalsIgnoreCase("n")
                    || play.equalsIgnoreCase("no")){
                keepPlaying = false;
            }
            System.out.println();
        }
        System.out.println("We hope you enjoyed playing the " + trivia.getTriviaName() + " trivia!");
        System.out.println(trivia.getStats());
        System.out.println("\nWould you like to play again? (y/n)");
        String reStart = gamePlay.nextLine();
        if(reStart.equalsIgnoreCase("y")
                || reStart.equalsIgnoreCase("yes")){
            trivia.reStart();
            startGame(trivia, gamePlay);
        }

    }

    /**
     * This function simulates one round of answering questions, displaying the question, getting an answer,
     * and displaying corresponding stats. It also upadates the number of questions played by one.
     * @param trivia - The trivia game the questions are being pulled from
     * @param userinput - the user's answer Scanner, to see what they put down as a guess.
     */
    public static void oneRound(TriviaGame trivia, Scanner userinput){
        System.out.println("Do you want to wager your points? If you win, you get double the points!\n " +
                "You can only wager the amount of points you have. If this is your first round, type 0.\n" +
                "(If you are at or below 0, the total game points become 2)\n How many points? (if none, type 0)");
        trivia.setBetting(userinput.nextInt());
        userinput.nextLine();
        Question q = trivia.getRandQues();
        q.setHasBeenUsed(true);
        System.out.println(q);
        System.out.println("What is your guess?");
        String userAnswer = userinput.nextLine();
        System.out.println();
        if(userAnswer.equalsIgnoreCase(q.getAns())){
            correctAns(q, trivia);
        }
        else{
            incorrectAns(q, trivia);
        }
        System.out.println();
        trivia.setQsPlayed(trivia.getQsPlayed() + 1);
    }

    /**
     * This function displays the stats and message for a correct answer.
     * @param q - the question the user just answered
     * @param trivia - the Trivia game the user is playing on
     */
    private static void correctAns(Question q, TriviaGame trivia){
        System.out.println("Your answer, " + q.getAns() + ", is correct!");
        double pointsWon = trivia.pointGain(q, true);
        System.out.println("You won " + pointsWon + " point(s).");
        trivia.setPoints(trivia.getPoints() + pointsWon);
        trivia.setStreak(trivia.getStreak() + 1);
        trivia.setCorrect(trivia.getCorrect() + 1);
        System.out.println("Total points: " + trivia.getPoints());
        System.out.println("Answer Streak: " + trivia.getStreak());
    }

    /**
     * This function displays the stats and message for an incorrect answer.
     * @param q - the question the user just answered
     * @param trivia - the Trivia game the user is playing on
     */
    private static void incorrectAns(Question q, TriviaGame trivia){
        System.out.println("Your answer is incorrect.\nThe correct answer is " + q.getAns() + ".");
        double pointsLost = trivia.pointGain(q,false);
        System.out.println("You lost " + pointsLost + " points.");
        trivia.setPoints(trivia.getPoints() - pointsLost);
        trivia.setStreak(0);
        System.out.println("Total points: " + trivia.getPoints());
        System.out.println("Answer Streak: " + trivia.getStreak());
    }

}
