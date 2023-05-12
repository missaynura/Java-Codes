package day33exceptions;

public class IllegalAgeException extends Exception {

    public IllegalAgeException(String msg){
        super(msg); // child-constructor uses parent-constructor of Java
    }
}
