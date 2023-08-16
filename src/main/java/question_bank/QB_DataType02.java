package question_bank;

public class QB_DataType02 {
  //------------------- Data Types -------------------------
  /* QB DataTypes 8

    * you can create non-static variables + methods outside the main method
    * to use these non-static variables + methods => must create objects
    * if "public / default static" => we can use in any class or in same package => (must include import keyword)
                                                                    --> you can get this from 'more actions' menu
                                                                        when you hover over the error
    */

    int a1 = 12; // default

    public static void main(String[] args) {

        QB_DataType02 obj = new QB_DataType02();      // => must create object to use non-static method
        System.out.println(obj.convert(20) + obj.a1); // => now we are using the object to access the non-static method

    }

    /* The convert method is created outside the main method
     * usually when we create methods outside the main method, we add the "static" keyword to the methods to use in main
     * but the convert() method below does not use "static" keyword... HOW DOES THIS WORK?
     * Because to call a non-static variable/method => we must create an object for the class that contains it, we can do this:
     * in the same class (e.g. in the main method) OR
     * we can create the object in a different class
     * e.g. this method convert() is inside the class _02_DataTypesPt2
     * So, we write: QB_DataType02 obj = new QB_DataType02(); to create an object for it
     * When we want to use the convert() method, we use the object we created to access it, i.e.
     * obj.convert()

     * To call a static variable/method => No need to create an object
     * We can use these variables/method
     * When class is loaded in the memory => static variables are initialised
     * => can be used directly inside static method(s)
     * static variables == class variables
     */

    // no "static" keyword used => we cannot use directly inside static method
    // we created an object for this class, so we can access its method
    public double convert(double mile){
        return mile*1.6;
    }

    public void showMe(){
        System.out.println(a1);
    }
}
