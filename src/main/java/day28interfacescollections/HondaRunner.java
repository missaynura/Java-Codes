package day28interfacescollections;
//--------------------- Interfaces and Collections --------------------------

/*
    What is the difference between abstract class and interface?
    1. interface can have just abstract methods but abstract class can have both abstract and concrete methods.
        in Java 8, Java lets us create methods with body by using default and static keywords.
       in Java 9, Java lets us create methods with body by using private keyword as well
    2. interfaces have public, static and final variables, but abstract classes can have every type of variables, there are no restrictions.
    3. a class can have just a single abstract class parent, but a class can have many interface parent.
    4. both abstract class and interface cannot give you an object, but abstract class has constructor, interface doesnt have a constructor.
    5. to make an abstract class parent of a concrete class we use extends keyword.
        to make an interface parent of a concrete class we use implements keyword.
 */

public class HondaRunner {
    public static void main(String[] args) {
        //Runner
        System.out.println(Engine.volume);
        System.out.println(Brake.volume);

        Honda myHonda = new Honda();
        myHonda.eco();

        Brake.secure();
    }
}
