package day19arraylistsvarargs;

public class Varargs01 {
    public static void main(String[] args) {
        System.out.println(add(3, 5));
        System.out.println(add(3, 5, 5, 55, 3));
    }

    //create a method that adds two integers
    // 1. putting a parameter after a varargs is a mistake!
    // because varargs is infinate.
    //2. putting a parameter before a varargs is ok!
    //3. putting multiple varargs as parameter is a mistake
    // note: varargs must be used only once at the end
    //container used in method paranthesis are called parameters
    // actual data used in method paranthesis are called argument
       public static int add(int... v){
        int sum =0;
        for(int w: v){
            sum = sum +w;
        }
        return sum;

    }
}
