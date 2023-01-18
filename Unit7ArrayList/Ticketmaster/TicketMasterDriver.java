package Unit7ArrayList.Ticketmaster;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        TicketMaster tM = new TicketMaster();
        tM.readFile("showData.txt");
        System.out.println(tM);
        Scanner user = new Scanner(System.in);

        String out = "\t\t\t\t\t**** Welcome to the Ticket Master Kiosk ****";
        out += "You may search our shows by city as well as by performer and ticket price.\n";
        out += "Simply select the correct option corresponding with your choice.";
        System.out.println(out);

        boolean repeat = true;
        while(repeat){
            System.out.println("");

        }
    }
}
