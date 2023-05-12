package day30iteratorsmaps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps03 {
    /*
    e1. type code to find the number of occurrences of letters in a sentence
    Java is easy. == J=1, a=3, v=1, i=1, s=2, y=1
     */
    public static void main(String[] args) {

    String sentence = "Java is easy.";

    sentence=sentence.replaceAll("[^A-Za-z]", "");
        System.out.println(sentence);//Javaiseasy
        String[] letters=sentence.split("");
        System.out.println(Arrays.toString(letters));//[J, a, v, a, i, s, e, a, s, y]

        HashMap<String, Integer> occurenceMap = new HashMap<>();
        for(String w:letters){
            Integer numOfOccurrence = occurenceMap.get(w);
            if(numOfOccurrence==null){
                occurenceMap.put(w,1);
            }else {
                occurenceMap.put(w, numOfOccurrence);
            }
        }
        System.out.println(occurenceMap);//{a=1, s=1, e=1, v=1, i=1, y=1, J=1}


    }
}
