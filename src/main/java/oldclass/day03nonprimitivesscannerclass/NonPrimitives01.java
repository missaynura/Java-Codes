package oldclass.day03nonprimitivesscannerclass;

public class NonPrimitives01 {
    public static void main(String[] args) {
        String stdName = "Tom Hanks";

        String teacherName = "Tom Hanks";
        String principalName = "Bradd Pitt";
        String parentName = new String("Tom Hanks");

        /* Java puts non-primitive d.types into heap memory and if the variable empty
    it will put null inside the memory, as a default value. null is an empty object, as non-primities
    have value and method.
    */

    int age = 12;

    /*
    Primitive d.types are saved in stack memory. when the variable
    empty then Java puts 0 into the memory, as a default value.
    */

    /*
    What are the differences between primitive and non-primitive data type?
    1. non-primitive data is stored in Heap Memory, primitive data in Stack Memory
    2. Non-primitive data types are infinitely many, primitives are just 8
    3. non-primitive d.t. can be created by Java and Java Devs, primitive d.t. can be
    created just by Java.
    4. non-primitive d.t. names start with upper-cases, primitive d.t. use just lower-cases.
    5. non-primitive d.t. have 1. value and 2. methods in them.
    primitive d.t. have only values.
     */

    /*
    When you create a string, Java will check the string  pool first,
    if the value you assigned exists in the string pool, java will not create
    a new container, java will use existing container.
    If the string pool doesnt have the value you assigned, java will create a new containler.

    Sometimes we may need a different container even though the values are the same.
    how can we do it.
     String parentName = new String("Tom Hanks");

     */
    }


}
