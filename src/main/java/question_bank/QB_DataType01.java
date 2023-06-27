package question_bank;

import java.util.ArrayList;

public class QB_DataType01 {
    public static void main(String[] args) {
        /* You cannot change the value of primitives to anything else.
           If you need to change the value of primitives,
           you must declare a new primitive variable and re-assign it a new value.

         * Non-primitives => Mutable - String, Arrays, Collections
         * Primitives =>     Immutable - byte, short, int, long, float, double, char, boolean + wrapper classes
         */

        // Example 1 - Primitive int cannot be changed / modified => can only be reassigned
        int num = 0; // original cannot be changed
        num = 10; // original can be reassigned ONLY, but it isn't modifying the original
        System.out.println(num);

        // Example 2 - Non-primitive ArrayList can be changed / modified
        ArrayList<Integer> nums = new ArrayList<>(); // mutable - non-prim
        nums.add(1);

        int a = 12;
        Integer b = a; // this is called Auto Boxing in Java, it means converting primitive data types --> Wrapper classes.

        Byte c = 12;
        byte d = c; // this is called UnBoxing in Java, it means converting Wrapper classes--> primitive data types.

        long m = 214748364788L; //Java treats whole numbers by default as integer.
        // To make this number long we need to explicitly put L to the end of the number.
        System.out.println(Integer.MAX_VALUE); //2147483647

     /*
        QB DataTypes 4
            long num1 = 120;
            short num2 = (short)num1; == by using (short)num1 we explicitly store the long data type into short data type
            This is Explicit Narrowing Casting.

            float num1 = 12.5; == will give an error, we need to explicitly use F at the end.
                               == Java treats any decimal number double by default, and whole number by default integer!
            int num2 = (int)num1;
            System.out.println(num2);


      ******************************************

        QB: DataTypes 6

        * We created a final variable "teacherID" inside the QB_DTMyStudentClass Class
        * Final Variables cannot be reassigned or changed.

        final String teacherID = "ID001";

        *Default Constructor
            public QB_DTMyStudentClass(){
            }

        *Constructor with 3 Parameters
            public QB_DTMyClass01(String name, int age, boolean isRetired){
            this.name = name;
            this.age = age;
            this.isRetired = isRetired;
            }

         * Constructor with 2 parameters
         * We use "this." keyword inside Constructors to create Objects for it.
         * Every Object can assign their own value inside the Constructor by making use of "this." keyword.
         * "this." keyword will take values from each object and reassign it to the variables inside our own class.
            public QB_DTMyStudentClass(String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println("Student Name and age: " + name +" "+ age)
             }

        * This is an example Method we created in QB_DTMyStudentClass Class
        * We don't use "this." keyword for methods, because we are not creating Objects.
        * Methods will use existing variables/methods and their values.
            public void myMethod(){
                System.out.println("I created a method inside my own class");
                System.out.println(name+" "+ age +" "+ isRetired);
            }
       */

        //Creating an Object to use the created Constructor with parameters see above
        // Java creates a default Constructor for every object if we don't create any Constructor.
        // If we create a Constructor --> Java will not create any default Constructor, because Java is greedy.
        //If we create a Constructor with parameters, we also need to create a default Constructor.
        //Every class will have its own methods(), variables, Constructors, etc.
        //We can use all of them through the objects we created.
        //Object below is using the default Constructor we created.
        /*
        Object syntax:
                MyClass obj = new MyClass();
                A) MyClass is class name
                B) obj is object name
                C) MyClass() is constructor --> no parameters == Default Constructor
                D) MyClass(n) is constructor --> with parameters
                E) new is a keyword to create an object from scratch
         */
        QB_DTMyStudentClass student1 = new QB_DTMyStudentClass();

        //Object below uses the Constructor with 3 Parameters
        QB_DTMyStudentClass student2 = new QB_DTMyStudentClass("Ali", 20, true);
        System.out.println(student2.age + student2.name + student2.isRetired);
            //to print the values from objects we can use "student2.age" like in Scanner object.
            //        Scanner input = new Scanner(System.in);
            //        System.out.println(input.nextLine());

        //Object below uses the Constructor with 2 Parameters
        QB_DTMyStudentClass student3 = new QB_DTMyStudentClass("Anna", 21);

        /*
        * In this example we will call the myMethod() from our Class  QB_DTMyStudentClass:
        * Differences between Methods and Constructors:
        1. Constructors must have the same Name as the Class name, but Methods can have any names.
        2. Constructors don't have return types + do not use "return" keyword.
                        * But Methods must have return types (void is also a return type).
                        Methods can use "void" as return type when they just print on the console.
                        When we use "void" as return type we don't use "return" key word in the method body
       */

        //myMethod() call uses variables we created inside the QB_DTMyStudentClass
        //Each Object will pass their own values to the method
        student1.myMethod();
        student2.myMethod();
        student3.myMethod();

        //student3.teacherID = "ID002"; This will cause error, because final variable is being reassigned, which is not possible.

        /*
        * StringBuilder is a builtin class that exists in Java Libraries, which we can use.
        * To use the StringBuilder we must create an Object from it.
        * StringBuilder class is like a template for Objects we create from it.
        * StringBuilder class will have its own methods(), variables, Constructors that we can use for objects.

          StringBuilder myStr = new StringBuilder("My first StringBuilder");
          System.out.println(myStr.reverse());
         */


    }
}
