package Unit3_Boolean_If_Statements;

public class Review {
    //instance
    private String business;
    private String reviewer;
    private int rating;
    //constructors
    public Review(String reviewer, String business, int rating){
        this.business = business;
        this.reviewer = reviewer;
        this.rating = rating;
    }

    //getters and setters
    public String getBuisness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    //methods
    public String toString(){
        String output = "" + reviewer + ", " + business + ", " + rating;
        if(rating == 1){
            output += "\n\t** Strongly Discouraged";
        }
        else if (rating == 5){
            output += "\n\t** Highly Encouraged";
        }
        output+="\n";
        return output;
    }
}
