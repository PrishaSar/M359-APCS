package Unit7ArrayList.Ticketmaster;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMasterDriver {

    private static final int CITY = 1;
    private static final int PERFORM_A = 2;
    private static final int PERFORM_Z = 3;
    private static final int PRICE_LOW = 4;
    private static final int PRICE_HIGH = 5;
    private static final int QUIT = 6;
    public static void main(String[] args) throws FileNotFoundException {
        TicketMaster tM = new TicketMaster();
        tM.readFile("showData.txt");
        Scanner user = new Scanner(System.in);

        String out = "\t\t\t\t\t**** Welcome to the Ticket Master Kiosk ****\n";
        out += "You may search our shows by city as well as by performer and ticket price.\n";
        out += "\t\tSimply select the correct option corresponding with your choice.";
        System.out.println(out);

        System.out.println(tM.menuOption());
        boolean repeat = true;
        while(repeat){
            int option = validNum(user);
            if(option == QUIT){
                repeat = false;
                user.close();
                System.out.println("Thank you for using our kiosk!\nHave a great day!");
            }
            else{
                System.out.println("You entered option " + option + ".\n");
                if(option == CITY){
                    System.out.println(searchByCity(user, tM));
                }
                else if(option == PERFORM_A){
                    tM.sortByPerformer(true);
                    System.out.println(tM);
                }
                else if(option == PERFORM_Z){
                    tM.sortByPerformer(false);
                    System.out.println(tM);
                }
                else if(option == PRICE_LOW){
                    tM.sortByPriceIncreasing();
                    System.out.println(tM);
                }
                else if(option == PRICE_HIGH){
                    tM.sortByPriceDecreasing();
                    System.out.println(tM);
                }
                    System.out.println(tM.menuOption());
                }
        }
    }

    /**
     * This function get user input on the city they want to find a show in and calls the sortByCity() function
     *      to get an ArrayList of shows in that area. If no shows are found, the user is told so.
     * @param user - the scanner used to read the user's input on the name of the city
     * @param tM - the ticket master object that the shows are being puller from.
     * @return - A String containing the list of shows in the area or a message telling the user there are no shows
     *                  in the area.
     */
    public static String searchByCity(Scanner user, TicketMaster tM){
        System.out.println("Which city do you want to search for?");
        String loc = user.nextLine();
        ArrayList<Show> showsAv = tM.sortByCity(loc);
        if(showsAv.size() == 0){
            return "\nThere are no shows available in " + loc.toUpperCase();
        }
        else{
            return "\nHere are all the shows in " + loc.toUpperCase() + ":\n\n" + tM.toString(showsAv);
        }
    }

    /**
     * This function uses a try-catch loop that keeps asking the user for a
     *      number from 1-6 until they enter valid input.
     * @param user - the Scanner used to find the
     * @return - an integer that contains the option number the user picked.
     */
    public static int validNum(Scanner user){
        boolean incorrect = true;
        while(incorrect){
            try{
                int option = user.nextInt();
                user.nextLine();
                if(option < 1 || option > 6){
                    System.out.println("Please enter a number between 1 and 6.");
                }
                else{
                    incorrect = false;
                    return option;
                }
            }
            catch(Exception e){
                System.out.println("Invalid entry. Please enter a whole number between 1 and 6.");
                user.nextLine();
            }
        }
        return 0;
    }


}
