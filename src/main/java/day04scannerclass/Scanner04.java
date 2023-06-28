package day04scannerclass;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //--------------- Scanner Class --------------------
        //example 1: ask user to enter width and the length of a rectangle then calculate the perimeter and the area
        Scanner inputInto = new Scanner(System.in);
        System.out.println("please enter width and length of a rectangle");

        double width = inputInto.nextDouble();
        double length = inputInto.nextDouble();
        System.out.println("the perimeter is " + (2*width + 2*length));
        System.out.println("the area is " + width*length);

    }

}
