package oldclass;

import java.util.Scanner;

public class day07IfElseHW05 {
    public static void main(String[] args) {
        //---------------- Practice ------------------------
        //Excercise 7: Type java code by using if-else statement.
        //A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
        //Ask user for quantity and unit price then judge and print total cost for user.
        //If the quantity is less than 1000 output will be “No discount.”
        Scanner input = new Scanner(System.in);
        System.out.println("Number of shirts you purchased?");
        int shirtNumber = input.nextInt();
        System.out.println("Type the price of a shirt");
        double shirtPrice = input.nextDouble();
        double totalPrice = shirtPrice*shirtNumber;

        if(totalPrice>=1000){
            System.out.println("10% discounted price is" + " " + shirtPrice/shirtNumber*100);
            //System.out.println("you get 10% off!" + totalPrice "=" );
        }else{
            System.out.println("no discount");
        }

    }
}
