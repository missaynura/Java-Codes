package day05stringmanipulations;

import java.util.Scanner;

    /*
    1. replaceAll(regex, newCharacter) method puts new character instead of group
        of data taken by regex
    2. contains(char) checks if the given character exists in the string or not,
        Does NOT work with regex
    3. length() gives you the number of characters in the string
     */
public class StringManipulations02 {

    //--------------- StringManipulation --------------------
    /*
        Regular Expressions(Regex) are for getting a group of data
        1. All upper case letters: [A-Z]
        2. All lower case letter:  [a-z]
        3. All digits: [0-9]
        4. All letters: [A-Za-z]
        5. All vowels: [aeiouAEIOU]
        *6. All punctuation marks: \\p{Punct}
        7. All characters different from upper cases: [^A-Z]
        8. All characters different from lower cases: [^a-z]
        9. all characters different from digits [^0-9]
        10. all characters different from all letters [^A-Za-z]
            ^ different from
            ! means not true
            && and operator
     */
    public static void main(String[] args) {
        /*
            check the password according to the given rules
            1. password must have at least 8 character
            2. must not have space character
            3. must have at least an upper case character
            4. must have at least a lower case character
            5. must have at least a symbol (characters different from letters and digits)
            6. must have at least a digit
        */

        Scanner input = new Scanner(System.in);
        System.out.println("enter your password");
        String pwd = input.nextLine();

        //1. password must have at least 8 character
        boolean firstRule = pwd.length() > 7;

        //   2. must not have space character
        boolean secondRule = !pwd.contains(" ");

        // 3. must have at least an upper case character
        boolean thirdRule = pwd.replaceAll("[^A-Z]", "").length() > 0;

        //4. must have at least a lower case character
        boolean fourthRule = pwd.replaceAll("[^a-z]", "").length() > 0;

        // 5. must have at least a symbol (characters different from letters and digits)
        boolean fifthRule = pwd.replaceAll("[A-Za-z0-9]", "").length() > 0;

        //  6. must have at least a digit
        boolean sixthRule = pwd.replaceAll("[^0-9]", "").length() > 0;

        System.out.println(firstRule && secondRule && thirdRule && fourthRule && fifthRule && sixthRule);
    }
}
