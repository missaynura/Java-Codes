package day11forloop;

import java.util.Scanner;

public class NestedForLoop01 {
    public static void main(String[] args) {
        /*
            1.Example:Type code to get the output like
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
         */
        for(int i=1;i<3; i++){
            System.out.println("Week: " + i);
            for(int k=1; k<4; k++){
                System.out.println("  Day: " + k);
            }
        }

        /*
            2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop
            ****
            ****
            ****
            Note: Get the number of the rows and the columns from user
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row and column numbers");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        for(int i=1; i<=rows;i++){
            for(int k=1; k<=columns; k++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
