package day34lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
    //------------------------- Lambda ---------------------------
    /*
        1. We learned structural programming so far, e.g. for-loop structure, 
            while-loop structure, ect.
            We will learn now functional programming.
        2. Functional programming uses Java Methods mostly to type codes.

     */

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        printEvenElements(nums);
        System.out.println();
        printEvens(nums);
        System.out.println();
        printSquareOfDistinctOddElements(nums);
        System.out.println();
        System.out.println(findSumOfCubeOfDistinctEvens(nums));
        System.out.println();
        System.out.println(findMax1(nums));
        System.out.println();
        System.out.println(findMax2(nums));
    }

    //Example 1: create a method to print even elements in an integer list.
    //1.Way: using structural programming
    public static void printEvenElements(List<Integer> myList){
        for (Integer w : myList){
            if(w%2==0){
                System.out.print(w + " ");
            }
        }
    }

    //2. Way: using functional programming
    public static void printEvens(List<Integer> myList){
        //t is a variable name, it stands for an element, in Lambda we use t u or v. Like w in for-each loop.
        //filter() method for selecting even elements, forEach() for printing every element
        myList.
                stream().
                filter(t->t%2==0).
                forEach(t-> System.out.print(t + " "));
    }

    //Example 2: create a method to print square of distinct unique odd elements.
    public static void printSquareOfDistinctOddElements(List<Integer> myList){
        myList.
                stream().
                distinct().
                filter(t->t%2!=0).
                map(t->t*t).forEach(t-> System.out.print(t+ " "));
    }

    //Example 3: create a method to find the sum of the cube of the different even elements in a list.
    public static int findSumOfCubeOfDistinctEvens(List<Integer> myList){
        return myList.
                stream().
                distinct().
                filter(t->t%2==0).
                map(t->t*t*t).
                reduce(0,(t,u)->t+u);
    }


    //Example 4: create a method to find the element whose value is maximum
    //1.Way
    public static int findMax1(List<Integer> myList){
        return myList.
                stream().
                distinct().
                reduce(myList.get(0),(t, u)->t > u ? t:u);
    }

    //2.Way
    public static int findMax2(List<Integer> myList){
       return myList.stream().
                distinct().
                sorted().
                reduce((t, u)-> u).
                get();
    }

    //Example 5: create a method to find the element whose value is minimum
    //1.Way
    public static int findMin1(List<Integer> myList){
        return myList.
                stream().
                distinct().
                reduce(myList.get(0),(t, u)->t < u ? t:u);
    }

    //2.Way
    public static int findMin2(List<Integer> myList){
        return myList.stream().
                distinct().
                sorted().
                findFirst().
                get();
    }

    //Example 6. Create a method to find the multiplication of the elements less than 15 and even
    public static int findMultiplication(List<Integer> myList){
        return myList.
                stream().
                distinct().
                filter(t-> t<15). //filter(t->t<15 && t%2==0) also works
                filter(t->t%2==0).
                reduce(1, (t,u)->t*u);
    }

    //Example 7: Create a method to check if all elements are less than 140 or not
    //make the code always reusable!!!
    public static boolean isLessThanSpecificNumber(List<Integer> myList, int num){
               return myList.
                       stream().
                       allMatch(t->t<num);
    }

    //Example 8: Create a method to check if no element is negative or not.
    public static boolean isNoneNegative(List<Integer> myList){
        return myList.
                stream().
                noneMatch(t->t<0);
    }

    //Example 9: Create a method to check if any element has 3 digits
    public static boolean anyElementHasThreeDigits(List<Integer> myList){
        return myList.
                stream().
                anyMatch(t->t<1000 && t>99);
    }
}
