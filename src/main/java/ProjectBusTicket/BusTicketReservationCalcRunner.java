package ProjectBusTicket;

import java.util.Scanner;

public class BusTicketReservationCalcRunner {
    public static void main(String[] args) {

    }

    //------------------- Bus Ticket Reservation Calculator Runner Class ---------------------

    public static void start() {
        System.out.println("Welcome to the Bus Ticket Reservation Portal!");
        System.out.println("Enter the destination distance in KM:");

        Scanner input = new Scanner(System.in);
        Integer destinationKM = input.nextInt();
        int ticketType;
        boolean ticketTypeExists;

        //test if ticket type is being entered correctly, if not warning error
        do {
            System.out.println("Choose the type of trip:");
            System.out.println("Enter 1 for One-Way\n 2 for Round-Trip");
            ticketType = input.nextInt();
            ticketTypeExists = ticketType == 1 || ticketType == 2;
            if (!ticketTypeExists) {
                System.out.println("You have entered incorrectly. Enter 1 for One-Way\n 2 for Round-Trip");
            }
        } while (!ticketTypeExists);
    }
}
