package day12whileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {
        //e1. type code to print integers from 3 to 6 on the console
        //1. way
        for (int i = 3; i < 7; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //2.way
        int i = 3;
        while (i < 7) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();
        //e2. type code to print odd integers from 10 to 4 on the console
        int k = 10;
        while (k > 3) {
            if (k % 2 != 0) {
                System.out.print(k + "  ");
            }
            k--;
        }
        System.out.println();
        //e3. type code to find the sum of the even integers from 10 to 13
        int a = 10;
        int sum = 0;
        while (a < 14) {
            if (a % 2 == 0) {
                sum = sum + a;
            }
            a++;
        }
        System.out.println(sum);

        //e4. type java code by using while loop ***************** leanr this question*********
        //write a program that promts the user to input an integer
        //it should then find the sum of the digits of that number
        //123 == 1+2+3 =6
        int n = 587;
        n = Math.abs(n); // convert negative number to positive and calculate
        int sumOfDigits = 0;
        while (n > 0) {
            sumOfDigits = sumOfDigits + n % 10; //%10 gives the last didit
            n /= 10; // same as n=n/10;
        }
        System.out.println(sumOfDigits);

        //e5. type java code by using while loop, write a program that the user to input
        // a number. It should then print the multiplication table of that number
        //3x1 =3   3x2 =6 3x3=9
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number to see its multiplication table");
        int c = input.nextInt();
        int b = 1;
        while (b < 11) {
            System.out.println(c + "x" + b + "=" + (c * b));
            b++;
        }
    }
}
