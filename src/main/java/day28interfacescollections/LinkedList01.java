package day28interfacescollections;

import java.util.LinkedList;

public class LinkedList01 {

    /*
        1. When you use ArrayList removing an element or adding an element makes the other
            elements reindexed. This is not good because reindexing many elements needs too much tasks.
            As a result; ArrayList is not successful in removing and adding elements
        2. When you use LinkedList to remove or add elements, it will change just the pointers,
             it will not need to reindex all the other elements that is why removing and adding elements in LinkedList will be so easy.
             As a result, LinkedList is so successful in removing and adding elements
        3. Search Operations are so easy in ArrayLists because every element has index like an address
        4. LinkedList is not successful in Search Operations because LinkedList does not use indexes I mean elements do not have addresses

     */
    public static void main(String[] args) {
        //How to create LinkedList
        LinkedList<Character> m = new LinkedList<>();

        //How to add nodes (like elements in Arrays) in a LinkedList
        m.add('A');
        m.add(0, 'H');
        m.addFirst('K');
        m.addLast('R');
        System.out.println(m);// [K, H, A, R]

        LinkedList<Character> n = new LinkedList<>();
        n.add('s');
        n.add('b');
        n.add('z');
        m.addAll(n);
        System.out.println(m);// [K, H, A, R, s, b, z]

        m.addAll(2, n);
        System.out.println(m);//[K, H, s, b, z, A, R, s, b, z]

        //removeFirst() == remove() is the same
        //remove() method removes the first node and returns the removed node
        System.out.println(m.remove());//K
        System.out.println(m); //[H, s, b, z, A, R, s, b, z]

        //remove works with objects and wrapper classes. Since R is a char you need to write wrapper class (Character)
        // for remove to work
        m.remove((Character) 'R');// if you put this into sout then it will print true - return is boolean
        System.out.println(m);//[H, s, b, z, A, s, b, z]

        m.remove(4); // you put this into sout it will return A
        System.out.println(m);//[H, s, b, z, s, b, z]

        m.removeFirstOccurrence('s'); // true boolean
        System.out.println(m);//[H, b, z, s, b, z]

        m.removeLastOccurrence('z');// true boolean
        System.out.println(m);//[H, b, z, s, b]

        m.removeFirst(); // will remove the first node/element

        m.removeLast();
        System.out.println(m);//[b, z, s]

        LinkedList<Integer> r = new LinkedList<>();
        r.add(12);
        r.add(5);
        r.add(14);
        r.add(12);
        r.add(1);
        System.out.println(r);//[12, 5, 14, 12, 1]

        //removes and returns the first element of this list.
        // This method is equivalent to removeFirst().
        //like cut+paste
        r.pop();//12
        System.out.println(r);//[5, 14, 12, 1]

        /*
        removeFirst() + pop()
        Removes and returns the first element from this list.
        Returns: the first element from this list
        Throws: NoSuchElementException – if this list is empty
        Note: if your task doesnt want to be your list to be empty use pop().

        remove()
        Retrieves and removes the first element of this list.
        Returns: the first element of this list
        Throws: NoSuchElementException – if this list is empty

        As a result:  removeFirst() + pop() + remove() do the same.

        poll() == use if you want to allow the list to be empty
        Retrieves and removes the head (first element) of this list.
        Returns: the head of this list, or null if this list is empty

        peek()  == use if you want to allow the list to be empty
        Retrieves, but does not remove, the first element of this list.
        Returns: the head of this list, or null if this list is empty

        element()
        Retrieves, but does not remove, the first element of this list.
        Returns: the head of this list
        Throws: NoSuchElementException – if this list is empty
         */

        //Retrieves, but does not remove, the head (first element) of this list.
        //Returns: the first element of this list
        // like copy+paste
        r.element();

        // Retrieves and removes the first element of the list.
        //cut+paste
        r.poll();

        //Retrieves, but does not remove, the first element of this list.
        //copy+paste
        r.peek();

    }
}
