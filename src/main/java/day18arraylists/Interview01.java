package day18arraylists;

public class Interview01 {
    public static void main(String[] args) {
        //e1. swap the given two integers             INTERVIEW quesiton
        //int a =12; and int b = 5; == a = 5 and b =12

        int a = 12;
        int b = 5;
        System.out.println(a + " - " + b);
        int temp = 0;

        temp = a;
        a = b;
        b = temp;

        System.out.println(a + " - " + b);

        //2.way
        int c = 12;
        int d = 5;

        c = c + d;
        d = c - d;
        c = c- d;
        System.out.println(c + " - " + d);

    }
}
