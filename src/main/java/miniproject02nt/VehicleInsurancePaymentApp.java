package miniproject02nt;

import java.util.Scanner;

public class VehicleInsurancePaymentApp {
       //--------------------- Mini Project: Vehicle Insurance Payment -----------------
       /*
             Project: Vehicle Insurance Payment Calculator
             Vehicle types: car, truck, bus, motorcycle
                     -bus: 18-30 seats or 31 and above seats
             Tariff period: December 2023, June 2023
             1st term: June 2023                      2nd term: December 2023
                cars: 2000                            cars: 2500
                truck: 3000                           truck: 3500
                bus: type1: 4000 type2: 5000          bus: type1: 4500 type2: 5500
                motorcycle: 1500                      motorcycle: 1750
             In case of incorrect entry, the calculation failed warning should be given to the
             user and the menu should be shown again.

       - To be able to show the user the application repeatedly, we should present an option to restart the application.
*/

    public static void main(String[] args) {
    startCalculation();
    }

    public static void startCalculation(){
        boolean isFailed;
        Scanner input = new Scanner(System.in);
        do{
            isFailed = false;

            //show menu and payment to the user
            System.out.println("*** Vehicle Insurance Calculator ***");
            System.out.println("Please choose the term for payment: ");

            System.out.println("1. Term: June 2023");
            System.out.println("2. Term: December 2023");

            int term=input.nextInt();

            // if the term value is a valid value the app should go on for calculaiton
            // if not it should warn the user and ask the user to restart
            if(term == 1 || term ==2){

                Vehicle objVehicle = new Vehicle();
                System.out.println("Enter the type of the vehicle for payment calculation");
                System.out.println("Car, Truck, Bus, Motorcycle: ");

                objVehicle.type=input.next().toLowerCase();
                objVehicle.payment=objVehicle.countPayment(term);

                // to restart the application:
                //if the payment is greater than 0 then print on the console "Calculation done!"
                //if the payment is 0 or less then print incorrect input.
                int select;
                String termName=term==1 ? "June 2023" : "December 2023";

                if(objVehicle.payment>0){
                    System.out.println("Calculation is done succsessfuly");
                    System.out.println("The type of vehicle: " + objVehicle.type.toUpperCase());
                    System.out.println("Payment term: " + termName);
                    System.out.println("Calculation for Payment: " + objVehicle.payment);
                    System.out.println("Press 1 to restart, Press 0 to Exit");
                    select = input.nextInt();
                    if(select==1){
                        isFailed=true;
                    }else {
                        isFailed=false;
                    }
                }else {
                    System.out.println("Calculation failed. Please try again.");
                    System.out.println("Press 1 to restart, Press 0 to Exit");
                    select = input.nextInt();
                    if(select==1){
                        isFailed=true;
                    }else {
                        isFailed=false;
                    }
                }
            }else {
                System.out.println("Calculation cannot be done! Incorrect input.");
                isFailed=true;
            }

        }while (isFailed);
    }
}
