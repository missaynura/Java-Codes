package miniproject02nt;

import java.util.Scanner;

public class Vehicle {
    //------------------- Mini Vehicle Project ---------------
    /*
         Tariff period: December 2023, June 2023
         1st term: June 2023                      2nd term: December 2023
         cars: 2000                            cars: 2500
         truck: 3000                           truck: 3500
         bus: type1: 4000 type2: 5000          bus: type1: 4500 type2: 5500
         motorcycle: 1500                      motorcycle: 1750
     */

    public String type;
    public int payment;

    public int countPayment(int term) {
        if (term == 1) {
            switch (type) {
                case "car":
                    payment = 2000;
                    break;
                case "truck":
                    payment = 3000;
                    break;
                case "bus":
                    payment = calculateBusPayment(term);
                    break;
                case "motorcycle":
                    payment = 1500;
                    break;
                default:
                    System.out.println("Incorrect data entrance");
                    payment = 0;
                    break;
            }
        } else if (term == 2) {
            switch (type) {
                case "car":
                    payment = 2500;
                    break;
                case "truck":
                    payment = 3500;
                    break;
                case "bus":
                    payment = calculateBusPayment(term);
                    break;
                case "motorcycle":
                    payment = 1750;
                    break;
                default:
                    System.out.println("Incorrect data entrance");
                    payment = 0;
                    break;
            }
        } else {
            System.out.println("Incorrect data for calculation");
            payment = 0;
        }
        return payment;
    }

        public int calculateBusPayment(int term){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the type of bus for payment: ");
            System.out.println("Enter 1 for 18-30 seats, 2 for 31 and above seats");

            int busType = input.nextInt();
            switch (busType) {
                case 1:
                    if (term == 1) {
                        payment = 4000;
                    } else {
                        payment = 4500;
                    }
                    break;
                case 2:
                    if (term == 2) {
                        payment = 5000;
                    } else {
                        payment = 5500;
                    }
                    break;
                default:
                    System.out.println("Incorrect input. Calculation failed.");
                    break;
            }
            return payment;
        }
    }
