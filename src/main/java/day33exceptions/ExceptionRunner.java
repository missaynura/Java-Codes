package day33exceptions;

public class ExceptionRunner {

    /*
            1. To declare your own strict rules on your application, you can create Your own Exception Classes (Custom Exception Classes)
                For example, if using negative values for age is so dangerous, you can create "IllegalAgeException Class" and you can throw IllegalAgeException
                when the age is negative.
            2. When you name a Custom Exception Class use Exception wor at the end of the name.
            3. If you want to create Custom Checked Exception, extend to Exception Class with extends keyword.
            4. Every Exception Class must have Constructor and the constructor should use the parent constructor as well.
            5. If you want to create Unchecked Exception extend to RuntimeException class with extend keyword. Use this if you want your app to stop if rule is not met.
     */

    public static void main(String[] args) throws IllegalAgeException {

    printAge1(5);
    printAge2(32);
    printMathGrades(122);

    }

    //Example1: Create a method to print user's age

    //1.Way using try-catch
    public static void printAge1(int age){
        if(age<0){
            try {
                throw new IllegalAgeException("Age cannot be negative");
            } catch (IllegalAgeException e) {
                System.out.println(e.getMessage());
            }
        }else {
            System.out.println("your age is " + age);
        }
    }

    //2.Way: using throw --- stops the execution
    public static void printAge2(int age) throws IllegalAgeException {
        if(age<0) {

            throw new IllegalAgeException("Age cannot be negative");
        }
        System.out.println("Your age is " + age);

    }


    //Example 2: Create a method to print students math grades
    public static void printMathGrades(int mathGrade){
        if(mathGrade<0 || mathGrade >100){
            throw new IllegalGradeException("Grade cannot be less than 0 or greater than 100");
        }
        System.out.println("Your grade is " + mathGrade);
    }
}
