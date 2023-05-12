package day31mapsexceptions;

public class Exceptions01 {
 /*
    1. Every system needs strict rules like traffic rules in cities.
      Java is a system, so it needs some strict rules which are called "Exceptions".
    2. When you get exception error your application will be blocked, you execution will be stopped.
      After getting any Exception your next codes cannot be executed.
      If you don't want your application to be blocked, you have to handle exceptions.
    3. To handle exceptions we use try-catch block. In try block Java will try to execute your code.
        If there is no issue in execution Java doesn't use catch block.
        If any issue occurred in try block, Java will go to the catch block and execute codes in the catch block.
  */

    public static void main(String[] args) {
        System.out.println(divide1(6, 2));
        System.out.println(divide1(0, 2));
        System.out.println(divide1(5, 0));

        System.out.println("I am here");
        System.out.println(divide2(5, 0));

    }

    //E1. create a method to divide two integers
    //1.way: not recommended, as you are not a mathematician
    public static int divide1(int a, int b) {
        if (b == 0) {
            System.out.println("do not divide a number by 0");
            return 0;
        } else {
            return a / b;
        }
    }

    //2.Way Recommended
    public static int divide2(int a, int b) {
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Dont divide a number by zero");
        }
        return result;
    }


}

