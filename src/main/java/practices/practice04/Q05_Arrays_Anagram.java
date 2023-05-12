package practices.practice04;

import java.util.Arrays;

public class Q05_Arrays_Anagram {
    /*
    Type code to check if two strings are Anagram or not.
    Anagram: A word or phrase made by using the letters of another word or phrase in a different order.
    e.g.:
    dormitory == dirty room
    debit card == bad credit
    eleven plus two == twelve plus one
    a decimal point == I'm a dot in place
    vacation time == I am not active
     */
    public static void main(String[] args) {
        System.out.println(isAnagram("dormitory", "dirty room"));
        System.out.println(isAnagram("a decimal point", "I'm a dot in place"));

    }

    public static boolean isAnagram(String str1, String str2){
        String [] arr1 = str1.toLowerCase().replaceAll("[^a-z]", "").split("");
        String [] arr2 = str2.toLowerCase().replaceAll("[^a-z]", "").split("");
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)){
            return true;
        }else {
            return false;
        }
    }
}
