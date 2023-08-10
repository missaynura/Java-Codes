package practices.practice01;

import java.util.Scanner;

public class Q02_Scanner {
        /*
                Ask user to enter his/her first name, last name, age, height and weight then print them on console in this way:
                      First Name: ...
                      Last Name : ...
                      Age: ...
                      Height: ...
                      Weight: ...
                Note: Use only one "System.out.println();"
        */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your First Name");
        String fistName = scanner.nextLine(); //camelCase, snake_case, PASCALCASE
        System.out.println("Enter your last name");
        String lastName = scanner.nextLine();
        System.out.println("Age");
        byte age = scanner.nextByte();
        System.out.println("height");
        double height = scanner.nextDouble();
        System.out.println("weight");
        double weight = scanner.nextInt();

        System.out.println("First Name " + fistName + "\nLast Name " + lastName + "\nAge " + age + "\nHeight " + height + "\nWeight " + weight);
    }
}
