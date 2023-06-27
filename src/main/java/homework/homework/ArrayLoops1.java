package homework.homework;

import java.util.ArrayList;

public class ArrayLoops1 {
    public static void main(String[] args) {
        //Create a method that takes an array containing only numbers
        //and returns the first element
        int[] num1={1,2,3,4,5};
        int[] num2={1,2,3,4,5};
        int[] num3={1,2,3,4,5};

        int[] num4= new int[4];
        num4[0]=1;
        num4[1]=2;
        num4[2]=3;

        System.out.println(firstNumber(num1));
        int numStored=firstNumber(num1);

    }

    public static int firstNumber(int[] number){
        return number[0];
    }
    /*
     * int return type -> means it is expecting a return type of integer
     * (int[] number) -> int[] means single array / it is not nested
     * (int[] number) -> the number word is any name we want to give for the parameters
     * these parameters will be used like variables inside the method body
     * when we call the custom method - the arguments we pass will be used as the parameters

     * custom methods must be created outside of the main method
     * static keyword must be added
     * return type must be added - and void is also a return type that we can use if nothing is returned
     * call method in main method
     */

    //Write a method to check if an array contains a particular value. Use <ArrayList>


    public static boolean containsParticularValue(ArrayList<String> checkValue, String seasonName){

        String lowerCaseSeason = seasonName.substring(0, 1).toUpperCase();
        String rest = seasonName.substring(1).toLowerCase();

        String combine = lowerCaseSeason + rest;
        return checkValue.contains(combine);

    }

}

