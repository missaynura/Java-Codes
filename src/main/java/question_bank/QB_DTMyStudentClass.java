package question_bank;

public class QB_DTMyStudentClass {
//------------------- Practice --------------------------------
    String name;
    int age;
    boolean isRetired;
    final String teacherID = "ID001";

    //Default Constructor
    public QB_DTMyStudentClass(){
    }

    //Constructor with 3 Parameters
    public QB_DTMyStudentClass(String name, int age, boolean isRetired){
        this.name = name;
        this.age = age;
        this.isRetired = isRetired;
    }

    //Constructor with 2 parameters
    public QB_DTMyStudentClass(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Student Name and age: " + name +" "+ age);
    }
    /*
        This is a method. Differences between Methods and Constructors:
        1. Constructors must have the same Name as the Class name, but Methods can have any names.
        2. Constructors don't have return types + do not use "return" keyword. But Methods must have return types (void is also a return type).
                                                                           Methods can use "void" as return type when they just print on the console.
                                                                           When we use "void" as return type we don't use "return" key word in the method body
     */
    public void myMethod(){
        System.out.println("I created a method inside my own class");
        System.out.println(name+" "+ age +" "+ isRetired);
    }
}
