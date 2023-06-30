package day03wrapperclasstypeecastingmethodcreation;

public class TypeCasting01 {
    public static void main(String[] args) {
    //--------------- Type Casting --------------------
        // byte - short - int - long - float - double == do Autowidening
        byte b = 25; // max value 127
        short s = b;
        System.out.println(s);

        long l = 456;
        double d = l;
        System.out.println(d);

        // byte - short - int - long - float - double == do ExplicitNarrowing
        long n = 5674;
        short h = (short) n;
        System.out.println(h);

        float f = 12.78F;
        int i = (int) f;
        System.out.println(i); //12
    }
}
