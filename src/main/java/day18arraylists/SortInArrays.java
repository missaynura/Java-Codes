package day18arraylists;

import java.util.Arrays;

public class SortInArrays {
    public static void main(String[] args) {

        char [] arr = {'b', 'e', 'a', 'd'};
        Arrays.sort(arr);
        // how to sort array elements in natural order
        System.out.println(Arrays.toString(arr)); // [a, b, d, e]

        //how to check if a specific element exists in an array or not
        // to check if a specific element exists in an array or not use binarySearch()
        int[] brr = {12, 3, 5, 10, 2};

        //1. step: sort the array elements
        Arrays.sort(brr);

        //2.step: use binarySearch()
        int r1 = Arrays.binarySearch(brr, 12);

        System.out.println(r1);//4 == if the output is valid index(from 0 to ...), it means the array has the elements

        int r2 = Arrays.binarySearch(brr, 4);
        System.out.println(r2);//-3 == the element does not exist. if the element 4 would exist in the array, it would be in the 3rd order
    }
}
