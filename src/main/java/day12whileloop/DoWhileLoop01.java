package day12whileloop;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        //while loop checks the condition first then executes the loop body
        // if the condition is false loop body will not be executed even once.
        // I mean zero execution is possible in while-loop

        //do-while loop execute the loop body then checks the condition
        // if the condition is false loop body will  be executed even once.
        // I mean zero execution is impossible in do-while-loop

    //while loop
        int i=1;
        while(i<1){
            System.out.println("Im while loop"); // will not print
            i++;
        }
        //do-while loop
        int k=1;
        do{
            System.out.println("Im do-while loop");
            k++;
        }while(k<1);


        //e1. ask user to enter an integer
        //if the integer is less thatn 100, tell user "Won"
        //otherwise, tell user "lost"
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("enter an integer");
            int num = input.nextInt();

            if(num<100){
                System.out.println("Win");
            }else{
                System.out.println("lost");
                break;
            }

        }while(true);


    }
}
