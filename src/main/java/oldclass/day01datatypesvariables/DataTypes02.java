package oldclass.day01datatypesvariables;

public class DataTypes02 {
    public static void main(String[] args) {

    //------------------------ Data Types ---------------------------------    
    /*
        What is Data?
        Data is used, stored and processed in Java.
        what are the data types in Java?
        There are 2 main data types in Java
        1. primitive data types
        2. non-primitive data types
    
        What are the primitive data types?
        1. primitive data types were created by Java, developers cant create them.
        2. there are 8 primitive data types. 1. byte, 2. short, 3. int
        4. long, 5. float, 6. double, 7. char, 8.boolean.
    
        1. byte: is for whole numbers. it is from -128 to 127, we have 256 different values.

        Lets create a byte variable and assign a value to it.
        byte stdAge code 1. creates reserved area in memory
        2. name it by using the name you gave
        3. puts zero (default value) in the reserved area.
        = is not an equal sign, it is an assignment operator,
        it takes the value from the right and put it into the reserved
        area on the left.
        ; is used to end any Java statement.

        Naming convention of Variables: 1. Starts wish lower cases. 2. All words
        except the first should start with upper cases. Its called a camel case.

        2. short: is for whole numbers. it is from -32k sth to +32K sth
    
        3. int: stands for integer and it is for whole numbers.
        it is from -2 billion sth to +2 billion sth
    
        4. long: is for whole numbers. Java will insist on using int to save memory.
           to make the data type long put L or l at the end of the value, use L not to confuse small l with 1.
    
        5. double: is for decimal values. it can have up to 16 digits in decimal part, it is
        so sensitive.

        6. float: is for decimal values. less sensitive, has 7 digits in decimal part.
        all decimal values are in double per default in Java. If you use float
        you have to put F at the end to avoid problem with Java.
    
        7. char: is for single characters. A,!, 3, etc. the value of char data type
        must be between singe quotes.
    
        8. boolean: it is for true or false answers.
    */

byte stdAge = 13;
System.out.println(stdAge);
short populationInAnApartment = 546;
int populationInACity = 2500000;
long populationOfTheWorld = 7200000000L;

double weightOfACell = 0.0000023;

float shirtPrice = 12.99F;

char initial = 'S';

boolean isRetired = true;
boolean isOld = false;

    }
}
