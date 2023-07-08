package day13dowhilelooparrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //---------------------- Arrays -----------------------------
  
        //1. Arrays are for storing multiple data in same data type.
        String name = "Tom";
        // how to create an Array
        String stdNames[] = new String[5];

        //How to add elements into an array
        stdNames[2] = "Tom";
        stdNames[4] = "Alex";
        stdNames[0] = "Mary";
        stdNames[1] = "Jim";
        stdNames[3] = "john";
        System.out.println(Arrays.toString(stdNames));

        //How to get a specific element from an array
        System.out.println(stdNames[4]); //Alex

        //How to get number of elements in an array
        System.out.println(stdNames.length); // it will return 5

        //Exercise 1: find the total number of characters used in stdNames array elements
        //1.Way
        int total = 0; // create container for a new data
        for (int i = 0; i < stdNames.length; i++) {

            total = total + stdNames[i].length(); //number of elements
        }
        System.out.println(total);


        //2.Way: for each loop == enhanced loop
        int sum = 0;
        // [Mary, Jim, Tom, John, Alex]
        for (String w : stdNames) { // w== string name
            sum = sum + w.length();
        }
        System.out.println(sum);
    }
}
