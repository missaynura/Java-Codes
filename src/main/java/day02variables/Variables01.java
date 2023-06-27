package day02variables;

public class Variables01 {

    //--------------- Primitive and Non-primitive Data Types --------------------

    /*
        Primitive data types: byte - short - int - long - float - double - char - boolean

                     byte - short - int - long  -> is used for whole numbers
                     float and double           -> is used for decimal values
                     char                       -> is used for single characters
                     boolean is for true and false

        char data type:     is for a single character. e.g. A, ?, 5,
                            Use single quotes for char values!
                            char uses 16 bits(2 bytes) in memory.
                            --> public char initial = 'A';

        byte data type:     is for whole numbers. e.g. 23, 8, -9, etc.
                            can have values from -128 to 127
                            uses 8 bits (1 byte) in memory.
                            --> public byte age = 45;

        short data type:    is for whole numbers. e.g. 250, 2345, etc.
                            can have values from -32768 to 32767
                            uses 16 bits (2 bytes) in memory
                            --> public short numOfPeopleInAptartment = 2500;

        int data type: int is for whole numbers. e.g. 1223222, etc.
                            can have values from -2,147,483,648 to 2,147,483,647
                            uses 32 bits (4 bytes) in memory
                            --> public int populationOfCountry = 4500000;

        long data type: is for whole numbers.
                        can have values from 19 digits -9, ..... to 9 .....
                        64 bits (8 bytes) in memory
            Note:   if the value of a long variable is out of range of the int,
                    put "L" to the end of the value
                        --> public long populationOfTheWorld = 7200000000L;
                        --> public long profit = 23000000;

        float data type: is for decimal values, e.g. 2.34, -4.2, etc.
                          is less sensitive
                          uses 32 bits (4 bytes) in memory
            Note:   by default Java makes decimal values as double, use "F" to make it float
                        --> public float priceOfShirt = 12.99F;

        double data type: is for decimal values, e.g. 3.43433, etc.
                          very sensitive
                          uses 64 bits (8 bytes) in memory
                          --> public double weightOfACell = 0.000000001222;

     */
}
