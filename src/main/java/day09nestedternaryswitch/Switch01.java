package day09nestedternaryswitch;

public class Switch01 {
    public static void main(String[] args) {
        
     //----------------------- Nested Ternary -------------------------------
        
        //Example 1: type code to display day numbers for the day names
        // sunday == 1, etc

        //1.way if-else-if
        String dayName = "monday";
        if (dayName.equalsIgnoreCase("monday")) {
            System.out.println(1);
        } else if (dayName.equalsIgnoreCase("tuesday")) {
            System.out.println(2);
        } else if (dayName.equalsIgnoreCase("wednesday")) {
            System.out.println(3);
        } else if (dayName.equalsIgnoreCase("thursday")) {
            System.out.println(4);
        } else if (dayName.equalsIgnoreCase("friday")) {
            System.out.println(5);
        } else if (dayName.equalsIgnoreCase("saturday")) {
            System.out.println(6);
        } else if (dayName.equalsIgnoreCase("sunday")) {
            System.out.println(7);
        } else {
            System.out.println("invalid");
        }

        //2. way: switch statement
        switch (dayName.toLowerCase()) {
            case "sunday":
                System.out.println(7);
                break;
            case "monday":
                System.out.println(1);
                break;
            case "tuesday":
                System.out.println(2);
                break;
            case "wednesday":
                System.out.println(3);
                break;
            case "thursday":
                System.out.println(4);
                break;
            case "friday":
                System.out.println(5);
                break;
            case "saturday":
                System.out.println(6);
                break;
            default:
                System.out.println("invalid entry");
                break;
        }
    }
}
