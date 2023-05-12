package day24inheritance;

public class Car extends Vehicle {
    public int age = 8;
    public void move(){
        System.out.println("Cars move..");
    }
    public void engine(){
        System.out.println("All cars have engine");
    }
    public Car(){
        super(7);
        System.out.println("Car constructor 1");
    }
    public Car(int a ){
        super();
        System.out.println("Car constructor 2: " + a);
    }
}
