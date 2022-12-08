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

    public TriviaGame(String fileName, String triviaName) throws FileNotFoundException {
        this.fileName = fileName;
        this.readTextFile(fileName);
        this.triviaName = triviaName;
        this.correct = 0;
        this.points = 0;
        this.streak = 0;
        this.qsPlayed = 0;
    }

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

    public Question getRandQues(){
        int index = (int)(Math.random() * qs.length);
        return qs[index];
    }

    public String getQs() {
        String out = "\n";
        for(Question q: qs){
            out += q;
            out += "\n";
        }
        return out;
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
}
