package Unit7ArrayList.Ticketmaster;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMaster {
    private ArrayList<Show> shows = new ArrayList<Show>();

    public TicketMaster() {
    }

    /**
     * toString() formats a table that gives reader all the available shows in the ticketmaster
     * @return - a string that shows all the shows' information
     */
    public String toString(){
        String out = "Date\t\tPrice\t\tQty\t\tPerformer\t\t\tCity\n------------------------------------------------------------\n";
        for(Show s: shows){
            out += s;
        }
        return out;
    }

    /**
     * toString() formats a table that gives reader all the available shows in a given array
     * @param showList - an arrayList of shows that need to be formatted
     * @return - a string that shows all the shows' information
     */

    public String toString(ArrayList<Show> showList){
        String out = "Date\t\tPrice\t\tQty\t\tPerformer\t\t\tCity\n------------------------------------------------------------\n";
        for(Show s: showList){
            out += s;
        }
        return out;
    }

    /**
     * readFile() reads a file with information with shows and creates show objects for each show.
     * It then adds these shows to the ticketMaster object.
     * @param fn - a string that is the name of the file that needs to be read
     * @throws FileNotFoundException
     */
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

    /**
     * menuOption() formats a string that gives the reader all the options for the kiosk
     * @return - the formatted string
     */
    public String menuOption(){
        String out = "\n1. Search by City\n2. Sort by Performer (A-Z)\n3. Sort by Performer (Z-A)";
        out += "\n4. Sort by Price (low - high)\n5. Sort by Price (high - low)\n" +
                "6. Quit\n\nEnter a value between 1 and 6";
        return out;
    }

    /**
     * sortByCity() searches the shows array for shows
     * that occur in a specified city and adds them to a separate array list.
     * @param city - A String that is the name of the city that is being searched for
     * @return - an ArrayList that contains available shows in a city.
     */
    public ArrayList<Show> sortByCity(String city){
        ArrayList<Show> showsInCity = new ArrayList<Show>();
        for(Show s: shows){
            if(s.getCity().equalsIgnoreCase(city)){
                showsInCity.add(s);
            }
        }
        return showsInCity;
    }

}
