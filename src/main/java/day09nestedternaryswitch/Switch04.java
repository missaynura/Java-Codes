package day09nestedternaryswitch;

import java.util.Scanner;

//Switch Statement can be used with String, int, char,
// but cannot be used with long, double, float, boolean
public class Switch04 {
    public static void main(String[] args) {
        // create a calculator does +, -, *, /, %
        Scanner input = new Scanner(System.in);

        System.out.println("enter the operation among +, -, *, /, %");
        char opr = input.next().charAt(0);
        System.out.println("enter two integers to do the operation");
        int a = input.nextInt();
        int b = input.nextInt();

        switch (opr) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a + "x" + b + "=" + (a * b));
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a * b / 100);
                break;
            default:
                System.out.println("invalid");
        }
    }
}
