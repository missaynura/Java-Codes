package practices.practice01;

import java.util.Scanner;

public class Q03_Scanner {
    //----------- Practice 01 -------------------
    //Type a code that calculates the hypotenuse.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the first leg of the right triangle");
        double a = scanner.nextDouble();
        System.out.println("Enter the length of the second leg of the right triangle");
        double b = scanner.nextDouble();

        double hypotenuse = Math.sqrt((a*a)+(b*b));
        System.out.println("hypotenuse = " + hypotenuse);
    }
}
