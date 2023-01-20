package Unit7ArrayList.Ticketmaster;

import java.io.FileNotFoundException;
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
//        System.out.println(tM);
        Scanner user = new Scanner(System.in);

        String out = "\t\t\t\t\t**** Welcome to the Ticket Master Kiosk ****\n";
        out += "You may search our shows by city as well as by performer and ticket price.\n";
        out += "\t\tSimply select the correct option corresponding with your choice.";
        System.out.println(out);
        System.out.println(tM.menuOption());
        boolean repeat = true;
        while(repeat){
            try{
                int option = user.nextInt();
                if(option < 1 || option > 6){
                    System.out.println("Please enter a number between 1 and 6.");
                }
                else if(option == QUIT){
                    repeat = false;
                    System.out.println("Thank you for using our kiosk!\nHave a great day!");
                }
                else{
                    System.out.println("You entered option " + option + ".\n");
                    if(option == CITY){
                        System.out.println("Which city do you want to search for?");
                        try {
                            String loc = user.nextLine();
                        }
                        catch(Exception e){

                        }
                    }
                    else if(option == PERFORM_A){

                    }
                    else if(option == PERFORM_Z){

                    }
                    else if(option == PRICE_LOW){

                    }
                    else if(option == PRICE_HIGH){

                    }
                    System.out.println(tM.menuOption());
                }
            }
            catch(Exception e){
                System.out.println("Invalid entry. Please enter a whole number between 1 and 6.");
                user.nextLine();
            }
        }
        user.nextLine();
    }
}
