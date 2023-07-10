package day19arraylistsvarargs;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists01 {
    public static void main(String[] args) {
        //---------------------- Array List and Varargs ---------------------------
        List<String> emailDb = new ArrayList<>();
        emailDb.add("abc@gmail.com");
        emailDb.add("bcd@gmail.com");
        emailDb.add("cde@gmail.com");
        emailDb.add("ac@gmail.com");
        emailDb.add("bd@gmail.com");

        //Example 1: ask user to create an email address, if the email is unused we will accept it as email address
        // if the email is used give a message to user and create a unique email address for the user

        Scanner input = new Scanner(System.in);
        System.out.println("create an email address...");
        String email = input.next();

        if(emailDb.contains(email)){
            System.out.println("this is taken, you can use any of the followings..");
            LocalDate currentDate = LocalDate.now();
            String date = currentDate.toString().replaceAll("[^0-9]", "");

            LocalTime currentTime= LocalTime.now(); //10:10:56.693668800
            String time = currentTime.toString().split("\\.")[0].replaceAll("[^0-9]", ""); // mins and seconds 101431

            String recommended = email.split("@")[0] + date + time + "@" + email.split("@")[1]; // abc20230418101843@gmail.com
            System.out.println(recommended);
        }else {
            System.out.println("this email can be used");
            emailDb.add(email);
        }
        System.out.println(emailDb);
    }
}
