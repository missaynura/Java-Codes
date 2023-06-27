package day31mapsexceptions;

import java.util.Hashtable;

public class HashTable01 {
    /*
        1. HashTable is thread-safe and synchronized, but HashMap is not.
        2.HashTable puts the elements in random oder.
        3. to be thread-safe and synchronized needs time, so HashTable is slower than HasMap
        4. HashTable does not accept null in keys and in values. HashMap accepts one null in keys and multiple in values.
     */
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("Ali Can", 13);
        ht.put("Tom Hanks", 65);
        ht.put("Brad Pitt", 56);
        // ht.put(null, 45);== hashtable does not accept null in keys
        //ht.put("Ali", null); == hashtable does not accept null in values
        System.out.println(ht);//{Tom Hanks=65, Ali Can=13, Brad Pitt=56}

        ht.get("Angelina Jolie");//null
        ht.getOrDefault("Angelina Jolie", -1);//-1

        //System.out.println(ht.get("Ali Can")+ ht.get("Tom Hanks")+ ht.get("Brad Pitt")+ht.get("Angelina Jolie"));
        System.out.println(ht.getOrDefault("Ali Can", 0) + ht.getOrDefault("Tom Hanks", 0) + ht.getOrDefault("Brad Pitt", 0) + ht.getOrDefault("Angelina Jolie", 0));
    }
}
