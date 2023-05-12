package oldclass;

import java.util.Scanner;

public class day07IfElseHW04 {
    public static void main(String[] args) {
        //ex.5: Type java code by using if-else statement,
        //if the password is “JavaLearner”, output will be “The password is true”.
        //Otherwise, output will be “The password is false”.
        String pwd = "JavaLearner";

        if(pwd=="JavaLearner"){
            System.out.println(pwd);
        }else{
            System.out.println("the password is false");
        }


        //ex.6: Type java code by using if-else statement,
        //Write a program to print absolute value of a number entered by user.
        //Absolute Value: If the number is positive or zero return the number itself
        //If the number is negative return the number after multiplying by -1
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number...");
        int num = input.nextInt();
        if(num>=0){
            System.out.println(num);
        }else if(num<0){
            System.out.println(-1*num);
        }else{
            System.out.println("invalid");
        }

    }
}
