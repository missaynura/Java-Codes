package question_bank;

public class QB_ForLoops01 {

    public static void main(String[] args) {

        /*********************************************
         QB [ For Loops - 1 ]

         In a for loop:

         * How many loops?
         * There are 4 types of Loops => for, for each, while, do while

         [ Loop Logic ]
         * the increment expression (i++ in this case) is executed at the end of each iteration of the loop.
         * So in the code below:
         * the value of i is incremented by 1 at the end of each iteration of the loop.
         * So, loop starts at 1 --> 1 goes into the loop body --> System.out.print(i + " "); => 1

         [ Steps in the loop ]
         1. Then it increments i which is 1, by i++ which is at end of loop body => 2
         2. Next, it will finish the first loop, then increment by 1 again
         3. from the incrementation part of the loop condition => so now i = 3 -- which will go for the second loop

         Try this using the steps above

         for (int i = 2; i <= 20; i++){

         System.out.print(i + " ");
         i++;

         }
         *

         */
        // Both for loops below print out the same odd numbers
        // 1. Way
        for (int i = 1; i <= 6; i++) {      // increments by 1

            System.out.print(i + " ");
            i++;                           // increments by 1 again => Total of 2 incrementation
        }

        // 2. Way
        for (int i = 1; i <= 6; i+= 2) {
            System.out.print(i + " ");
        }

/* Q5 [ for loops ]

    Logic for the loop below

    #Iteration 1, Start of Loop     =>     y = 1            i = 0

        int i = 0, and it is less than 4, so enter the loop
        y currently is set to 1, so y + i = 1 (because i is 0)
        End of iteration reached -> increment i by 1 because of ++, so i = 0 + 1

                    End of Loop     =>     y = 1            i = 1

------------------------------

   #Iteration 2, Start of Loop     =>     y = 1            i = 1

        int i = 1, and it is less than 4, so enter the loop
        y currently is set to 1, so y + i = 1 + 1 = 2 (because i is 1)
        End of iteration reached -> increment i by 1 because of ++, so i = 1 + 1 => i = 2

                    End of Loop     =>     y = 2            i = 2

------------------------------

    #Iteration 3, Start of Loop     =>     y = 2            i = 2

        int i = 2, and it is less than 4, so enter the loop
        y currently is set to 2, so y + i = 2 + 2 = 4
        End of iteration reached -> increment i by 1 because of ++, so i = 2 + 1 => i = 3

                    End of Loop     =>     y = 4            i = 3

------------------------------

    #Iteration 4, Start of Loop     =>     y = 4            i = 3

        int i = 3, and it is less than 4, so enter the loop
        y currently is set to 4, so y + i = 4 + 3 = 7
        End of iteration reached -> increment i by 1 because of ++, so i = 3 + 1 => i = 4

                    End of Loop     =>     y = 7            i = 4

------------------------------

        THE LOOP ENDS because for ( int i = 4; i < 4; i++ ) --> i is 4, so 4 cannot be less than 4
        OUTPUT OF y => 7
 */
        int y = 1;
        for (int i = 0; i<4; i++) {
            y += i;
        }
        System.out.println(y); // What is the output of y?

        // Continue from question 6

    }

}
