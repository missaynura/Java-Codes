package day28interfacescollections;
//--------------------- Interfaces and Collections --------------------------

/*
    1. Java doenst support multiple inheritance for classes. But if you put
    all common functionalities into a single parent class the parent class will be huge, which
    we do not want it, because atomic structure is recommended in coding (small structures).
    2. to be able to use multiple inheritance in Java, Java created interface structures. You can make
    multiple interfaces parent of a class, so for interfaces multiple inheritance is supported in java.
    3. Interface is interface, it is not a class.
    4. interfaces have common and mandatory functionalities. Interfaces are to-do lists for concrete child classes.
    5. methods in an interface:
        i) all methods are abstract in an interface (so have no body)
        ii) all methods are public in an interface
        iii) all methods must be overridden by the concrete child classes

      6. Body parts of methods can create issues for child classes in multiple inheritance, but we do not
      have any concrete methods in interfaces that's why there is no confusion for the child classes.
      7. Variables in an interface
            i) all variables are final in an interface (that's why variables have to initialised, or Java will complete)
            ii) all variables are public in an interface
            iii) all variables are static in an interface, because we cannot create objects form interfaces, and
            Java made them static so that they can be accessed from other classes.
      8. interfaces have abstract methods which are uncompleted codes, thats why Java doensn't let create objects from
      an interface.
      Note: interfaces do not have constructors, because it is not a child of an abstract class
      9. you can use methods with the same name in parent interfaces, but return types of the methods must be same
      as well.
      10. Normally we cannot put method with body in an interface. But by using two keywords we can create method with
      body in an interface.
            i) default == It is not mandatory to override
                        == to use default methods create object from the concrete child class
            ii) static ==  It is not mandatory to override
                        == to use static methods no need to create object use interface name e.g. Brake.secure();
      11. child Class == parent Class use extends (same use extends)
          child interface == parent interface use extends  (same use exends)
          child Class == parent interface use implements
          child interface == parent Class == this is impossible, a Class cannot be the parent of an interface
 */

public class Honda implements Engine, Brake, Ac {

    @Override
    public void run() {
        System.out.println("Honda engine runs well...");
    }

    @Override
    public int weight() {
        return 500;
    }

    @Override
    public int price() {
        return 2000;
    }

    @Override
    public boolean isKillingBacteria() {
        return true;
    }
}
