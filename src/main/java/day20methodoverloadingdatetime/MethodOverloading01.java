package day20methodoverloadingdatetime;

public class MethodOverloading01 {
    /*
    1. if you create methods 1. with the same name and 2. different parameters, 3. methods are in the same class, it is called Method Overloading
    2. to make the parameters different 1. change the data type of the parameters
                                        2. change the number of parameters
                                        3. change the order of parameters if the data types of parameters are different
    3. by using method overloading you will be able to see all usages of a method
        e.g. when you use indexOf() method for String, java will display 4 options to use.
        if the names are different it would not be possible to see all usages when you type indexOf() after String
    4. private method can be overloaded as well, because method overloading is done in a single class, if you are not going outside, the
    class being private does not create an issue.
    5. whenever you do method overloading if you need you can change the return type of the method. It is not problem for method overloading.
    6. whenever you do method overloading if you need you can change the body of the method. It is not problem for method overloading.
    Note: 1. do not touch method name
            2. changing parameters is mandatrody
            3. changing access modifies, return type, and method body is optional

     note: in method overloading we are changing the method signature. Method signature has two parts, method name and parameters.
     we change just parameters part in overloading
     Note: other name of the method overloading is Polymorphism or Static Polymorphism
     */

    public static void main(String[] args) {
    multiply(3,5);
    muliply(3.2, 5);

    }
    //create a method that multiplies two integers
    public static int multiply(int a, int b){
        return a*b;
    }

    //create a method that multiplies an integer by a double
    public static double multiply(int a, double b){
        return a*b;
    }

    //create a method that multiplies a double by an integer
    public static double muliply(double a, int b){
        return a*b;
    }

    //create a method that multiplies three integers
    public static int multiply(int a, int b, int c){
        return a*b*c;
    }
}
