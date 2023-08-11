package practices.practice02;

import java.util.Scanner;

public class Q02_Regex_Fullname {
    public static void main(String[] args) {
        //------------------------- Regex -----------------------------------
        /*
            divide the 2-word name and surname you will receive from the user into 2 separate words.
            print the name and surname on the screen separately
            Input: John doe
            Name: John
            Surname: Doe
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your first name and lastname with a space between them");
        String fullName = scanner.nextLine().replaceAll("[^a-zA-Z ]", "").replaceAll("\\s+", " ").trim();// \\s+ == means one or more spaces

        String name = fullName.split(" ")[0].substring(0,1).toUpperCase()+fullName.split(" ")[0].substring(1).toLowerCase();
        String surName = fullName.split(" ")[1].substring(0,1).toUpperCase()+fullName.split(" ")[1].substring(1).toLowerCase();

        System.out.println("Name " + name + "\nSurname "+ surName);
    }
}
