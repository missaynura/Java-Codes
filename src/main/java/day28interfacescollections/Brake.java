package day28interfacescollections;
public interface Brake extends Details{
    //--------------------- Interfaces and Collections --------------------------

    int price();
    int volume = 7;
    int weight();

    static void secure(){
        System.out.println("brekes work securely");
    }
}
