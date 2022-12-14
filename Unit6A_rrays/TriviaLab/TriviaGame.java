package Unit6A_rrays.TriviaLab;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TriviaGame {
    private Question[] qs;
    private int correct;
    private double points;
    private int streak;
    private int qsPlayed;
    private String fileName;

    private String triviaName;

    private int betting;

    public TriviaGame(String fileName, String triviaName) throws FileNotFoundException {
        this.fileName = fileName;
        this.readTextFile(fileName);
        this.triviaName = triviaName;
        this.correct = 0;
        this.points = 0;
        this.streak = 0;
        this.qsPlayed = 0;
        this.betting = 0;
    }

    /**
     * This function reads a text file and creates the question array.
     * @param fileName - the name & location of the file that contains the questions
     * @throws FileNotFoundException
     */
    private void readTextFile(String fileName) throws FileNotFoundException {
        //get file
        File trivia = new File(fileName);
        Scanner fileSc = new Scanner(trivia);
        //find number of questions
        int numQues = fileSc.nextInt();
        qs = new Question[numQues];
        //read a question
        for(int i = 0; i < numQues; i++){
            fileSc.nextLine();
            //find question
            String question = fileSc.nextLine();
            String[] answers = new String[4];
            //find answer choices
            for(int a = 0; a < answers.length; a ++){
                answers[a] = fileSc.nextLine();
            }
            String correctAns = fileSc.nextLine();
            int points = fileSc.nextInt();
            Question curQuestion = new Question(question, answers, correctAns, points);
            qs[i] = curQuestion;
        }
    }

    /**
     * This function picks a random question from the array of questions for a round by generating a random index.
     * @return - the question picked
     */
    public Question getRandQues(){
        int index = (int)(Math.random() * qs.length);
        while(qs[index].isHasBeenUsed()){
            index = (int)(Math.random() * qs.length);
        }
        return qs[index];
    }

    /**
     * this function returns stats for the end of the game (total points, correct answers, percentage correct),
     * including telling the reader how good they are at the questions.
     * @return - a String with the stats
     */
    public String getStats(){
        String stats = "Total points: " + points + "\nCorrect Answers: " + correct;
        double percentage = (double)correct/qsPlayed * 100;
        stats += "\nPercentage Correct: " + percentage + "\n";
        if(percentage < 50){
            stats += "You are not a very good mystery solver ... ";
        }
        else if (percentage < 70){
            stats += "You can do better, but good job on getting some of those!";
        }
        else if (percentage < 90){
            stats += "Good game! Keep it up!";
        }
        else if (percentage < 99){
            stats += "Wow! Keep it up, and you may be able to be a game master one day!";
        }
        else{
            stats += "Wow.... are you part of the FBI?";
        }
        return stats;
    }

    /**
     * This function resets all the trivia stats to 0,
     * and turns the questions' hasBeenUsed boolean instance variables to false.
     */
    public void reStart(){
        this.correct = 0;
        this.points = 0;
        this.streak = 0;
        this.qsPlayed = 0;
        this.betting = 0;
        for(Question q: qs){
            q.setHasBeenUsed(false);
        }
    }

    public double pointGain(Question q, boolean won){
        int wonPoints = 0;
        if(won){
            if(points <= 0){
                return 2 - points;
            }
            return q.getPoints() + betting * 2;

        }
        else{
            return (double)q.getPoints()/2 + betting * 2;
        }
    }
    public Question[] getQs() {
        return qs;
    }

    public void setQs(Question[] qs) {
        this.qs = qs;
    }

    public String getTriviaName() {
        return triviaName;
    }

    public void setTriviaName(String triviaName) {
        this.triviaName = triviaName;
    }

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public int getStreak() {
        return streak;
    }

    public void setStreak(int streak) {
        this.streak = streak;
    }

    public int getQsPlayed() {
        return qsPlayed;
    }

    public void setQsPlayed(int qsPlayed) {
        this.qsPlayed = qsPlayed;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.readTextFile(fileName);
    }

    public int isBetting() {
        return betting;
    }

    public void setBetting(int betting) {
        if (betting > points){
            this.betting = (int)points;
        }
        else if(betting < 0){
            this.betting = 0;
        }
        else{
            this.betting = betting;
        }
    }
}
