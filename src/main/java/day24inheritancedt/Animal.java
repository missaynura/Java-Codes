package day24inheritancedt;

public class Animal {
    /*
    Inheritance helps us to avoid:
    1. repetition
    2. difficulty in updating codes
    3. difficulty in fixing codes
    4. preventing atomic structure and make it faster


    1. Child classes can use methods or variables from Parent Class,
    but parent class cannot use methods or variables from child classes
    2. for public and protected access modifiers, there is no limitation to reach out the data
    3. for default access modifier, if the object and the parent class are in the same
    package the inheritance is possible
    But if the object and the parent class are in different packages, inheritance is not possible, Java will complain
    4. for private access modifier inheritance is impossible
    5. HAS-A means the relationship from parent to child, IS-A means the relationship from child to parent
    6. in Java you cannot have multiple parent classes. Because Java will get confused from parent it will use
    the required common methods




     */

    protected void eat(){
        System.out.println("Animals eat...");
    }

    public void drink(){
        System.out.println("Animals drink...");
    }



}
