package homework;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class calculator {
    /*
        Check if elements are in descending order in a list
        Example: (Yellow, Blue, Red, Green) ==> Output: It is not in descending order
        (Yellow, Red, Green, Blue) ==> Output: It is in descending order
        -use ArrayList
        -
     */

    public static void main(String[] args) {

        List<String> descendingList = new ArrayList<>();
        descendingList.add("Yellow");
        descendingList.add("Blue");
        descendingList.add("Red");
        descendingList.add("Green");
        System.out.println(descendingList);

        Collections.sort(descendingList);
        Collections.reverse(descendingList);
        System.out.println(descendingList);

        calculator(5, 5, "a");


    }

    //Create a method that takes two integers as arguments and returns their sum.
    public static void calculator(int a, int b, String operation) {
        switch (operation) {
            case "+":
                System.out.println(a + "+" + b + "=" + (a + b));
                break;
            case "-":
                System.out.println(a + "-" + b + "=" + (a - b));
                break;
            case "/":
                System.out.println(a + "/" + b + "=" + (a / b));
                break;
            case "*":
                System.out.println(a + "*" + b + "=" + (a * b));
                break;
            default:
                System.out.println("Wrong entry");
        }

    }

}
