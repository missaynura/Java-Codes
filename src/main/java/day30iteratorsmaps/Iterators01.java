package day30iteratorsmaps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    /*
        1. Iterators do the same with he loops
        2. Loops have infinite loop risk but iterators do not have it
        3. There are two types of iterators
            i)Iterator: you can just remove the elements, it is impossible to update or to add new elements
                        you can use elements from first to the last. It has one direction.
            ii)ListIterator: you can remove, update and add the elements
                        you can use elements from first to the last and from the last to the first. It is bidirectional.
     */
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList); //[Tom, Jim, Clara, Angie, Mark]

        //how to use Iterator
        Iterator<String> itr = myList.iterator();// converts the list to Iterator

        while (itr.hasNext()){ // hasNext() asks the pointer if there is any element after the pointer or not
            itr.next();//next() takes the pointer to the right and returns the jumped over element

            itr.remove();//remove() removes the element next() method returned
        }
        System.out.println(myList);// []

        //how to use ListIterator
        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        yourList.add("Angie");
        System.out.println(yourList); //[Tom, Jim, Clara, Angie]

        ListIterator<String> lr = yourList.listIterator(); // converts the list to ListIterator

        while (lr.hasNext()){
            lr.next();

        }

        while (lr.hasPrevious()){
            String el=lr.previous();
            lr.set(el + "!");
        }

        System.out.println(yourList);
    }
}
