package oldclass.day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner01 {
    // to get data from user in Java, we use scanner class.
    public static void main(String[] args) {

    /*
    steps to get data from user
    1. create a scanner class object
    class name    object name   assignment operator    new    constructor
    2. give a message to user
    3. get the data from user by using input object
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age....");
        byte age = input.nextByte(); // this will fetch data from user
        System.out.println("Your age is " + age);
    }
}
