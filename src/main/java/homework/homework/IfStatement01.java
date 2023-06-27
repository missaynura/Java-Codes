package homework.homework;

public class IfStatement01 {
    public static void main(String[] args) {

        /*
                Type code to print
        a) "Winter" for December, January, February
        b) "Spring" for March, April, May
        c) "Summer" for June, July, August
        d) "Fall" for September, October, November
        e) "Invalid month name" for all the others
         */
        String monthName = "December";

        boolean winter = monthName.equalsIgnoreCase("december") ||
                        monthName.equalsIgnoreCase("january") ||
                        monthName.equalsIgnoreCase("february");
        boolean spring = monthName.equalsIgnoreCase("march") ||
                        monthName.equalsIgnoreCase("april") ||
                        monthName.equalsIgnoreCase("may");
        boolean summer = monthName.equalsIgnoreCase("june") ||
                monthName.equalsIgnoreCase("july") ||
                monthName.equalsIgnoreCase("August");
        boolean fall = monthName.equalsIgnoreCase("September") ||
                monthName.equalsIgnoreCase("October") ||
                monthName.equalsIgnoreCase("November");

        if(winter){
            System.out.println("Winter");
        }else if(spring){
            System.out.println("Spring");
        }else if(summer){
            System.out.println("Summer");
        }else if(fall){
            System.out.println("Fall");
        }else{
            System.out.println("invalid month name");
        }
        System.out.println("________________");

        String monthName1 = "December";
        monthName1 = monthName1.toLowerCase();

        if(monthName1.equals("december") || monthName1.equals("january") || monthName1.equals("february")){
            System.out.println("winter");
        }else if (monthName1.equals("march") || monthName1.equals("april") || monthName1.equals("may")){
            System.out.println("spring");
        }else if (monthName1.equals("june") || monthName1.equals("july") || monthName1.equals("august")){
            System.out.println("summer");
        }else if(monthName1.equals("september") || monthName1.equals("october") || monthName1.equals("november")){
            System.out.println("fall");
        }else{
            System.out.println("invalid month");
        }



        String mName = "December";
        mName = mName.toLowerCase();
        if(mName.equals("december") || mName.equals("january") || mName.equals("february")){
            System.out.println("Winter");
        }else if(mName.equals("march") || mName.equals("april") || mName.equals("may")){
            System.out.println("Spring");
        }else if(mName.equals("june") || mName.equals("july") || mName.equals("august")){
            System.out.println("Summer");
        }else if(mName.equals("september") || mName.equals("october") || mName.equals("november")){
            System.out.println("Fall");
        }else{
            System.out.println("Invalid month name");
        }

    }
}
