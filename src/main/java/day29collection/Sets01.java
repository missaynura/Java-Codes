package day29collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {

    /*
        Sets are for sorting unique data like student ids, emails, etc.
        There are 3 sets i)HashSet == use this if order is not important
                            Hashing is a technique to create unique codes for data
                            HasSet does not put the element in any order. It puts them in random order.
                            HashSet is so fast because it doesnt spend time to order elements.
                            You can store just a single null in a HashSet, since it doesnt store repeated data, just unique data.
                         ii)LinkedHashSet == use this if you want to order them
                            Puts the elements in insertion oder
                            LinkedHashSet is slower than HashSet because it spends time in ordering elements
                         iii)TreeSet
                            Puts the elements in natural orders == alphabetical and ascending
                            This is the slowest set, as putting the elements in natural order.
                            doesnt accept null as element


     */
    public static void main(String[] args) {

        //pritns elements in added order
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(12);
        lhs.add(5);
        lhs.add(19);
        lhs.add(15);
        lhs.add(6);
        lhs.add(12);// when you add data repeatedly Java doesn't give error, but it accepts it just once
        lhs.add(23);
        lhs.add(null);
        System.out.println(lhs); //[12, 5, 19, 15, 6, 23]

        LinkedHashSet<Integer> mhs=new LinkedHashSet<>();
        mhs.add(43);
        mhs.add(19);
        mhs.add(6);
        mhs.add(50);
        mhs.add(23);
        mhs.add(65);
        System.out.println(mhs);//[43, 19, 6, 50, 23, 65]

        //checks for common elements between two LinkedHashSets and returns them,
        //removes from the fist collection all of its elements that are not contained in the specified collection.
        // keeping the same number of elements in the LinkedHashSet that is in the parenthesis
        lhs.retainAll(mhs);
        System.out.println(lhs);//[19, 6, 23]
        System.out.println(mhs);//[43, 19, 6, 50, 23, 65] didint change after retainAll()

        long t1 = System.nanoTime();

        //gives elements in random order
        HashSet<String> hs=new HashSet<>();
        hs.add("Germany");
        hs.add("Albania");
        hs.add("Belgium");
        hs.add("USA");
        hs.add("UK");
        hs.add("Albania");// when you add data repeatedly Java doesn't give error, but it accepts it just once
        hs.add("Turkey");
        hs.add(null);//normally added as first into the list
        System.out.println(hs);//[USA, Turkey, Belgium, UK, Germany, Albania]

        long t2 = System.nanoTime();

        //gives elements in natural order
        TreeSet<String> ts=new TreeSet<>();
        ts.add("Germany");
        ts.add("Albania");
        ts.add("Belgium");
        ts.add("USA");
        ts.add("UK");
        ts.add("Albania");// when you add data repeatedly Java doesn't give error, but it accepts it just once
        ts.add("Turkey");
        System.out.println(ts);//[Albania, Belgium, Germany, Turkey, UK, USA]

        long t3 = System.nanoTime();
        /*
            If you need to store unique elements in natural order do not use TreeSet to add elements
            because it is so slow. Use HashSet to add elements then convert the HashSet to TreeSet.
            So you will have unique elements in natural order and you will not be slow.
         */
        HashSet<String> hs2=new HashSet<>();
        hs2.add("Germany");
        hs2.add("Albania");
        hs2.add("Belgium");
        hs2.add("USA");
        hs2.add("UK");
        hs2.add("Albania");// when you add data repeatedly Java doesn't give error, but it accepts it just once
        hs2.add("Turkey");
        TreeSet<String> ts2 = new TreeSet<>(hs2);
        System.out.println(ts2);

        long t4 = System.nanoTime();

        //calculates the difference between HashSet and TreeSet take
        System.out.println(t2-t1); //109200 nano
        System.out.println(t3-t2); //1655300 nano
        System.out.println(t4-t3); //96800 nano


    }
}
