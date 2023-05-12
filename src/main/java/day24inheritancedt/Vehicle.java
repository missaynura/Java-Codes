package day24inheritancedt;

public class Vehicle  {
    /*
    1. every class except for Object Class has parent class
    2. Object Class is the parent class of all classes in Java
    3. just object class does not have any parent class in Java.
    4. default constructors are in Object class
     */

    public void move(){
        System.out.println("All vehicles move...");
    }

    public void pricing(){
        System.out.println("to buy a vehicle you should pay the price...");
    }

    public Vehicle() {
        System.out.println("vehicle Constructor...");
    }
}
