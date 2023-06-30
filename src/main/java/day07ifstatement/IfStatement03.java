package day07ifstatement;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
        //--------------- If Statement --------------------
        /*
            ask user to enter the age, then print according to the given table
            0-4==baby  5-12==kid  13-20==teen 21-30==adult 31-?==undefined
         */

        Scanner input = new Scanner(System.in);
        System.out.println("enter your age");
        int age = input.nextInt();

        if (age < 0) {
            System.out.println("negative age is invalid");
        } else if (age < 5) {
            System.out.println("baby");
        } else if (age < 13) {
            System.out.println("kid");
        } else if (age < 21) {
            System.out.println("adult");
        } else {
            System.out.println("undefined");
        }
    }
}
