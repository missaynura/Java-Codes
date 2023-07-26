package day32exceptions;

public class Exceptions01 {
    public static void main(String[] args) {
        //-------------------------- Exceptions ------------------------------
        System.out.println(getCharFromStringByIndex("Java", 2));//v
        System.out.println(getCharFromStringByIndex("Java", 4));//exceptions

        System.out.println(getNumOfCharsInString("Automation")); //10
        System.out.println(getNumOfCharsInString(" ")); //1
        System.out.println(getNumOfCharsInString("")); //0
        System.out.println(getNumOfCharsInString(null)); //Exceptions

        System.out.println(convertStringToInt1("123") +1);//124
        System.out.println(convertStringToInt1("1ab") +1);//NumberFormatException

        System.out.println(convertStringToInt2("1ab"));//NumberFormatException
    }

    //Example 1: create a method to get a character from a String by using index
    public static char getCharFromStringByIndex(String s, int idx){
        try{                //try to get the index
            return s.charAt(idx);
        }catch (StringIndexOutOfBoundsException e){ //if the exception error then return space
            System.out.println(idx + " does not exist as index...");
            return ' ';
        }
    }

    //Example 2: create a method to get the number of characters in a String
    public static int getNumOfCharsInString(String s){
        try{
            return s.length();
        }catch (NullPointerException e){ //NullPointerException is thrown if null was used with some methods in String Class
            System.out.println("This method cannot be used with null");
            return 0;
        }
    }

    //Example 3? create a method to convert a String to an Integer
   //1.Way
    public static int convertStringToInt1(String s){
        try{
            return Integer.valueOf(s);
        }catch (NumberFormatException e){//NumberFormatException is thrown if String in valueOf() has non-digit characters
            System.out.println("Do not use non-digit characters in valueOf() ");
            return 0;
        }
    }

    //2.Way
    public static int convertStringToInt2(String s){
        try{
            return Integer.parseInt(s);
        }catch (NumberFormatException e){//NumberFormatException is thrown if String in valueOf() has non-digit characters
            System.out.println("Do not use non-digit characters in valueOf() ");
            return 0;
        }
    }

}
