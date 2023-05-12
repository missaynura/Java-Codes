package day03wrapperclasstypeecastingmethodcreation;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //How to create an object?
        Scanner subscriptionForm = new Scanner(System.in);

        System.out.println("hey user, enter your first name...");
        String yourName = subscriptionForm.next();
        System.out.println("Your name is " + yourName);

    }

}
