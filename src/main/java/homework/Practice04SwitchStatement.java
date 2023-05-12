package homework;

import java.util.Scanner;

public class Practice04SwitchStatement {
    // This work belongs to Aynura and Furkan

    /*
    Use a switch statement to print the name of the month when you enter the number of the
    month. For example; if user enters 1 your code should print "January",
    if user enters 2 your code should print "February" etc. if user enters invalid month number
    your code should print "Invalid number”

    - we will use switch-statement
    - Scanner class with nextLine() method, as next() delivers only the first occurrence
    - clean invalid entries with regex, trim(), toLowerCase()
     */

    public static void main(String[] args) {

        //we tried to use int data type, but this caused an error when a user enters a string
        //next() method returned only the first occurrence,
        //e.g. when we used a1 3 it gave us only 1, because that was the first occurrence
        // therefore we will use nextLine() instead and trim()

       // Some regex expressions we used which didn't help, but we learned a ton: :)))))
        //to eliminate minus numbers use this regex [^-?0-9]. leaving out regex -? will end up always delivering
        //a positive number, since it caps "-" the minus sign
        //^-?0-9 == didnt work, because it returns digit as sting value and that's why it always matches case number,
        //e.g. abc1 returns 1
        //^-?\\D == returns invalid string part as sting value and that's why it doesn't match case number and invalid entry is displayed
        //e.g. abc1 returns abc

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number of the month...");
            String monthNumber = input.nextLine().trim().toLowerCase();
            System.out.println(monthNumber);

            switch (monthNumber) {
                case "1":
                    System.out.println("January");
                    break;
                case "2":
                    System.out.println("February");
                    break;
                case "3":
                    System.out.println("March");
                    break;
                case "4":
                    System.out.println("April");
                    break;
                case "5":
                    System.out.println("May");
                    break;
                case "6":
                    System.out.println("June");
                    break;
                case "7":
                    System.out.println("July");
                    break;
                case "8":
                    System.out.println("August");
                    break;
                case "9":
                    System.out.println("September");
                    break;
                case "10":
                    System.out.println("October");
                    break;
                case "11":
                    System.out.println("November");
                    break;
                case "12":
                    System.out.println("December");
                    break;
                default:
                    System.out.println("Invalid number");
                    continue;
            }
            break;
        } while (true);

    }

}


