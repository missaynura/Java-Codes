package day21datetimestringbuilder;

public class StringBuilder01 {

    /*
    1. StringBulder is a class that creates strings for you
    2. Normally we create strings by using string class, but Java gave us another class to create string, because
    string class gives you immutable strings, sometimes we need mutable strings, which StringBuilder gives.

     */
    public static void main(String[] args) {

        StringBuilder sbc = new StringBuilder("Java");
        sbc.append("!"); // updating the string with append

        // to be able to use updated string, you have to do assignment in String classes
        String str = "Apex";
        System.out.println(str);//Apex
        str = str.concat("!"); // assignment here
        System.out.println(str);//Apex!

        // to be able to use updated string, no need to do assignment in StringBuilder Classes
        StringBuilder sb = new StringBuilder("Apex");
        System.out.println(sb);//Apex
        sb.append("!"); // no assignmet here
        System.out.println(sb);//Apex!

        //append() method is for joining StringBuilders like concat() method in String Class
        StringBuilder sb1= new StringBuilder("Mark");

        sb1.append(" Twain").append("!...");
        System.out.println(sb1);//Mark Twain!...

        //length() and capacity() methods
        StringBuilder sb2= new StringBuilder("Brad");
        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity());//16+4=20

        StringBuilder sb3= new StringBuilder();
        System.out.println(sb3.length());//0
        System.out.println(sb3.capacity());//16

        StringBuilder sb4= new StringBuilder();
        sb4.append("Java").append("Python").append("Programming Language");
        System.out.println(sb4.length());//30
        System.out.println(sb4.capacity());//16x2+2=34

        StringBuilder sb5= new StringBuilder("Python");
        sb5.deleteCharAt(3);
        System.out.println(sb5); //Pyton

        sb5.delete(1,3);
        System.out.println(sb5);//Pon

    }
}
