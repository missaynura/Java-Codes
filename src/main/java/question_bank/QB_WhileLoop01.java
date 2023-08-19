package question_bank;

import java.util.Scanner;

public class QB_WhileLoop01 {
    public static void main(String[] args) {
        //------------------ While Loop ----------------
        Scanner input = new Scanner(System.in);

        //QB [ While Loops ] - 3 => Write code to print 2 4 6 8 on the console
        /* Using Loops
            NOTE: if the condition is false, the loop never runs! [ 0 execution is possible ] { for, for each, while }
                         This is NOT the case for do while loops! [ Min. 1 execution at all times ] { do while }


            In a for, for-each, or while loop:
                - the loop condition is checked before each iteration of the loop.
                - If the condition is false, the loop will not execute, even if it has not executed before.
                - So it is possible for these loops to have 0 executions if the condition is false from the start.

            A do-while loop, is similar to a while loop, but with one key difference:
            - the loop condition is checked at the end of each iteration instead of at the beginning.
            - This means that the loop body is executed at least once, even if the condition is false from the start.
            - So unlike for, for-each, and while loops, a do-while loop will always have at least 1 execution.

            while loops:
            - we need to set the counter outside the loop => int k = 1;
            - while(k<=8) checks the condition for each iteration
            - k++ increments the counter by one, inside the while loop body
            - when we set a 'counter' => we must increase/decrease the value inside the body to avoid infinite loop
            - we can use other conditions with the while loop to break the loop instead of counters i.e.

                * control statements (if / switch) can be used to control the flow of execution
                * boolean variables outside the loop which change values inside the value
                * we can also use break keyword e.g. inside loops and switch statements

            for loops:
            - we need to set the counter inside the loop => for(int i=1; i<=8; i++)
            - while(k<=8) checks the condition for each iteration
            - k++ increments the counter by one, inside the while loop body
         */
        // Way 1. using the while loop with counter
        int k = 1;
        while(k<=8) {
            if(k%2==0) {
                System.out.print(k + " ");
            }
            k++;
        }

        // Way 2. using the while loop with control statement
        System.out.println("Type your sentence, or enter 0 to exit the loop");
        String userString = input.nextLine();
        System.out.println(userString);

        while(!userString.equals("0") ){
            // always use .equals() to compare strings
            // use !userString.equals() to test for NOT condition

            System.out.print("Enter: ");
            userString = input.nextLine(); // reassigning the String userString variable
        }

        System.out.println(userString);

        // Way 3: using the for loop
        for(int i=1; i<=8; i++) {
            if(i%2==0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("..........");
        int[] num = {1,2,3,4,5}; // length of array is 5
        // 0,1,2,3,4  // total indexes of array is 4, because num[0],num[1], num[2], num[3], num[4]
        // this is because first element in the array is index position 0
        // this means last element => array.length - 1 => index position of last element

        // way 1. for loop with arrays
        for(int i = 0; i < num.length; i++){    // way 2. for(int i = 0; i <= num.length - 1; i++)
            System.out.println( num[i] );
        }

        // way 2. for each loop with arrays
        for( int w : num){                      // w == behaves like a container and takes each element in array one by one
            System.out.println( w );
        }
    }
}
