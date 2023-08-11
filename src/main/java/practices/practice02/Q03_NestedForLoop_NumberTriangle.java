package practices.practice02;

import java.util.Scanner;

public class Q03_NestedForLoop_NumberTriangle {
    public static void main(String[] args) {
        //---------------------- Nested for Loop --------------------------
        /*
            type code to ask user to enter the number of row and print the shape below according to that number
            1
            2 3
            4 5 6
            7 8 9 10
            11 12 13 14 15
            16 17 18 19 20 21
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of rows");
        int row = scanner.nextInt();
        int number = 1;
        for(int i = 0; i<row; i++){ //row control

            for(int j=0; j<=i; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println(" ");
        }
    }
}
