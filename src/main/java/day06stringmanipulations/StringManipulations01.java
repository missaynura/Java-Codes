package day06stringmanipulations;
import java.io.FilterOutputStream;

public class StringManipulations01 {
    //--------------- StringManipulation --------------------
    /*
    Note:
        1. endsWith() method checks the last character of a string if it is matching with a specific character
        2. charAt() method return a specific character by using index
            difference between substring() and cahrAt()
            - charAt() is just for getting a single character, substring() can be used to get a single 
                or multiple charaters
            - charAt() returns char data type, substring() returns string data type
        3. replace() method is for replacing a character with another character
        4. valueOf() method converts Strings which is in numeric data format to numeric data
        5. trim() method removes space character from the beginning and from the end
     */
    public static void main(String[] args) {
        //--------------- Example 1 --------------------
        //Check if a sentence starts with upper case and ends with dot.
        //I love Java. ==true    i like Java. == false  I like Java == false i like Java == false
        String s = "I love Java.";

        boolean isLastDot = s.endsWith(".");
        boolean isInitialUpper = s.charAt(0) >= 'A' && s.charAt(0) <= 'Z';
        System.out.println(isLastDot && isInitialUpper);
        
        //--------------- Example 2 --------------------
        //Type code to find the sum of the prices given as strings
        //$12.99 and $25.75 == 38.74
        String p1 = "$12.99";
        String p2 = "$25.75";

        //remove "$" sign
        String newP1 = p1.replace("$", ""); //$12.99 == String 12.99
        String newP2 = p2.replace("$", "");

        //convert String to double
        double doubleP1 = Double.valueOf(newP1);
        double doubleP2 = Double.valueOf(newP2);

        System.out.println(doubleP1 + doubleP2);

        //e3: get the initials of the first name and the last name in upper case
        //  Tom Hanks == TH   tom hanks == TH  "  tom Hanks   "  == TH
        String name = "   tom Hanks   ";
        String trimmedName = name.trim();

        String firstInitial = trimmedName.substring(0, 1).toUpperCase();
        String lastInitial = trimmedName.split(" ")[1].substring(0, 1).toUpperCase();
        System.out.println(firstInitial + lastInitial);
    }
}
