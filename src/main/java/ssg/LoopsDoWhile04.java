package ssg;

import java.util.Scanner;

public class LoopsDoWhile04 {
    public static void main(String[] args) {
        //ask the user to enter as many numbers as they want
        //if the sum of the numbers entered by the user exceeds 500
        //now you have entered enough numbers, the total is...

        Scanner scanner = new Scanner(System.in);
        int number =0;
        int total=0;

        do{
            System.out.println("enter a number");
            number=scanner.nextInt();
            total= total+number;
        }while(total<=500);
        System.out.println("you have entered enougn numbers now, the sum is :" + total);


    }
}
