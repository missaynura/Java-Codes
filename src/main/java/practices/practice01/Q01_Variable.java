package practices.practice01;

public class Q01_Variable {
    //--------------- Practice 01 --------------------
    /*
        Write a Java program to break an integer into a sequence of individual digits.
        Hint: use / and %
        x: input: 12345
        output:     1
                    2
                    3
                    4
                    5
    */
    public static void main(String[] args) {
        int x = 12345;
        int ones = x % 10; //5
        int tens = (x / 10) % 10; //4
        int hunderds = (x / 100) % 10; //3
        int thousands = (x / 1000) % 10; //2
        int tenThousands = (x / 10000); //1
        System.out.println(tenThousands + "\n" + thousands + "\n" + hunderds + "\n" + tens + "\n" + ones);
    }
}
