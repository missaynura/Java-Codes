package practices.practice02;

import java.util.Scanner;

public class Q01_IfStatement_SalaryBonus {
    public static void main(String[] args) {
        /*
        A company decided to give bonus of 5% of salary to employee if his year of service
        is 5 and more than 5 years
        ask user for their salary and year of service and print the net bonus amount#
        if employee can not get bonus, print how many  more years she should work
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your year of service");
        int year = Math.abs(scanner.nextInt()); // math.abs will make it a positive number only

        System.out.println("enter your salary");
        double salary = Math.abs(scanner.nextDouble());

        if (year >= 5) {
            double bonus = salary * 5 / 100;
            System.out.println("your bonus: " + bonus);
        } else {
            System.out.println("you need to work " + (5 - year) + " years more");
        }

    }

}
