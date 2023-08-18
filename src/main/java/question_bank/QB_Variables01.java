package question_bank;

public class QB_Variables01 {
    public static void main(String[] args) {
    //---------------------- Variables ------------------------
        /*
             * when using char
             * it has surrogate or pairs - this means:
             * if we provide numbers 65 -> surrogate pair would be 'A' from the ASCII table
             *
             * If range more than the ASCII table value, so above 127, it used unicode as surrogate pair
             * You can also write your own unicode by using '\ u' or put into String as well "\ u"
             * The \ u must be followed by the code that represents the symbol you need
             *              https://symbl.cc/en/unicode/blocks/  -> practice unicode
             *              it provides as U+ but need to replace that as \ u and then the number code after it
         */

        char asciiNum = 65;                                  // A -> surrogate pair
        Character asciiLet = 'A';                            // A -> A
        char unicodeChar = '\u026F';                         // unicode to get surrogate pair
        String unicodeInString = "Hello é There";            // we can use unicode inside strings


        // Q16
        long a1 = 1234;         // this number is still stored as int even if we use long data type
        // this is because 1234 is short enough to fit inside int data type
        // for this reason, Java does not complain even if we don't add L at end

        Integer maxRange = Integer.MAX_VALUE;
        System.out.println(maxRange);         // max positive range 2147483647
        long a2 = 8234567890L;                //                    8234567890 - bot 10 digit numbers
        // but 8234567890 is greater than MAX_VALUE of Integer
        // for this reason we must be explicit by using L at end

        /* 
            Q17 Variables

            * when we use whole numbers like 200 or 30, it will be converted to double
            * since the parameter requires double types
            * The reason why it does not complain when we provide whole numbers is because:
            * double type is larger than int type -> int is able to convert automatically to double
            * IF parameter type is smaller than the provided type -> requires casting, in other words
            * Will not work automatically and can cause an error
            * In Java, type casting is the process of converting one data type into another data type:
            * => auto widening (smaller -> larger) OR explicit narrowing (larger -> smaller)

        public class Test {
            public static void main(String[] args) {
                calculatePercentage(200, 30);
            }

            public static double calculatePercentage(double n, double p){
                    return (n*p)/100;
            }
          }
       */

       /* 
           Q19
            *
            * int numOfStudents = 342;
            * => will give an error + You need to make numOfStudents variable static
            *
            * The correct format would be => static int numOfStudents = 342;


        public class Test {
            public static void main(String[] args) {
                int age = 12;
                System.out.println(age);
                System.out.println(numOfStudents);
                }

                int numOfStudents = 342;
            }
        */

        System.out.println(numOfStudents); // corrected answer for Q19
    }

    static int numOfStudents = 342; // for Q19 static field
}
