package day17arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList01 {
    public static void main(String[] args) {

        //----------------------- Array List ----------------------------------
        //Example 1: Type code to check if the elements in a string arraylist are in alphabetical order or not
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Tampa");
        cities.add("Albany");
        cities.add("Jacksonville");
        System.out.println(cities); //[Miami, Tampa, Albany, Jacksonville]

        ArrayList<String> newCities = new ArrayList<>();
        newCities.addAll(cities);
        System.out.println(newCities);//[Miami, Tampa, Albany, Jacksonville]

        Collections.sort(newCities); // sort() method puts the list elements of string in alphabetical order,
        // sort() method puts the list elements of integers in ascending order,
        // alphabetical and ascending order are called natural order

        if (cities.equals(newCities)) {
            System.out.println("elements are in alphabetical order");
        } else {
            System.out.println("elements are not in alphabetical order");
        }

        //Example 2: Type code to find the closest values in an integer list
        // [12, 31, 15, 32, 54] == 31, 32

        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(31);
        ages.add(15);
        ages.add(32);
        ages.add(54);

        Collections.sort(ages);
        System.out.println(ages); // [12, 15, 31, 32, 54]

        int minDiff = ages.get(1) - ages.get(0);

        for (int i = 1; i < ages.size(); i++) {
            minDiff = Math.min(minDiff, ages.get(i) - ages.get(i - 1));
        }
        System.out.println(minDiff);

        for (int i = 1; i < ages.size(); i++) {
            if (minDiff == ages.get(i) - ages.get(i - 1)) {
                System.out.println(ages.get(i - 1) + "and" + ages.get(i));
            }
        }


        //Example 3: Type code to find the sum of the elements if they are different from 31 and 54
        // [12, 31, 15, 32, 54] == 12 + 15 + 32 = 59
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(31);
        nums.add(15);
        nums.add(32);
        nums.add(54);

        int sum = 0;
        for (Integer w : nums) {
            if (w == 31 || w == 54) {
                continue;    // code after continue will not be executed
            }
            sum = sum + w;
        }
        System.out.println(sum);//59

        //Example 4: Type code to check if all elements are unique or not in a list
        // [12, 31, 15, 32, 54] == unique
        ArrayList<Integer> n = new ArrayList<>();
        n.add(12);
        n.add(31);
        n.add(15);
        n.add(32);
        n.add(54);

        // best logic

        int counter = 0;

        for (Integer w : n) {
            if (n.indexOf(w) != n.lastIndexOf(w)) {
                System.out.println("all elements are not unique");
                break;
            } else {
                counter++;
            }
        }
        if (counter == n.size()) {
            System.out.println("all elements are unique");
        }
    }
}
