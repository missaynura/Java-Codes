package day02variables;

public class Variables03 {

    public static void main(String[] args) {
        // example 1: create two short variables and print their sum on the console
        short s1 = 12;
        short s2 = 13;
        System.out.println(s1 + s2);

        // example 2: create two variables for prices then print their sum on the console.

        double shirtPrice = 12.99;
        double shoesPrice = 123.3;
        System.out.println(shirtPrice + shoesPrice);

        //example 3: create a variable for student's age and another variable for population of a country.
        // print it out.

        byte stdAge = 22;
        int populationOfGermany = 830000;

        System.out.println(populationOfGermany - stdAge);

        //Note: if you use different data types in a mathematical operation, the result will be in the largest data type.
        // 4/1.2 == double  2.4F * 5 == float

        //Note: if you use same data type in a mathematical operation result will be in the data type
        //When you divide an int by another int, the result can be double like in 6/5=1.2
        //but Java makes the data type of the result in int as well.
        // 6/2 == int   6/5 == int
        System.out.println(6/5);

        //if you want to see 1.2 when you devide 6 by 5:
        System.out.println(6/5.0);

        //Example 1: estimate the result of the given operation
        // (2+ 4.6) / 3 - 4 * 2
        //Note: order of operations in Math:1. do the operations in the paranthesis
        //                                  2. do multiplications and divisions (from left to right)
        //                                  3. do additions and substractions
    }
}
