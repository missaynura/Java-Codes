package day30iteratorsmaps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps02 {

    /*
    if you want to store keys and values (if you see key value structure) == use Maps
    if you want to store unique values == use Sets
    if you see FIFO == use Queues
    if you do adding and removing operations == use LinkedLists
     */
    //Interview Question
    //e1. type code to find the number of occurences of the word in a sentence
    // e.g. Java, I like Java Java. Java==3, I =1, like=1

    public static void main(String[] args) {
    String sentence="Java, I like Java Java.";

    // String is immutable, if you dont do the assignment operation it will not be updated.
    // Remove punctuation marks to make "Java," and "Java" and "Java." same with "Java"
    sentence = sentence.replaceAll("\\p{Punct}", "");
        System.out.println(sentence);//Java I like Java Java

    //to get the words use split(" ")
    String[] words= sentence.split(" ");
        System.out.println(Arrays.toString(words));//[Java, I, like, Java, Java]

        HashMap<String, Integer> occurrenceMap = new HashMap<>();
        for(String w: words){
            Integer numOfOccurrences = occurrenceMap.get(w);
            if(numOfOccurrences==null){
                occurrenceMap.put(w,1);
            }else {
                occurrenceMap.replace(w, numOfOccurrences+1);
            }
            System.out.println(occurrenceMap);
            //{Java=1, like=1, I=1}
            //{Java=2, like=1, I=1}
            //{Java=3, like=1, I=1}
        }

    }
}
