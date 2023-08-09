package oldclass;

import java.util.Scanner;

public class day07IfElseStatement02 {
    public static void main(String[] args) {
        //----------------- If-Else Statement -------------------
        //Type java code by using if-else if() statement.
        //A school has following rules for grading system:
        //1. Below 50 - D 2. 50 to 59 - C 3. 60 to 80 - B. 4. From 80 to 100 - A
        //Ask user to enter marks and print the corresponding grade.
        Scanner inputGrd = new Scanner(System.in);
        System.out.println("enter your mark");
        byte markNum = inputGrd.nextByte();

        if(markNum<50){
            System.out.println("your grade is D2");
        }else if(markNum>49 && markNum<60){
            System.out.println("your grade is C3");
        }else if(markNum>59 && markNum<81){
            System.out.println("your grade is B4");
        }else if(markNum>80){
            System.out.println("your grade is A");
        }else{
            System.out.println("invalid entry");
        }

        //Ask user to enter annual salary, if the salary is more than or equal
        //to $80.000 output will be “I accept the offer”, if the salary is between
        //$60.000 and $80.000 out put will be “I negotiate to increase”,
        //otherwise output will be “I do not accept the offer.”
        Scanner input = new Scanner(System.in);
        System.out.println("enter your annual salary");
        int annualSalary = input.nextInt();
        if(annualSalary>=80000){
            System.out.println("I accept the offer");
        }else if(annualSalary>59999){
            System.out.println("I negotiate to increase");
        }else{
            System.out.println("I do not accept the offer");
        }
    }
}
