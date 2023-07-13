package day23constructorsaccessmodifiers;

public class Student {
//--------------------- AccessModifiers --------------------

    
    //if a class member is private it means it cannot be visible /
    //accessible from other classes
    //so by making a class member private, it means we are hiding
    //the class member inside the class
    private String stdID="TH20211704";

    //to make a class member default, dont type any access modifier
    //if you are in the same package with the default class member
    //you can access to it.
    // if you are in a diffrerent package with the default class members,
    //you cannot access to it.
    int age=13;

    //if a class member is public, you can access to it from entire
    //of the project
    public boolean isSuccess = true;

    //if a class member is protected, you can access to it from
    //the same package and child classes from other packages
    protected int grade = 11;

    //note: a class can be just public or default
    //dont use private or protected access modifiers for classes.

    }

