package day06stringmanipulations;

public class StringManipulations02 {
    /*
    1. = assignment operator, == equals operator
    2. indexOf() method returns index of first occurrence of a specific character
    3. lastIndexOf() returns index of the last occurrence of a specific characgter
    4. equals() is checking if two strings are exactly same or not
    5. equalsIgnoreCase() is checking is two strings are same or not by ignoring cases
    6. Index of last character in a string is "length()-1" *******************
    7. isEmpty() returns true just for empty strings
    8. isBlank() returns true for empty strings and space characters

     */

    public static void main(String[] args) {
        //Ex1: type code to check if a specific character is unique in a string or not
        //  Hello == H is unique, e is unique, o is unique
        String s = "Hello";

        char c = 'e';
        boolean isUnique = s.indexOf(c) == s.lastIndexOf(c);
        System.out.println("Is " + c + " unique? " + isUnique);

        //ex2: type code to check if first and the last character are the same in a string
        //      ANKARA ==true    Ankara == true  Miami == false

        String city = "Ankara";
        String fistChar = city.substring(0,1);
        String lastChar = city.substring(city.length()-1);
        boolean isSame = fistChar.equalsIgnoreCase(lastChar);
        System.out.println("Is first and last characters same? " + isSame);

        //ex3: type a code to check if a string is an empty string or not
        //      "" == true     " " == false
        String str = "";

        //1. Way:
        boolean isEmpty1 = str.length()==0;
        System.out.println(isEmpty1);

        //2.Way:
        boolean isEmpty2 = str.isEmpty();
        System.out.println(isEmpty2);

        //Ex4. type code to check if a string is empty of has just a space character
        //      "" == true    "   "  = true
        String st = "    ";
        boolean isBlank = st.isBlank();
        System.out.println(isBlank);

    }
}
