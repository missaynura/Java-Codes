package day31mapsexceptions;

import java.util.HashMap;
//------------------------------- Exceptions ----------------------------------

/*
        1. when you create a HashMap Java gives you 16 buckets.
        2. Java puts indexes for every bucket from 0 to 15.
        3. when you put an entry into the map:
            i) Java creates hashcode for the key of the entry
            ii) Java divides the hashcode by 16 and gets the remainder as index, then puts the entry to the
                bucket whose index was found after division.
        4. if multiple entries will be put into a single bucket, java uses LinkedList structure.
        5. if 75% of existing buckets is full, then Java gives you another 16 buckets.
        6. to find a specific value, Java follows the steps liek:
            Index==Hashcode==Key==Return value
 */
public class HashMapMechanism {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Germany", 3);
        hm.put("Belgium", 12);
        hm.put("Albania", 3);

    }
}
