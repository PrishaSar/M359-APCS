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
}
