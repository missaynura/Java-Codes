package day24inheritancedt;

public class Honda extends Vehicle {
    //---------------- Inheritance --------------------

    public void brake(){
        System.out.println("Honda uses perfect engine...");
    }

    public void engine(){
        System.out.println("Honda stops securely...");
    }

    public Honda() {
        System.out.println("Honda Constructor...");
    }
}

