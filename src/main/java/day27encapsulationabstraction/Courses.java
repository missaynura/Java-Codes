package day27encapsulationabstraction;

/*
    1. Method without body is called abstract method.
    2. sometimes no child uses the body of the method in the parent class so no need to put body for the method.
    if you do not put body fot the method it means you are creating abstract method.
    3. to create an abstract method:
        a. do not type the body of the method.
        b. use abstract keyword between access modifier and return type
        c. make the class abstract
     4. what is the difference between abstract methods and regular (concrete) methods?
        abstract methods focus on what to do, concrete methods focus on what to do and how to do.
     5. abstract methods must be overridden by child classes, otherwise Java complains.
        because of that, if we want some functionalities to be mandatory for the child classes we make them abstract.
     6. an abstract class can have abstract methods. can an abstract class have concrete method?
        Yes, abstract class can have both abstract methods and concrete methods.
     7. concrete methods are not mandatory for the child classes to override.
     8. abstract methods must be overridden by concrete child classes. If the child class is abstract, it is
        optional to override abstract methods.
     9. abstract methods cannot be private, because they must be overridden by the child classes, if you make
         it private child classes cannot access it and override it.
     10. abstract methods cannot be final, because they must be overridden by the child classes. But final
         methods cannot be overridden.
     11. abstract classes have abstract methods, abstract methods dont have body, it means abstract methods
        are uncompleted methods. So abstracted classes have uncompleted parts in them, so abstract classes
        are uncompleted templates. Because of that Java does not let us create objects from abstract classes.
     12. abstract class is a class, that's why it has a constructor. But the constructor cannot create an object.

 */
public abstract class Courses {
    public abstract void math();
    public void art() {
        System.out.println("Learn paninting");
    }
}
