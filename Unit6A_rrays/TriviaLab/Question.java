package Unit6A_rrays.TriviaLab;

public class Question {
    private String q;
    private String[] answers = new String[4];
    private String ans;
    private int points;
    private boolean hasBeenUsed;

    public Question(String q, String[] answers, String ans, int points) {
        this.q = q;
        for(int i = 0; i < 4; i++){
            this.answers[i] = answers[i];
        }
        this.ans = ans;
        this.points = points;
        hasBeenUsed = false;
    }

    /**
     * This function creates a string with the properly formatted question.
     * The question will be at the top and
     * each answer choice will be on a different line.
     * @return - the question in form of a string
     */

    public String toString(){
        String question = q + "\n";
        for(String s: answers){
            question += s + "\n";
        }
        return question;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
