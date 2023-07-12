package day22stringbuilderstringbuffer;

public class Constructors {
//--------------------- Constructors ---------------------------
    /*
        1. Constructors are for creating object from a class
        2. Java puts constructor behind every class per default, it is invisible and called as default constructor
        Default constructors are like this public Constructors(){}
        if you type any constructor manually, Java removes default constructor
        3. if you want you can create your own constructors
        4. Methods have return type but Constructors do not have return type
        5. Methods can use any name, Constructors must use Class name as name
     */

    public String stdName ="Tom";
    public int stdAge = 23;
    public boolean isSuccessful = true;

    //To create a constructor: 1. user access modifies, 2. use calss name as Constructor name, 3. put constructor body
    public Constructors(){
    }

  //Create constuctor with parameters
    public Constructors(String stdName, int stdAge, boolean isSuccessful){
        this.stdName = stdName;
    }

}
