package oldclass.day02typecasting_scanner;

public class WrapperClass01 {
    public static void main(String[] args) {

/*
Wrapper Class = non-primitive data types.
non-primitive data types have methods together with values.
we can do many actions by using methods which is very useful.
But primitive data types do not have any methods, because of that we
cannot do any actions/use methods with primitive d.types.
Java created Wrapper Classes to handle this issue. Java created a new structure
which has primitive value and methods together. This is called Wrapper Classes.

Wrapper classes are non-primitive data types.
Primitive data types        Wrapper Class
byte                        Byte
short                       Short
int                         Integer
long                        Long
float                       Float
double                      Double
char                        Character
boolean                     Boolean
 */

int age = 11; // there is no method

Integer number = 59; // Wrapper Class, there are many useful methods
float numberf = number.floatValue();
        System.out.println(numberf);

        Integer number1 = 59; // there are many useful methods
        System.out.println(number1);

    char a = 'A';
    Character b = 'B';

    // Autoboxing = converting/assigning primitive d. type into non-primitive wrapper class.
    byte c = 22;
    Byte cb = c;

    //Unboxing: to conver a wrapper class objet into its primitive d. type.
        Short ws=34;
        short s=ws;


        // how to get the min and max values of numeric data types in Java

        System.out.println(Integer.MAX_VALUE); // 2147483647 (10 digits)
        System.out.println(Integer.MIN_VALUE); // -2147483648
        System.out.println(Short.MAX_VALUE);//32767 min -32767
        System.out.println(Long.MAX_VALUE);// +-9223372036854775807 (19 digits)




    }

}
