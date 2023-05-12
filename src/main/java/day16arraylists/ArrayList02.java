package day16arraylists;

import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {
        //e1.create 2 character Arraylist and check if the lists are equal to each other or not
        ArrayList<Character> ch1 = new ArrayList<>();
        ch1.add('j');
        ch1.add('a');
        ch1.add('v');
        ch1.add('a');
        System.out.println(ch1); //[j,a,v,a]

        ArrayList<Character> ch2 = new ArrayList<>();
        ch2.add('j');
        ch2.add('a');
        ch2.add('v');
        ch2.add('a');
        System.out.println(ch2); //[j,a,v,a]

        if(ch1.equals(ch2)){  // equals() check 1. size, 2. elements, 3. indexes of the elements
            System.out.println("they equal..");
        }else{
            System.out.println("they are not equal..");
        }

        int idxOfFistOccurance = ch1.indexOf('a'); // 1
        System.out.println(idxOfFistOccurance);
        int idxOfLastOccurance = ch1.lastIndexOf('a');// 3
        System.out.println(idxOfLastOccurance);

        // e2. type code to print unique elements in an Arraylist ==========       INTERVIEW QUESTION
        ArrayList<Character> letters = new ArrayList<>();
        letters.add('j');
        letters.add('a');
        letters.add('v');
        letters.add('a');
        System.out.println(ch2); //[j,a,v,a]

        for(Character w : letters){

            if(letters.indexOf(w)==letters.lastIndexOf(w)){
                System.out.print(w);
            }
        }
    }
}
