package day04scannerclass;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //--------------- Scanner Class --------------------
        //example 1: ask user to ender 5 digit number
        // print the sum of the first two and the last two digits
        //   if the number is 50650 == 50 + 50

        Scanner inputInfo = new Scanner(System.in); // accessing methods in Scanner class
        System.out.println("please enter a 5 digit number...");
        int num = inputInfo.nextInt();

        int firstTwo = num / 1000;
        int lastTwo = num%100;

        System.out.println("the number is " + (firstTwo + lastTwo));

    }

}
