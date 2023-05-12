package ssg;

import java.util.Scanner;

public class Loops05 {

    public static void main(String[] args) {

        /*
        ask from user enter numbers find the sum of number, and continue until the user presses 0
        when the user press 0
        print the sum of all the numbers entered
         */

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;

        do{
            System.out.println("enter numbers");
            num = scanner.nextInt();
            sum = sum + num;

          }while(num!=0);
        System.out.println("Sum of numbers" + sum);
    }
}
