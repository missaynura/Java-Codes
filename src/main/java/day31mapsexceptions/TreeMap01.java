package day31mapsexceptions;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {

    /*
     1.TreeMap puts the entries in natural order by using keys.
     2.TreeMap is the slowest map, if you need entries to be in natural order:
        dont use TreeMap directly, use Hashmap to put entries into the map then convert it to TreeMap to sort them
     3. Treemaps are not thread safe and not synchronized. If you have multithreads you need to use HashTable.
     4. TreeMap doenst accept null in keys, but accepts null in values.
     */
    public static void main(String[] args) {

        long t1= System.nanoTime();
        TreeMap<String, Integer> tm=new TreeMap<>();
        tm.put("Ali Can", 13);
        tm.put("Tom Hanks", 65);
        tm.put("Brad Pitt", 56);
        tm.put("Ajda Pekkan", 76);
        System.out.println(tm);//{Ajda Pekkan=76, Ali Can=13, Brad Pitt=56, Tom Hanks=65}
        long t2= System.nanoTime();


        HashMap<String, Integer> hm=new HashMap<>();
        hm.put("Ali Can", 13);
        hm.put("Tom Hanks", 65);
        hm.put("Brad Pitt", 56);
        hm.put("Ajda Pekkan", 76);
        System.out.println(hm);//{Tom Hanks=65, Brad Pitt=56, Ajda Pekkan=76, Ali Can=13}

        long t3= System.nanoTime();
        HashMap<String, Integer> hmm=new HashMap<>();
        hmm.put("Ali Can", 13);
        hmm.put("Tom Hanks", 65);
        hmm.put("Brad Pitt", 56);
        hmm.put("Ajda Pekkan", 76);
        System.out.println(hm);//{Tom Hanks=65, Brad Pitt=56, Ajda Pekkan=76, Ali Can=13}

        TreeMap<String, Integer> tmm = new TreeMap<>(hmm);//convert HashMap to TreeMap to make it fast
        System.out.println(tmm);


        long t4= System.nanoTime();
        System.out.println(t2-t1);//1466000
        System.out.println(t3-t2);//118500
        System.out.println(t4-t3);//182300


    }
}
