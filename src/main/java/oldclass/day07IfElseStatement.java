package oldclass;

import java.util.Scanner;

public class day07IfElseStatement {
    public static void main(String[] args) {
        //-------------------- If Statements ---------------------------
        //Exercise 1: Ask user to enter his/her age. If the age is between 18 and 65 then output will be “You should work”,
        //else output will be “No need to work”
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();

        if(age>17 && age<66){
            System.out.println("you should work");
        }else{
            System.out.println("no need to work");
        }

        //Exercise 2: Ask user to enter his/her age and gender. If the age is more than 65 and the gender is male
        //then output will be “Hey man you retired!” else output will be “No need to work”
        Scanner inputnew = new Scanner(System.in);
        System.out.println("Enter your age");
        byte age1 = inputnew.nextByte();

        System.out.println("enter your gender");
        String gender = inputnew.next();

        if(age1>64 && gender.equalsIgnoreCase("male")){
            System.out.println("hey man you retired");
        }else{
            System.out.println("no need to work");
        }
    }
}
