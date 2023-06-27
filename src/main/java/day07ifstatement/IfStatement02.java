package day07ifstatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //e1. ask user to enter day name then print if the day name is week day or weekend day
        //  Monday -- weekday   Sunday -- weekend
        Scanner input = new Scanner(System.in);
        System.out.println("enter a day name");
        String dayName = input.next(); //.next because a single line
        //1. way
        if (dayName.equalsIgnoreCase("Sunday")) {
            System.out.println("weekend");
        } else if (dayName.equalsIgnoreCase("monday")) {
            System.out.println("weekday");
        } else if (dayName.equalsIgnoreCase("tuesday")) {
            System.out.println("weekday");
        } else if (dayName.equalsIgnoreCase("wednesday")) {
            System.out.println("weekday");
        } else if (dayName.equalsIgnoreCase("thursday")) {
            System.out.println("weekday");
        } else if (dayName.equalsIgnoreCase("friday")) {
            System.out.println("weekday");
        } else if (dayName.equalsIgnoreCase("saturday")) {
            System.out.println("weekend");
        } else {
            System.out.println("invalid entry");
        }

        //2. way
        boolean isWeekDay = dayName.equalsIgnoreCase("monday") ||
                dayName.equalsIgnoreCase("tuesday") ||
                dayName.equalsIgnoreCase("wednesday") ||
                dayName.equalsIgnoreCase("thursday") ||
                dayName.equalsIgnoreCase("friday");
        boolean isWeekEnd = dayName.equalsIgnoreCase("Sunday") ||
                dayName.equalsIgnoreCase("saturday");

        if (isWeekEnd) {
            System.out.println("weekend");
        } else if (isWeekDay) {
            System.out.println("weekday");
        } else {
            System.out.println("invalid entry");
        }
    }
}
