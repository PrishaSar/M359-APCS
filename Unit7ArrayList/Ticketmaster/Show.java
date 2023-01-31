package Unit7ArrayList.Ticketmaster;

public class Show {
    private String date;
    private double price;
    private String person;
    private String city;
    private int qty;

    public Show(String date, double price, int qty, String person, String city) {
        this.date = date;
        this.price = price;
        this.person = person;
        this.city = city;
        this.qty = qty;
    }

    /**
     * toString() formats a string containing all the information for the tickets of a particular show,
     * including the date, price, performer, city, and number of tickets available in a way
     * that it aligns with the header and other show strings.
     * @return - a properly formatted string
     */
    public String toString(){
        String out = date + "\t$" + price + "\t\t" + qty + "\t\t";
        int len = person.length();
        if(len <= 7){
            out += person + "\t\t\t\t";
        }
        else if (len > 15){
            out += person + "\t";
        }
        else if(len > 11){
            out += person + "\t\t";
        }
        else{
            out += person + "\t\t\t";
        }

        out += city + "\n";
        return out;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

}
