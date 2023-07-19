package day26polymorphism;

public class Animal {
    //-------------------- Polymorphism -----------------------

    /*
        1. Polymorphism has two parts;
            i) Method Overloading +
            ii) Method Overriding +
        2. We sometimes need specific implementation of a method for a child class.
           We should take the method from parent class and modify its body to have
           specific implementation. This process is called Method Overriding.
        3. in Method overriding we do not touch method signature, meaning, we dont touch method name and parameters.
        4. to do method overriding
            i) click on right button of the mouse in the child class
            ii) click on generate
            iii) select overriding
            iv) from the list select the method you want to override
            v) modify the method body, do not touch method signature
        5. @Override ist called annotation. It checks method overriding rules in my code for errors and lets me know if its wrong
        6. how access modifiers work in method overriding?
            i) the method in the child class cannot have narrower access modifier than the method in the parent class
            the method in the parent class is default ==> the method in the child class can be default, protected and public
            the method in the parent class is protected ==> the method in the child class can be protected and public
        7. if the method in the parent class is private it cannot be overridden, cause private cannot be visible or accesable
        8. IS-A Relationship and HAS-A Relationship
               i) if there is a parent - child relationship between classes, the data types from parent to child have
                HAS-A relationship (top down), and the data type from child to parent have IS-A relationship (bottom to top)
              ii) if there is HAS-A relationship or IS-A relationship between two data types, the data types are called Covariant data types.
              So there has to be a child-parent relationships and HAS-A and IS-A relationships.
        9. in method overriding you should have covariant data types in return types, if you do not have covariant data types
        return types must be the same.
            i) primitive data types are not classes, so they cannot have parent-child relationships. if there is not
            parent-child relationships you cannot have HAS-A and IS-A relationships, you cannot change the return types
            in method overriding. As a result if return type of method is primitive do not touch it.
            ii) Wrapper classes are classes, but there is not parent-child relationship between them, that's why you
            cannot have HAS-A or Is-A relationships amongh Wrapper classes.
            if you dont have HAS-A and IS-A relationships you cannot have HAS-A and IS-A relationships, you cannot change the return types
            in method overriding. As a result if return type of method is wrapper class do not touch it.
            iii) if there is HAS-A or IS-a relationship between the return types in method overriding, you can
            change the return types.
            But be careful about the data the method is returning and the return type, larger data types e.g. Animal dont fit
            into the smaller ones e.g. Cat.
         10. OOP had 4 principals:
                a) Inheritance
                b) Polymorphism = Method Overloading + Method Overriding
                c) Encapsulation
                d) Abstraction
     */

    public void eat(){
        System.out.println("animals eat...");
    }

    public void drink(){
        System.out.println("animals drink...");
    }

    public int move(){
        return 100;
    }

    public Integer weight(){
        return 200;
    }

    public Animal born(){
        return new Animal();
    }

}
