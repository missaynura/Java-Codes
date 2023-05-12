package day19arraylistsvarargs;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists02 {
    public static void main(String[] args) {
        //e2. ask user to enter an integer from 1 to 10
        //if the number exists in the database change the number to bingo
        // if it doesnt exist in the database add it into the DB
        //if all records in DB are bingo, give message to user you won

        List<String> dataBase = new ArrayList<>();
        dataBase.add("5");
        dataBase.add("8");
        dataBase.add("2");
        dataBase.add("9");

        Scanner input = new Scanner(System.in);
        int counter = 0;

        do{
            System.out.println("enter an integer from 1 to 10");
            String n = input.next();

            int num = Integer.valueOf(n);
            if (num>10 || num<1){
                System.out.println("use the numbers from 1 to 10");
            }else if(dataBase.contains(n)){
                dataBase.set(dataBase.indexOf(n), "Bingo");
                counter++;
           }else {
                dataBase.add(n);
            }
            if(counter==dataBase.size()){
                System.out.println("you won!");
                break;
            }

        }while (true);
        System.out.println(dataBase);

    }
}
