package day23constructorsaccessmodifiers;

public class Car {
    
//--------------------- Constructors --------------------
    public String make;
    public String model;
    public int year;
    public int price;

    //Default Constructor
    public Car() {
    }

    //Constructor with parameters
    public Car(String make, String model, int year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public Car(String make, String model, int price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }
}
