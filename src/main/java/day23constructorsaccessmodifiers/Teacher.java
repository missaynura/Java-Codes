package day23constructorsaccessmodifiers;

public class Teacher {
    //------------------ Teacher -------------------
    public static int counter = 0;
    public int age = 45;

    public Teacher(int age) {
        this.age = age;
        age++;
        counter++;
    }
}
