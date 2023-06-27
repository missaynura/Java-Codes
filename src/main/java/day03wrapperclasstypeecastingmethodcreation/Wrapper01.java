package day03wrapperclasstypeecastingmethodcreation;

import java.sql.SQLOutput;

public class Wrapper01 {
    public static void main(String[] args) {

        /*
        1. Java created Wrapper Class for every primitive data type by adding methods next to the primitive value
        2. Wrapper classes are non-primitive that is why they are stored in Heap memory
        3. byte== Byte
           short == Short
           int == Integer
           long == Long
           float == Float
           double == Double
           char == Character
           boolean == Boolean
         */

        byte age = 12; // when you put . after age you will not see any method
        Byte stdAge = 13;   // when you put . after stdAge you will see many methods

        System.out.println(Byte.MIN_VALUE); // -128
        System.out.println(Byte.MAX_VALUE); // 127

        // Example 1: find the sum of the min and max value of short data type
        System.out.println(Short.MIN_VALUE + Short.MAX_VALUE); // -1

        // Example 2: find the size of the int and float and long
        System.out.println(Integer.SIZE); // Memory 32
        System.out.println(Float.SIZE); // 32
        System.out.println(Long.SIZE); // 64

        // Note: MIN_VALUE, MAX_VALUE, etc. are constant variables containing constant values
        // If a variable has constant value, use just upper cases to name and _ betwen the words.

        System.out.println(Integer.max(12, 43)); // 43
        System.out.println(Long.min(23, 124)); // 23
        System.out.println(Integer.parseInt("234") + 1); //235

        //How to convert primitive data type to its wrapper class or how to convert wrapper class to its primitive d.t.

        // Converting primitive data type to its wrapper class is called Autoboxing
        int num = 25;
        Integer wrapperNum = num;

        //Converting wrapper class to its primitive data type is called Unboxing
        Short s = 245;
        short primitiveS = s;
    }
}
