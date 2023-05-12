package day18arraylists;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        // Interview question, deleting the repetition, by creating a new list, and put the elements into the new list one by one

        //e1. type code to find the number of different elements in an arraylist
        // [2, 3, 1, 2, 1, 5, 3] == [2,3,1,5] ==4
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(1);
        nums.add(2);
        nums.add(1);
        nums.add(5);
        nums.add(3);
        System.out.println(nums);

        ArrayList<Integer> newNums = new ArrayList<>();

        for(Integer w : nums) {
            if(!newNums.contains(w)){
                newNums.add(w);
            }
        }
        System.out.println(newNums);
        System.out.println(newNums.size());

        //e2. type code to increase salaries in a list like if the salary is less than 10000
        // increase it 20% otherwise increase it by adding 500usd
        ArrayList<Double> salaries = new ArrayList<>();
        salaries.add(9810.0);
        salaries.add(12450.0);
        salaries.add(15230.0);
        salaries.add(7500.0);
        salaries.add(10000.0);
        System.out.println(salaries); //[9810.0, 12450.0, 15230.0, 7500.0, 10000.0]

        for(Double w : salaries){
            if(w<10000.0){
                salaries.set(salaries.indexOf(w), w*1.2);
            }else {
                salaries.set(salaries.indexOf(w), w+500);
            }
        }
        System.out.println(salaries);//[11772.0, 12950.0, 15730.0, 9000.0, 10500.0]

        //more methods in ArrayLists
        ArrayList<Integer> n = new ArrayList<>();
        n.add(2);
        n.add(3);
        n.add(1);
        n.add(2);
        n.add(1);

        ArrayList<Integer> p = new ArrayList<>();
        p.add(2);
        p.add(3);
        p.add(9);

        n.retainAll(p);
        System.out.println(n); //[2, 3, 2] == retainAll() keeps the common elements in the first list and removes the different elements
        System.out.println(p);// [2, 3, 9] == the list inside the retainAll() parenthesis doe not change
    }
}
