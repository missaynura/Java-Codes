package homework;

public class Practice02VarargsMethodOverloading {
    //Write a method that returns the sum of two numbers
    //Since it's a mathematical calculation it can return a whole number or floating point number

    public static void main(String[] args) {
        System.out.println(sumOfNumbers(12, 11, 22, 33));
        System.out.println(sumOfNumbers(11, 22, 44, 55.0, 33.5));
        System.out.println(sumOfNumbers(22, 33.5));
        System.out.println(sumOfNumbers(2, 5.5));
        System.out.println(sumOfNumbers("Kim", 11));
    }

    //1.Method with varargs that accepts int type, so it only works with whole numbers
    public static int sumOfNumbers(int ... num1){
        int num = 0;
        for(int w : num1){
            num+=w;// num = num+w;
        }
        return num;
    }


    //2. Method with varargs for floating point numbers (decimal numbers)
    public static double sumOfNumbers(double ... num2){
        double num = 0;
        for(double w : num2){
            num+=w;// num = num+w;
        }
        return num;
    }

    //3. Method for int and floating point numbers (decimal numbers)
    // name and age
    public static String sumOfNumbers(String name, int age){
        if(age>=18){
           return name + " you are allowed in because you are " + age;
        }else {
           return name + " you are not allowed in because you are " + age;
        }
    }

}
