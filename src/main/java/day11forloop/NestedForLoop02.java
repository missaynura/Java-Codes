package day11forloop;

import java.util.Scanner;

public class NestedForLoop02 {
    public static void main(String[] args) {
                
     //------------------------ Nested For - Loops --------------------------

      /*
         1.Example: Type code to get the output like
                     1
                     1 2
                     1 2 3
                     1 2 3 4
                     1 2 3 4 5
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row number");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(k + "   ");
            }
            System.out.println();
        }
    }
}
