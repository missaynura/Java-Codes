package ssg;

public class Loops03 {
    public static void main(String[] args) {

       //print odd and even numbers up to inclusive 100 with two separate loops. 1-

       for(int num =1; num<101; num++){
        if (num %2 ==0)    {
            System.out.println(num + "is even number");
        }
       }

        for(int num =1; num<101; num++){
            if (num %2 !=0)    {
                System.out.println(num + "is odd number");
            }
        }


    }
}
