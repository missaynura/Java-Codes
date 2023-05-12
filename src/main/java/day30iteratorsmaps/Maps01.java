package day30iteratorsmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps01 {

    /*
     1. Maps are for storing multiple data
     2. Maps use key - value structure to store multiple data.
     3. keys are unique, values can be repeated
     4. every map element is called entry
     5. all map elements are called entry set
     6. all map elements are unique because key part is unique
     7. there are 3 maps in Java
    Note: if you use same key with a different value in put(), it means you are updating the value.
        e.g. cp.put("Germany", 83); then cp.put("Germany", 83); means you update 83 to 87. Do not use put for
        updating the value, use replace()
    Note: Map structure cannot be used in loops. But when you use entrySet() method, it will take all entries and put them
        into a set. For Sets you can use loops.
        i) HashMap
            a)HashMap puts the elements in random order, it is so fast
            b)HashMap accepts null as key just once
            c)HashMap accepts multiple null in the value part
        ii)HashTable
        iii)TreeMap
     */
    public static void main(String[] args) {

        HashMap<String, Integer> cp = new HashMap<>();
        cp.put("USA", 400);
        cp.put("Germany", 83);
        cp.put("Turkey", 85);
        System.out.println(cp);// {USA=400, Turkey=85, Germany=83}

        //E1. find the average population of the given countries
        Collection<Integer> values=cp.values(); //values() gives you all values in value part in a Collection
        System.out.println(values); //[400, 85, 83]

        double sum=0;
        for(Integer w : values){
            sum = sum +w;
        }
        double avg=sum / values.size();
        System.out.println(avg);//189.33333333333334
        System.out.println(values.size()); //3

        //E2. print the country names containing r
        Set<String> keys = cp.keySet(); //keySet() gives you all keys in a Map

        for(String w : keys){
            if(w.contains("r")){
                System.out.print(w + " "); //Turkey Germany
            }
        }

        //How to get value of a specific key
        int populationOfTurkey = cp.get("Turkey"); //get() gives you the value of a specific key
        System.out.println(populationOfTurkey);

        //How to check if keys have a specific key
        boolean isExist1=cp.containsKey("Belgium");
        System.out.println(isExist1);//false

        //how to check if values have a specific value
        boolean isExist2=cp.containsValue(85);
        System.out.println(isExist2);//true

        //Note: if you use same key with a different value in put(), it means you are updating the value.
        //        e.g. cp.put("Germany", 83); then cp.put("Germany", 83); means you update 83 to 87. do not use put
        //        for updating value, use replace()

        //How to update value of a key
        cp.replace("Germany", 99);
        System.out.println(cp);

        cp.replace("Germnay", 83, 100);
        System.out.println(cp);//will not update the value, as the value of Germany is 99, it will only update if the key and the value match

        cp.putIfAbsent("USA", 500);
        System.out.println(cp);// will not add, because USA exists. But if you change to UK it will add it to the list

        //how to get all entries in a set
        //Note: Map structure cannot be used in loops. But when you use entrySet() method, it will take all entries and put them
        //into a set. For Sets you can use loops.
        Set<Map.Entry<String,Integer>> allEntries = cp.entrySet();
        for(Map.Entry<String,Integer> w : allEntries){
            System.out.print(w.getValue() + " - " + w.getKey());//400 - USA  85 - Turkey   99 - Germany
        }


    }
}
