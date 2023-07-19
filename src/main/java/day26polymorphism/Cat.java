package day26polymorphism;

public class Cat extends Mammal{
   //-------------------- Polymorphism -----------------------

    @Override
    public void eat() {
        System.out.println("Cats eat...");
    }

    @Override
    public int move() {
        return 150;
    }

    @Override
    public Integer weight() {
        return super.weight();
    }

    @Override
    public Cat born() {
        return new Cat();
    }
}
