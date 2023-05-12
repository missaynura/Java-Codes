package ssg;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        /*
        e1. create an integer array with 5 elements and print elements on console
         */

        int[] i = new int[5];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        i[3] = 4;
        i[4] = 5;

        System.out.println(Arrays.toString(i));

        //e2. print elements that are less than or equal to 7 on console

        int [] num = new int[7];
        num[0] = 1;
        num[1] =7;
        num[2] = 5;
        num[3] = 3;
        num[4] = 6;
        for(int w : num){
            if(w<8){
                System.out.println(w + " ");
            }
        }

    }
}
