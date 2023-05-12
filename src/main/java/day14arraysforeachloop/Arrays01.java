package day14arraysforeachloop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays01 {
    /*
    1.Array can contain just "primitive" data types and "references"
     */
    public static void main(String[] args) {

        //e1. create an integer array with 4 elements, then find the sum of all elements
        int nums[] = new int[4];
        System.out.println(Arrays.toString(nums));//[0, 0, 0, 0]
        nums[0] = 12;
        nums[1] = 8;
        nums[2] = 10;
        nums[3] = 7;
        System.out.println(Arrays.toString(nums));//[12,8,10,7]
        int sum = 0; // we want to create a new container for summing of all elements

        for(int w : nums){
            sum = sum + w;
        }
        System.out.println(sum);


        //e2. create a string array with the length 5, print the elements whose length is more than 6 on the console.
        String[] cities = new String[5];
        System.out.println(Arrays.toString(cities)); //[null, null, null, null, null] for non-primitives Java uses null as default
        cities[0] = "Miami";
        cities[1] = "NY";
        cities[2] = "London";
        cities[3] = "Rome";
        cities[4] = "Paris";
        System.out.println(Arrays.toString(cities));

        for(String w1 : cities){
            if(w1.length()>5){
                System.out.println(w1 + " ");
            }


            //e3. create a string array with the length 5, print the elements before "London" on the console.
            String[] city = new String[5];
            System.out.println(Arrays.toString(city)); //[null, null, null, null, null] for non-primitives Java uses null as default
            city[0] = "Miami";
            city[1] = "New York";
            city[2] = "London";
            city[3] = "Rome";
            cities[4] = "Paris";
            System.out.println(Arrays.toString(city));

            for(String w : city){
                System.out.print(w + " "); // put before if, if you want to print London too
                if(w.equals("London")){
                    break;
                }

                //e4. create a string array with the length 5, print the elements except London and Miami
                String[] c = new String[5];
                System.out.println(Arrays.toString(c)); //[null, null, null, null, null] for non-primitives Java uses null as default
                c[0] = "Miami";
                c[1] = "New York";
                c[2] = "London";
                c[3] = "Rome";
                c[4] = "Paris";
                System.out.println(Arrays.toString(c));
                for(String w2 : c){
                    if(w2.equals("Miami") || w2.equals("London")){
                        continue;
                    }
                    System.out.print(w2 + " ");
                }

            }

        }
    }
}
