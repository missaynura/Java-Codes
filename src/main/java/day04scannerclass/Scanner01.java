package day04scannerclass;

import java.util.Scanner;

public class Scanner01 {

    /*
    1. next() is for getting just a single word from user
    2. nextLine() is for getting all the string user entered
    3. nextInt() is for getting integer from user
    4. nextDouble() is for getting double from user
    5. nextBoalean() is for getting boolean from user
     */
    public static void main(String[] args) {
        // Example 1. Ask user to enter full name, Age, Height, Marital Status
        // then print that on the console in different lines with a label

        //1. Step: Create Scanner Object
        Scanner inputInfo = new Scanner(System.in);

        //2. Step: give a message to user about what to do
        System.out.println("please enter your full name:");

        //3. Step: use appropriate method to get data from user
        String fullName = inputInfo.nextLine();
        System.out.println("please enter your age");

        byte age = inputInfo.nextByte();
        System.out.println("please enter your height");

        double height = inputInfo.nextDouble();
        System.out.println("please tell me, are you married?");

        boolean status = inputInfo.nextBoolean();

        System.out.println("your full name is " + fullName);
        System.out.println("your age is " + age);
        System.out.println("your height is " + height);
        System.out.println("is married?" + status);

    }
}
