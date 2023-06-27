package homework.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays2D {
    public static void main(String[] args) {

//  Literal arrays
        //  Object arrays

        //Example 1 - object array
        // fixed length / size
        String[] name1 = new String[2];
        name1[0] = "Rob";
        name1[1] = "dsdsd";

        //Example 2 - literal array
        // easier to read
        String[] name2 = {"Rob", "Mike", "Mike","Mike","Mike","Mike", "Mike","Mike","Mike","Mike","Mike","Mike", "Mike","Mike","Mike","Mike"};

        String[] name3 = {
                "Rob",
                "Mike",
                "Mike",
                "Mike",
                "Mike",
                "Mike",
                "Mike",
                "Mike",
        };

        // 2d (multi-dimensional)arrays
        // Multiple related data which we need to store
        /*
         * Forms - username / name and last name / email address
         */

        // Object array
        String stringSomething = "Something";
        String[] stringArr = {"one", stringSomething};

        int number = 5;
        int[] numArr = {1, number};


        String var = "1";
        String[][] name31 = new String[1][2];

        name31[0][0] = "Jake";
        name31[0][1] = var;

        System.out.println(name31[0][1]);

        // {{"learn", "java", "it"}, {"is", "easy"}} == {"learn", "java", "it", "is", "easy"}
        String [][] words = {{"learn", "java", "it"}, {"is", "easy"}};

        //check 2d for literal
        //Arrays.deepToString() is to print multidimensional arrays

        String[][] name4 = {

                {"Jake", "Jake2"},
                {"Paul", "Paul2", "Paul3"}

        };



        System.out.println(Arrays.deepToString(name4));
        System.out.println(name4[1][0]);

        // ArrayLists
        ArrayList<Integer> name5 = new ArrayList<>();
        // adding elements
        name5.add(1);
        name5.add(2);
        name5.add(3);
        name5.add(4);
        name5.add(5);



        System.out.println(name5);
        System.out.println(name5);

        /*

            String[] name1 = new String[5];  OBJECT
            String[] name2 = {}; LITERAL

            String[][] name3 = new String[1][2];  OBJECT
            String[][] name3 = {



            }; LITERAL

               * 2d / multidimensional
               * length of array needs to be known beforehand
               * indexOutOfBoundsException - if index is out of range
               * length is == max but can be less than that
               * Arrays can be used for storing related data
               * We can store references to variables / primitives / non-primitives, and we
                 can get their values
               * with regular arrays we cannot modify them + cannot add or remove elements
               * new array must be created to merge older arrays together

            ArrayList<Integer> name5 = new ArrayList<>(); // COLLECTION
               * Dynamic - can change in size
               * we can modify them - adding or deleting elements is possible
                      * e.g. .add() - add new elements
                      * .remove()   - remove existing elements
                      * .clear()    - remove all elements
               * Many methods we can work with to do additional stuff with the array


            Other Notes:
               * Arrays.toString --> print elements if array is 1d (without nested arrays)
               * Arrays.deepToString() --> print all elements if array is 2d (nested arrays)
               * [] - single array or not nested
               * [][] - 2d array or 2 dimensional array or nested array
              -------
               * think of [] as boxes we stuff inside
         */


    }
}
