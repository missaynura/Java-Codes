package ssg;

public class NLoops01 {
    public static void main(String[] args) {
        /*
        nested for loop can be either rectangular or trianlge format
        when we want a rectangular, we can specify the outer loop end point for the inner loop end point
        to give a triangle shape, we make the end point of the inner loop depend on the outer loop initial variable
        *
        * *
        * * *
        * * * *
        * * * * *

     */

        for(int i=0; i<5; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
