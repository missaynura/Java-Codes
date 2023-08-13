package practices.practice04;

import java.util.Scanner;

public class Q02_ForLoop_PerfectNumber {
//--------------------- Practice -------------------------------
    /*
        type code to ask user to enter an integer to check if it is a perfect number or not
        a perfect number is a postivie integer that is equal to the sum of a ll its proper divisors.
        6 = 1+2+3, 28=1+2+4+7+14 (496 and 8128)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter an integer");
        int number = scanner.nextInt();

        int sum = 0;
        for(int i=1; i<number; i++){
            if(number%i==0){
                sum+=i;
            }

        }
        if(sum==number){
            System.out.println(number + " is perfect number");
        }else {
            System.out.println(number + " is not perfect number");
        }
    }
}
