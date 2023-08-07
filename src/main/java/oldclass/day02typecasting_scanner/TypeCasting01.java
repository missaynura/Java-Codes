package oldclass.day02typecasting_scanner;

public class TypeCasting01 {
    public static void main(String[] args) {
        //------------------------ Data Types ---------------------------------    
        /*
            There are 3 type sof data types in Java
            1. Primitive data types numeric = byte < short < int < long < float < double
            Is limited to objects, have values but no methods. It uses a stack memory.
    
            boolean = true or false
            char = for a single data
    
            2. Non-Primitive data types= String = used for multiple different characters storage.
            it has values and methods. It uses heap memory.
    
            String str = "tom hanks 123";
    
            Primitive vs. non-primitive data types:
            1. primitive d.types have just values, non primitive d.types
            have values and methods.
            2. primitive d.types are created by Java, we cannot create these.
            But we can create non-primitive d.types whenever we need.

            3. primitive data types use lowercase in naming convenstion.
            non-primitive d.types use upper case.
            4. usage of memory for primitive d.types changes from data type to data type.
            all non-primitive data types use same amount of memory in heap memory.
    
            There are 2 types of memory types in Java.
            1. Stack memory - 1. primitive data and 2. references (addresses) of non-primtive
            d.types are stored.
    
            2. Heap memory - stores non-primitive d.types/values.
        */

        int j = 23, i = 12;
        String str = "Tom";
        System.out.println(j + i + str);

        /*
            Example1: create 2 int variables and 1 string variable.
            Primitive data types are created by Java, that dont have methods,
            = byte< short <int < long < float <double -- char and boolean
            non-primitive data types have both values and methods, so you
            can create your own data type in non-primitive d.type.
         */

    int a=12;
    int b=11;
    String name = "Tom";
        System.out.println(a + b + name);
        System.out.println(name + a + b);
        System.out.println(name + (a + b));

        /*
            Type Casting
            1. AutoWidening: Java can put small data types into larger d.types
            automatically. when you put small d.type into a larger d.type, you are
            widening the small d.type.
    
            Java does not put large d.type into to small d.type
    
            2. Explicitly Narrowing: Java does not put large d. types into small d.types
            automatically. Java thinks this is risky. To spped up an app we sometimes need
            to put larger d.t. into smaller ones.
         */

    int m= 45;
    System.out.println(m);

    double d = m;
    System.out.println(d);

    int n = 15;
    byte b1= (byte) n;
    }
}
