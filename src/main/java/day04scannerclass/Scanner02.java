package day04scannerclass;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        //Example 1. ask user to enter two numbers then do addition and multiplicaitons operations with the numbers

        //1. Step: create a Scanner object
        Scanner inputInfo = new Scanner(System.in);

        //2. Step: give a message to user about what to do
        System.out.println("Enter fist number");

        //3. Step: select appropriate method and get the data from user
        double number1 = inputInfo.nextDouble();
        System.out.println("Enter second number");
        double number2 = inputInfo.nextDouble();

        System.out.println("the sum is " + (number1 + number2));

        System.out.println("the multiplication is " + number1*number2);
    }

}
