package question_bank;

import java.time.LocalDate;
import java.util.Scanner;

public class QB_ScannerIncrement01 {

    /* QB ScannerIncrement - 5

     * System.out.println('A'>'a' && 'c'<'f');

     * When we compare char data types together in a condition to return boolean
     * the conditions are compared based on their ASCII values
     * Uppercase letters < LowerCase letters == So, A < a
     * And alphabetical order go in Ascending order, so, A < Z or a < z

     for ( char i = 'f'; i>'a'; i--){
        System.out.print(i + " " );
        i--;
    }

 * Whenever we print char => we get the actual value, NOT the ASCII value
 * But, when we do auto-boxing => we get the ASCII value
 * e.g.

    char letter = 'A';
    System.out.println( letter + 0 ); => converting the char to int

     */

        public static void main(String[] args) {

            char charNum = 65;
            System.out.println(charNum);               // => 'A'

            char charLetter = 'A';
            System.out.println(charLetter);            // => 'A'

            char symbol = '?';
            System.out.println(symbol + 0);            // => will give ASCII value => 63

            char addition1 = 65;
            char addition2 = 100;
            System.out.println(addition1 + addition2); // => 165

            int result = 2 + 3 * (12 - 4 / 2) / 15 - 3;
            System.out.println(result);

/**********************************************

 ScannerIncrement 7
 * Mathematical operations in Java work in specific order
 * Brackets => (12 - 4/2)
 *              => works left to right if it is opposite signs
 *              Java considers mathematical operations like in Math
 *              and works left to right
 *              First comes brackets => and then / and * and doesn't matter if change order and
 *              Similarly for + and -
 *
 */

            System.out.println(5 / 2); // if numbers are both int => return int
            System.out.println(5 / 2.0); // autobox because int < double, therefore return == double
            System.out.println(10 / 2.5 + 1); // auto-boxes 10 / 2.5 => returns us double

//        System.out.println( Scanner. ); // will not work because Scanner is not static
        /*
            LocalDate.now().getYear() is a static method that can be called directly on the LocalDate class
            without creating an object first.
            It returns the current year from the system clock in the default time-zone1.

            On the other hand, Scanner methods are non-static
            and require an object to be created first before they can be called.
         */


            int year = calculateAge(2000);
            System.out.println(year); // return value from the calculateAge() method

            /**********************************************
             Question 10 [ Scanner & Increment ]

             public class Test {

             static int age = 12; // default => static variable
             char initial = 'J'; // default => non-static

             public static void main(String[] args) {

             System.out.println(age + initial);

             // error in code because non-static is not recognised
             // to fix this issue, we have 2 choice:

             - add static keyword to the char initial = 'J'; OR
             - create an object for the Test class to use the non-static variables/methods too
             }
             }


             */
        }

        public static int calculateAge(int dateOfBirth) { // method is static => can use directly inside main

            Scanner input = new Scanner(System.in); // must still create objects for non-static classes
            System.out.println("user input...");
            input.nextLine();

            return LocalDate.now().getYear() - dateOfBirth;
        }


}
