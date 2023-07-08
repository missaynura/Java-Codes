package day16arraylists;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        //--------------------- ArrayList ---------------------------
        /*
        1.ArrayLists are for storing multiple data in the same data type
        2.arrays are fixed in length, but arrayLists are flexible in size
        3. if arrays are not good, why didnt Java remove them
        because arrays use memory so little, and arrays are super fast
        if you are sure about the length, use arrays instead of arrayLists
       4. arrays can store just primitive data and references of non-primitive data
       arrayLists can store just non-primitive data
       5. arrays are poor in methods, arrayLists are so rich in methods
         */
                 //how to create an arrayList
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names);//[]

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("New York");

                //how to add elements into an arraylist

        //add() method adds the elements into the list in insertion order
        names.add("Tom");
        names.add("Mark");

        //add(index, element) puts the given element into the given index
        names.add(1, "Jim");

        //.addAll() method is for adding a list into another list == joining lists
        names.addAll(cities);

        //.addAll(index, element) is adding a list into another list at the given index
        names.addAll(2, cities);

        System.out.println(names);//[Tom]


                //how to chedk if a list is empty or not

        ArrayList<String> countries = new ArrayList<>();
        countries.add("UK");
        countries.add("US");

        //get the number of elements in the list, if it is zero it means the list is empty
        if(countries.size()==0){  //size() method gives you the number of elements in a list
            System.out.println("the list is empty");
        }else{
            System.out.println("the list is not empty");
        }

        //2.way
        if(countries.isEmpty()){
            System.out.println("the list is empty");
        }else{
            System.out.println("the list is not empty");
        }

        //e1. add "TR" to the list if it doesn't exist

        if(!countries.contains("TR")){
         countries.add("TR");
        }
        System.out.println(countries); //[UK, US, TR]


        //E2. change the second element to America
        countries.set(1, "America");
        System.out.println(countries); //[UK, America, TR]

        //e3. remove elemetns if the length is 2
        //remove() method cannot be used in for-each loop
        //for(String w : countries){
        //    if(w.length()==2){
         //       countries.remove(w);
           // }
   //     }

        for(int i=0; i<countries.size(); i++){ // size because it is an arrayList
            if(countries.get(i).length()==2){ // length because it is an array
               countries.remove(i);
            }
        }
        System.out.println(countries); //[America]


        //e4. create an integer arraylist and remove a specific element
        ArrayList<Integer> ages = new ArrayList<>(); // Integer as Wrapperclass, as int cannot be used for Arraylists,as it is a primitive d.t.
        ages.add(12);
        ages.add(5);
        ages.add(23);
        ages.add(19);
        System.out.println(ages);

        //if you use integer in remove() method, Java will accept it as indes.
        //if you want to make it Integer element, use autoboxing like (Integer)23
        ages.remove((Integer) 23);
        System.out.println(ages);

        //e5. create an integer arraylist and remove multiple elements
        ArrayList<Integer> nums = new ArrayList<>(); // Integer as Wrapperclass, as int cannot be used for Arraylists,as it is a primitive d.t.
        nums.add(12);
        nums.add(5);
        nums.add(23);
        nums.add(19);
        System.out.println(nums);

        ArrayList<Integer> heights = new ArrayList<>();
        heights.add(12);
        heights.add(23);

        nums.removeAll(heights);
        System.out.println(nums);


    }
}
