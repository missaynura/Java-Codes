package day24inheritancedt;

public class AnimalRunner {
    //---------------- Inheritance --------------------

    public static void main(String[] args) {
     Cat myCat = new Cat();
     myCat.eat();
     myCat.drink();
     myCat.meow();

     Dog myDog = new Dog();
     myDog.eat();
     myDog.drink();
     myDog.bark();

     Bird myBird = new Bird();
     myBird.eat();
     myBird.tweet();
    }
}
