package day02variables;

public class Variables02 {
    /*
       non-primitive data types: they can be created by Java. e.g. String, Arrays, Scanner, etc.
                               and developers, e.g. Variables01, etc.
                               are infinitely many.

        String data type: is for multiple characters.
                                put the value between double quotes.
    */
    public String nameOfStudent = "Tom Hanks";

    /*
        What is the difference between Primitive and Non-Primitive data types?
        1. primitive data types created by Java, developers cannot create them
           but non-primitive data types can be crated by both Java and developers

        2. primitive data type names start with lower cases, non-primitives start
            with upper cases.
        3. primitive data types are just 8, non-primitives are infinitely many.
        4. primitive data types are stored in stack memory, non-primitives in heap memory.
        Note: stack memory stored 1. primitive data types and 2. addresses(reference) of
              non-primitive datat types heap memory stores non-primitive data types.
        !!!!!5. non-primitve data types have methods together with values, primitive ones
                do not have methods, just values.
    */

    public int num = 45;
    public String city = "Miami";

    /*
        Main method works first in an application, like an engine in a car.
        Every application need a main method, if you do not have main method
        application cann not run.

        void is one of the return types in a method.
        if a method does not produce a new data make the return type void.

        how to create a main method.
     */

    public static void main(String[] args) {

        String countryName = "Germany";
        System.out.println(countryName.toUpperCase());
        System.out.println(countryName.length());

    }
}
