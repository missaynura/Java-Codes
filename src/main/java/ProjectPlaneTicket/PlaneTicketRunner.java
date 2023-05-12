package ProjectPlaneTicket;

import java.util.Scanner;

public class PlaneTicketRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to plane ticket booking. Please enter your name...");
        String passengerName = input.nextLine().trim();

        System.out.println("Please enter your last name...");
        String passengerLastName = input.nextLine().trim();

        System.out.println("Please enter your age...");
        String passengerAge = input.nextLine();

        //create if-statement for the options 1 and 2
        System.out.println("Please specify your journey type (one way or return). Press 1 for one way and 2 for return...");
        String routeType = input.nextLine();

        System.out.println("Please enter your flight destination...");
        String flightDestination = input.nextLine();

        System.out.println("Please enter your return destination");
        String returnDestination = input.nextLine();
        //Date
        System.out.println("Please enter your destination travel date...");
        String destinationDate = input.nextLine();
        //Date
        System.out.println("Please enter your return date...");
        String returnDate = input.nextLine();

        System.out.println("Please choose your class type. [F] for \"First Class\", [B] for \"Business Class\", [E] for \"Economy Class\",...");
        String classType = input.nextLine();

        //print 40KG luggage and 8KG hand luggage if the class type is [F],
        // 32KG luggage and 8KG hand luggage if the class type is [B]
        // 20KG luggage and 8KG hand luggage if the class type is [E]
    }

}
