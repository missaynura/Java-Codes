package day32exceptions;

public class Exceptions04 {
    //-------------------------- Exceptions ------------------------------
    /*
        1.finally block is used for the codes that will be executed for every scenario
        like cutting connection with the cloud database
        2. Could you please explain final, finally, and finalize?
            final: we learned this before
            finally: we learned it here
            finalize: it is a method, it is used by Java before destroying data in memory by Garbage Collector.
     */
    
    public static void main(String[] args) {
        System.out.println(divide(6, 2));
        System.out.println(divide(6, 0));
    }

    //Example1: Create a method that divides two integers
    public static int divide(int a, int b){
        try{
            return a/b;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            return 0;
        }finally {
            System.out.println("The operation is completed");
        }
    }
}
