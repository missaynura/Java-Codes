package day22stringbuilderstringbuffer;

public class StringBuffer01 {

    /*
    1. StringBuffer is a class in Java and it gives us String
    2. StringBuffer is mutable like StringBuilder
    3. StringBuffer is thread-safe and synchronized, but StringBuilder neither thread-safe nor synchronized
    4. StringBuffer was created in Java5, StringBuilder was created after StringBuffer
    5. StringBuilder has less features than StringBuffer, thats why it works faster than StringBuffer

    If you need String, you have 3 options in Java:
    1. String Class: it will give you immutable Strings (immutable opens new contaner every time a String updated)
    2. StringBuilder: it gives you mutable, non-thread-safe and non-syncronized String
    3. StringBuffer: it gives you mutable, thread-safe and syncronized String
     */
    public static void main(String[] args) {
    StringBuffer sbf1 = new StringBuffer("Sython");
    StringBuffer sbf2 = new StringBuffer("Python");

        //If the Strings are completely same compareTo() method returns zero
        //if the first String comes after the secondString the result will be positive
        //if the first String comes before the secondString the result will be negative

        int r1 = sbf1.compareTo(sbf2);
        System.out.println(r1); //3

        sbf1.setCharAt(2, 'T');
        System.out.println(sbf1);//PyThon

        CharSequence r2= sbf1.subSequence(1,4);
        System.out.println(r2); //yTh

    }
}
