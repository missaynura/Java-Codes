package day07ifstatement;

public class IfStatement01 {

    //if it rains I will cancel the picnic
    //%modulus operator returns remainder
    // || or operator

    public static void main(String[] args) {

        //e1: type a code to check if a number is even or odd.
        int num = 11;
        //1. Way
        if (num % 2 == 0) {
            System.out.println("even");
        }

        if (num % 2 != 0) {
            System.out.println("odd");
        }

        //2. Way
        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        //e2: type code to check if initial of a string is upper case or not
        String s = "miami";

        //1.Way

        if (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') {
            System.out.println("it is upper case ");
        }

        if (s.charAt(0) < 'A' || s.charAt(0) > 'Z') {
            System.out.println("not upper case");
        }
        //2.Way with else

        if (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') {
            System.out.println("it is upper case ");
        } else {
            System.out.println("not upper case");
        }
        //e3. type a code to check if a number is positive, negative or neutral
        int number = 23;

        if (number > 0) {
            System.out.println("positive");
        } else if (number == 0) {
            System.out.println("neutral");
        } else {
            System.out.println("negative");
        }
        //e.4 type a code to print the week day name when you enter number
        //   1 -- Sunday, 2 -- Monday, etc.
        int dayNumber = 2;

        if (dayNumber == 1) {
            System.out.println("sunday");
        } else if (dayNumber == 2) {
            System.out.println("monday");
        } else if (dayNumber == 3) {
            System.out.println("tuesday");
        } else if (dayNumber == 4) {
            System.out.println("wednesday");
        } else if (dayNumber == 5) {
            System.out.println("thursday");
        } else if (dayNumber == 6) {
            System.out.println("friday");
        } else if (dayNumber == 7) {
            System.out.println("saturday");
        } else {
            System.out.println("invalid day number, please enter number from 1 to 7");
        }
    }
}
