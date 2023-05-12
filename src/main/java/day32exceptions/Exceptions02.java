package day32exceptions;

public class Exceptions02 {
    /*
     1)When you use "multiple catch block"s after "try-block" the order of "multiple catch block"s does not matter.
      You can put them in any order but following the code order is the best practice
      Note: But some Exception Classes are the parent of another Exception Classes, when you use parent -child Exception Classes
            Child Exception Class must come first
     2)"try-block" cannot be used alone;
            i)"try-block" + single catch block
            ii)"try-block" + multiple catch block
            iii)"try-block" + finally block
            iv)"try-block" + single catch block + finally block
            v)"try-block" + multiple catch block + finally block
     */

    public static void main(String[] args) {
        System.out.println(divideByNumOfCharsInString1("240"));//120
        System.out.println(divideByNumOfCharsInString1("2a4"));//NumberFormatException
        System.out.println(divideByNumOfCharsInString1("2"));//ArithmeticException
        System.out.println(divideByNumOfCharsInString1(null));//NullPointerException

        System.out.println(divideByNumOfCharsInString2("240"));//120
        System.out.println(divideByNumOfCharsInString2("2a4"));//NumberFormatException
        System.out.println(divideByNumOfCharsInString2("2"));//ArithmeticException
        System.out.println(divideByNumOfCharsInString2(null));//NullPointerException
    }

    //e1. create a method divides an integer converted from a String by 1 less than the number of characters
    // of the String. String s="240"; == 240/2=120
    //1.Way to handle multiple Exceptions
    public static int divideByNumOfCharsInString1(String s){
       try{
           int sInt= Integer.valueOf(s); //convert String to Int "240" == 240
           int numOfChars=s.length();// "240" ==3
           return sInt/(numOfChars-1);//240/(3-1)==120
       }catch (NumberFormatException e){
           System.out.println("Do not use non-digit characters in valueOf()");
           System.out.println(e.getMessage());//technical message of Java
           e.printStackTrace();//for developers: prints the actual exception message
           return 0;
       }catch (ArithmeticException e){
           System.out.println("There is a problem in mathematical operation");
           return 0;
       }catch (NullPointerException e){
           System.out.println("Do not use null with String Class methods");
           return 0;
       }
    }

    //2.Way to handle multiple Exceptions
    public static int divideByNumOfCharsInString2(String s){
        try{
            int sInt= Integer.valueOf(s); //convert String to Int "240" == 240
            int numOfChars=s.length();// "240" ==3
            return sInt/(numOfChars-1);//240/(3-1)==120
        }catch (Exception e){
            System.out.println("Exception was caught");
            return 0;
        }
    }
}
