package homework;

import java.util.Scanner;

public class QuestionBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {

            System.out.println("Please enter first number");
            double a = input.nextDouble();

            System.out.println("Please enter second number");
            double b = input.nextDouble();

            System.out.println("Please enter a sign to operate");
            String o = input.next();

            if (o.equals("+")) {
                System.out.println(a + b);
            } else if (o.equals("-")) {
                System.out.println(a - b);
            } else if (o.equals("*")) {
                System.out.println(a * b);
            } else if (o.equals("/")) {
                System.out.println(a / b);
            } else {
                System.out.println("Please enter a valid sign, the valid sings are +,-,*,/");
            }

            System.out.println("continue?");

            String check = input.next();
            input.nextLine();
            if(check.equals("n")){
                break;
            }
        }
        }

    }
