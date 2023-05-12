package day15multidimentionalarrays;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        //how to create multidimensional array
        int[][] name = new int[3][2]; // this syntax you will define inner array size as 2, it cannot have bigger length

        //Arrays.toString() is to print one dimensional arrays
        System.out.println(Arrays.toString(name)); //[[I@3ac3fd8b, [I@5594a1b5, [I@6a5fc7f7]

        //Arrays.deepToString() is to print multidimensional arrays
        System.out.println(Arrays.deepToString(name));//[[0, 0], [0, 0], [0, 0]]

        //how to add elements into a multidimensional array
        name[0][0] = 8;
        name[0][1] = 10;

        name[1][0] = 7;
        name[1][1] = 5;

        name[2][0] = 11;
        name[2][1] = 3;
        System.out.println(Arrays.deepToString(name)); //[[8, 10], [7, 5], [11, 3]]

        //how to create a multidimensional array in short way
        int[][] b = {{9, 12, 31}, {5, 4}, {8}, {10, 6}};
        System.out.println(Arrays.deepToString(b)); //[[9, 12, 31], [5, 4], [8], [10, 6]]

        //e1. create a multidimensional array and find the sum of all elements in the multidimensional array
        int [][] c = {{4, 5}, {9, 11, 6}};
                            //{{4, 5}, {9, 11, 6}}
        int sum = 0;
        for(int[] w : c){

            for (int u : w){
                sum = sum + u;
            }
        }

        System.out.println(sum);

        //e2. type code to find the total number of elements in a multidimensional array
        String [][] names = {{"Tom"}, {"Jim", "Ali"}, {"Mark", "Jack", "Brad"}};

        int total = 0;
        for(String[] w : names){
            total = total + w.length;
        }
        System.out.println(total);

    }

}
