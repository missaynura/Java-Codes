package homework.homework;

import java.util.Arrays;

public class PracticeLoops {

    public static void main(String[] args) {



//        //For-Loop:
//        System.out.println("Im for-Loop");
//
//
//        for(int i=1;    i<=8;     i++)
//        {
//
//            System.out.print(i + " ");
//
//        }
//
//
//        System.out.println();


//
//
//        //While-Loop:
//        System.out.println("Im While-Loop");
//
//        int k = 1;
//
//        while(k<5)
//        {
//
//
//            System.out.print(k);
////            if(k%2==0) {
////                System.out.print(k + " ");
////            }
//            k++;
//        }
////
//        System.out.println();


//        //do-While loop
//        int a = 1;
//        do {
//            a++;
//            System.out.println(a++);
//
//        } while (a<5);



        //For-Each Loop == Enhanced For Loop
        int nums[] = new int[4];

        System.out.println(Arrays.toString(nums));//[0, 0, 0, 0]
        nums[0] = 12;
        nums[1] = 8;
        nums[2] = 10;
        nums[3] = 7;

        System.out.println(Arrays.toString(nums));//[12,8,10,7]

//        int sum = 0; // we want to create a new container for summing of all elements

        for (int w : nums) {
           if(w==10){
              break;
           }
            System.out.println(w);
        }
//        System.out.println(sum);






//
//        System.out.println();

/*
The output is not 3 because the System.out.println(a++) statement uses the post-increment
operator (a++). This means that the value of a is first used in the System.out.println statement and
then incremented. So, in the first iteration of the loop, the value of a is 2 when it is passed to the
System.out.println statement. After that statement is executed, the value of a is incremented to 3.

In contrast, if the pre-increment operator (++a) had been used, the value of a would have been
incremented before being passed to the System.out.println statement, and the output would have been 3.
 */




//
//        int b = 1;
//
//        while(b<1){
//
//            System.out.println("Im while loop");
//            b++;
//        }
//
//
//
//
//        //Nested Loops:
//        // Outer loop
//        for (int i = 1; i <= 2; i++) {
//            System.out.println("Outer: " + i); // Executes 2 times
//
//            // Inner loop
//            for (int j = 1; j <= 3; j++) {
//                System.out.println("   Inner: " + j); // Executes in total 6 times,
//                                                    // so inner loop iterates 3 times for each outer loop iteration
//            }
//        }

    }
}
