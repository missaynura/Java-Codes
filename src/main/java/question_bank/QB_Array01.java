package question_bank;

import java.util.Arrays;

public class QB_Array01 {
//---------------------- Arrays --------------------------
    /*
        Exercise 1: Type a program like; given an array whose length is 3, return an array with the
        elements in reversed order. For example; if the array is [1, 2, 3] output will be [2, 3, 1].
     */

    public static void main(String[] args) {

        int[] myArray = {1, 2, 3};
        int size = myArray.length; // 3

        for (int i = size - 1; i >= 0; i--) {
            if( i == 0){
                System.out.print(myArray[i]);
            } else{
                System.out.print(myArray[i] + ", "); // [3, 2, 1,]
            }
        }

        //Exercise 2: create an array with data type int and string and sort them in natural order
        int numArray[]={5, 4,3,1};
        Arrays.sort(numArray);
        for(int i=0; i<numArray.length; i++){
            System.out.print(numArray[i] + ", "); //1, 3, 4, 5,
        }

        String stringArray[]={"Mouse", "Cat", "Dog"};
        Arrays.sort(stringArray);
        for(int i=0; i<stringArray.length; i++){
            System.out.print(stringArray[i] + ", "); //Cat, Dog, Mouse,
        }
    }
}

