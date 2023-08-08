package oldclass;

import java.util.Scanner;

public class day07IfElseHW03 {
    public static void main(String[] args) {
        //-------------------- If-Else Statement ---------------------------
        //Example 3: Ask user to enter a character, then check whether the character is alphabet or not
        Scanner inputChar = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = inputChar.next().charAt(0);

        if(ch>='A' && ch<='Z'){
            System.out.println("this is alphabet");
        }else if(ch>='a' && ch<='z') {
            System.out.println("this is alphabet");
        }else{
            System.out.println("not alphabet");
        }

        //Example 4: Ask user to enter any name of the week, then get second ,fourth,
        //and sixth letter of the day name and print them on the console, in the same line.
        //For example; if the user enters “Monday” output will be “ody”
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of the week");
        String dayOfWeek = input.nextLine();
        boolean isWeeksay = dayOfWeek.equalsIgnoreCase("monday") ||
                            dayOfWeek.equalsIgnoreCase("tuesday") ||
                            dayOfWeek.equalsIgnoreCase("wednesday") ||
                            dayOfWeek.equalsIgnoreCase("thursday") ||
                            dayOfWeek.equalsIgnoreCase("friday")||
                            dayOfWeek.equalsIgnoreCase("saturday")||
                            dayOfWeek.equalsIgnoreCase("sunday");
        if(isWeeksay){
            System.out.println(dayOfWeek.substring(1,2) + dayOfWeek.substring(3,4) + dayOfWeek.substring(5,6));
        }else{
            System.out.println("invalid entry");
        }
    }
}
