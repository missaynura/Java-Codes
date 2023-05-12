package day27encapsulationabstraction;

    /*
        1)What is Encapsulation?
          Data hiding
        2)How to hide a data?
          By using "private access modifier"
        3)Why do we need Encapsulation?
            i)To protect data from outside affects
            ii)To have simplicity
        4)Can you read the encapsulated data if you need?
          Yes, I can read the data by using "get method"s
        5)Can you update the encapsulated data if you need?
          Yes, I can update the data by using "set method"s
         6) by using set methods, we are able to work with lesser objects.
         After creating an object, we update it and use it as a different object.
         Instead of creating eg. 4 objects for Math, science, art, English teachers we create just a single teacher
         object and set it to Math teacher object or others, whenever we need. This is good for simplicity and saving
         memory.
         7) set methods update the values on the object not on the class

         Interview Questions
         1. what is the difference between method Overloading and method Overriding?
            a. method overriding needs inheritance, but method overloading doesn't need inheritance. Inheritance
            is a prerequisite for method overriding.
            b. method overriding doesn't change method signature, but method overloading changes. Method overriding
            changes the body of the method, method overloading changes the parameter.
            c. private methods can be overloaded, but cannot be overridden. because method overloading happens in a
            single class, to be private if you are in a single class doesn't affect anything. Method overriding
            happens in different classes, so to be private matters.
            d. static methods cannot be overridden but can be overloaded. Because static methods are common for all
            objects, if you change the implementation by using a single object, other objects will be affected as well.
            This can create an issue in our application. that's why Java doesn't let us to override static methods.

                    Can you override main method? no, because it is static.
                    Note1: other name of method overloading is static polymorphism, because static methods can be overloaded.
                            Other name of method overriding is dynamic polymorphism.

                    Note2: could you explain "final" keyword?
                            final keyword can be used for i)variables, ii) meothds iii) classes
                    i) if you use final keyword for a variable
                        a) you have to initialize(assign value) the variable
                        b) you cannot change the initial value
                    ii) if you use final keyword for a method, its body cannot be updated
                    because of that final methods cannot be overriden.
                    iii) if you use final keyword for a class, the class cannot have a child class. (if you dont want the class to
                    have a child class make it final). Final class can be a child class, but it cannot have a child class.
            e. final methods cannot be overriden but can be overloaded. because in overriding we change the
            method body, but final methods do not let us to change the method body.


     */

public class Student {

    private String stdId = "TH2023FL";
    private boolean success = true;

    //Create a get method to read the value of stdId
    //1.Way: Typed it manually
//    public String getStdId(){
//        return stdId;
//    }

    //2.Way: By using IntelliJ
    public String getStdId() {
        return stdId;
    }

    //Create a set method to update the value of stdId
    //1.Way: Type it manually
//    public void setStdId(String stdId){
//        this.stdId = stdId;
//    }

    //2.Way: By using IntelliJ
    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    //if the datatype of an encapsulated data is boolean, getter method name starts with "is" not with "get"
    // per naming convention.
    public boolean isSuccess() {
        return success;
    }
}
