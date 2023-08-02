package homework.homework;

import java.util.Arrays;

public class ArraysArrayLists {
    public static void main(String[] args) {
//-------------------- ArrayList -------------------------

    /* Create a method that takes two numbers as arguments (num, length) and returns
        an array of multiples of num until the array length reaches length.
        arrayOfMultiples(7, 5) ➞ [7, 14, 21, 28, 35]
        arrayOfMultiples(12, 10) ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]
        arrayOfMultiples(17, 6) ➞ [17, 34, 51, 68, 85, 102]
     */

        multiplesOfANumber(3, 2);
    }

    public static void multiplesOfANumber( int length, int num){
        int[] arrayOfMultiples = new int[length];    //create an object with new keyword
        int counter = 1;  // we use counter to work with multiples

        // use i as counter for the loop
        // if i is less than the length start the loop
        // < length because last index position must be less than length
        // i++ increment by 1 each loop
        // so if length is 5, then loop happens 5 times...
        // but index starts from 0 because it is 1 less than the length
        // [1,2,3,4,5] = length 5, but index of last item is = 5 -1 = which is 4

        for(int i = 0; i < length ; i++){

            arrayOfMultiples[i] = counter * num;
            counter++;
        }
        System.out.println( Arrays.toString( arrayOfMultiples ) );
    }
}
