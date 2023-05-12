package ssg;

public class NLoops02 {
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
        * * * *
        * * *
        * *
        *
     */

        for(int i=0; i<5; i++){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=5; i>0; i--){
            for(int j=i; j>0; j--){ // if j is 5 then i should print 5 *
               System.out.print("* ");
            }
            System.out.println();
        }

    }
}
