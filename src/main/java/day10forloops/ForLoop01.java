package day10forloops;

public class ForLoop01 {
    public static void main(String[] args) {
               
        //----------------------- For-Loops -------------------------------

        /*
            1. Loops are used for repeated actions in Javayu
            2. There are 4 loops in Java, 1. for-loop 2. while-loop, 3. do-while loop 4. for-each loop
        */
        //Example 1: type code to print Hi 5 times on the console
        //1. way = this is wet code
        System.out.println("Hi");
        System.out.println("Hi");

        System.out.println("=======");
        //2. way = dry code good!
        for (int i = 1; i < 6; i++) {
            System.out.println("Hi");
        }


        //Example 2: type code to print integers = from 12 to 9
        for (int i = 12; i > 9; i--) {
            System.out.println(i);
        }

        //Example 3: type code to print even integers from 7 to 12 == math language
        for (int i = 8; i < 13; i += 2) {
            System.out.println(i);
        }

        //2. way == better, just java language
        for (int i = 7; i < 13; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
