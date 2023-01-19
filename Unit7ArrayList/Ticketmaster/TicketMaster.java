package Unit7ArrayList.Ticketmaster;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMaster {
    private ArrayList<Show> shows = new ArrayList<Show>();

    public TicketMaster() {
    }

    public String toString(){
        String out = "Date\t\tPrice\t\tQty\t\tPerformer\t\t\tCity\n------------------------------------------------------------\n";
        for(Show s: shows){
            out += s;
        }
        return out;
    }

    public void readFile (String fn) throws FileNotFoundException {
        Scanner fileReader = new Scanner(new File(fn));
        //make sure file has a next line before continuing
        while(fileReader.hasNextLine()){
            String date = fileReader.next();
            double price = fileReader.nextDouble();
            int qty = fileReader.nextInt();
            String temp = fileReader.nextLine();
            int ind = temp.indexOf(",");
            String name = temp.substring(0, ind);
            String city = temp.substring(ind + 1);
            Show newShow = new Show(date, price, qty, name, city);
            shows.add(newShow);
        }
    }

    public String menuOption(){
        String out = "\n1. Search by city\n2. Sort by Performer (A-Z)\n3. Sort by Performer (Z-A)";
        out += "\n4. Sort by Price (low - high)\n5. Sort by Price (high - low)\n" +
                "6. Quit\n\nEnter a value between 1 and 6";
        return out;
    }

    public ArrayList<Show> sortByCity(String city){
        return shows;
    }

}
