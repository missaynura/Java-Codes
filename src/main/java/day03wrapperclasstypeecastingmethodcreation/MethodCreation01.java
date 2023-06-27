package day03wrapperclasstypeecastingmethodcreation;

public class MethodCreation01 {
    public static void main(String[] args) {

        //--------------- Method Creation --------------------


        // Using a method inside the main method is called -> Method Call
        System.out.println(add(3, 5)); //8
        System.out.println(multiply(5, 4, 2));//40
        System.out.println(getPerimeterOfRectangle(2, 5)); //14

        // Actual values used in a method call are called -> arguments
        // Variables created in method parenthesis are called -> parameters
        System.out.println(getSurfaceOfRectangularPrism(3.4, 5, 6.4)); // 141.52

        printNameWithExclamationMark("Tom");
    }

    // Method creation
    public static int add(int a, int b) {
        return a + b;
    }

    //Example 1: Create a method that multiplies three given integers
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Example 2: create a method that calculates the perimeter of a rectangle
    public static int getPerimeterOfRectangle(int a, int b) {
        return 2 * a + 2 * b;
    }

    // Example 3: create a method that calculates the surface area of a rectangular prism
    public static double getSurfaceOfRectangularPrism(double a, double b, double c) {
        return 2 * b * c + 2 * a * c + 2 * a * b;
    }

    //Example 4: create a method that prints the given name on the console with ! at the end
    //      Tom == Tom!
    public static void printNameWithExclamationMark(String name) {
        System.out.println(name + "!");
    }
    /*
        Note: if a method just prints something on the console make return type as void
              if a method doesn't return a new data, its return type must be void
     */
}
