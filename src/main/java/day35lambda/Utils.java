package day35lambda;

public class Utils {

    public static int getSumOfDigits(int a){
        int sum = 0;
        while (a>0){
            sum = sum+a%10; //gives you the last digit
            a=a/10; //decrement
        }
        return sum;
    }

    public static int getSquare(int a){
        return a*a;
    }

    public static void printInSameLineWithSpace(Object s){
        System.out.println(s+" ");
    }

    public static boolean checkToBeEven(int a){
        return a%2==0;
    }

    public static boolean checkToBeOdd(int a){
        return a%2!=0;
    }
}
