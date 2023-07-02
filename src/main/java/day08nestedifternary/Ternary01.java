package day08nestedifternary;

public class Ternary01 {
    public static void main(String[] args) {
         //---------------------- Nested If Ternary ------------------------
        //Example 1: type a code to check if a number is positive or not
        // use if-else statement

        int num = 12;
        if (num > 0) {
            System.out.println("positive");
        } else {
            System.out.println("not positive");
        }

        //use ternary statement == easier to write and read and is better than if else
        // : means else
        String result = num > 0 ? "Positive" : "not positive";
        System.out.println(result);

        //Example 2: type code to check if a number is even or odd
        int number = 12;
        String r = number % 2 == 0 ? "even" : "odd";
        System.out.println(r);

        //Example 3: type code to find the minimum of two integers
        int i = 12;
        int k = 21;

        int min = i < k ? i : k;
        System.out.println(min);

        //Example 4: type code to calculate the absolute value of a number
        //    5 == 5,   -5 == -1*-5 (negative should be multipl by -1)  0 == 0
        int m = 5;
        int abs = m > 0 ? m : -1 * m;
        System.out.println(abs);

        //Example 5: you have 2 integers
        // if both are positive do multiplication
        // otherwise return "i do not know how to multiply"
        int a = 5;
        int b = 17;

        Object d = a > 0 && b > 0 ? a * b : "I do not know how to multiply";
        System.out.println(d);

        // Example 6: you have 2 integers
        // if both are positive do addition, otherwise return the maximum one
        int f = 15;
        int g = 12;
        int fg = f > 0 && g > 0 ? f + g : (f > g ? f : g);
        System.out.println(fg);
    }
}
