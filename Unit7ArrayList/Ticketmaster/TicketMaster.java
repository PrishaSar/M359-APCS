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

    public static String menuOption(){
        String out = "\t\t\t\t\t**** Welcome to the Ticket Master Kiosk ****";
        return out;
    }
}
