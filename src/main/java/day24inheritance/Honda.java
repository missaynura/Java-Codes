package day24inheritance;

public class Honda extends Car{
    public int age = 6;
    public void move(){
        System.out.println("Hondas move..");
    }
    public Honda (){
        super();
        System.out.println("Honda Constructor 1");
    }
    public Honda (int a){
        System.out.println("Honda Constructor 2: " + a);
    }
}
