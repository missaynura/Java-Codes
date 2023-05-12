package day09nestedternaryswitch;

public class NestedTernary01 {
    public static void main(String[] args) {

          /*
                Type java code by using nested if.
                Write a program to check if a year is "leap year" or not.
                i) If the year is divisible by 100 then it must be divisible by 400. ==> 1600+, 2000+, 1800-
                ii) If a year is not divisible by 100 then it must be divisible by 4. ==> 2004+, 1996+, 2021-
         */
        int year = 1600;
        String isLeap = year%100==0 ? (year%400==0 ? "leap" : "not leap") : (year%4==0 ? "leap" : "not leap");
        System.out.println(isLeap);

        /*
        type code to check password
        if it has more than 8 characters, initial should be i
        if not more than 8 initial should be k
        solve the tas by using nested-ternary
         */
        String pwd = "iwAkr45";
        String pwdInitial = pwd.length()>8 ? (pwd.charAt(0)=='i' ? "valid" : "Invalid") : (pwd.charAt(0)=='K' ? "valid": "invalid");
        System.out.println(pwdInitial);

    }
}
