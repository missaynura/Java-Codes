package question_bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QB_Nr3_Switch {
    //----------------- Switch Statements -------------------------
    /*
    Type a code which prints the all month names starting with the given month numbers.
    Example: If the month number is 9 output will be September October November December

    - use Scanner class to get user input
    - switch statement instead of if statement, as it is simpler and there is only
    single value that we test
    - no need for regex as switch will only test for given values, it will use default 
        when the arguments dont match automatically
    - last value - default - will be invalid entry

    -way 2, use Array
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month number");
//        String monthNumber = input.nextLine().trim();

        //1.Way
//        switch (monthNumber){
//            case "1":
//                System.out.println("January, February, March, April, May, June, July, August, September, October, November, December");
//                break;
//            case "2":
//                System.out.println("February, March, April, May, June, July, August, September, October, November, December, January");
//                break;
//            case "3":
//                System.out.println("March, April, May, June, July, August, September, October, November, December, January, February");
//                break;
//            case "4":
//                System.out.println("April, May, June, July, August, September, October, November, December, January, February, March");
//                break;
//            case "5":
//                System.out.println("May, June, July, August, September, October, November, December, January, February, March, April");
//                break;
//            case "6":
//                System.out.println("June, July, August, September, October, November, December, January, February, March, April, May");
//                break;
//            case "7":
//                System.out.println("July, August, September, October, November, December, January, February, March, April, May, June");
//                break;
//            case "8":
//                System.out.println("August, September, October, November, December, January, February, March, April, May, June, July");
//                break;
//            case "9":
//                System.out.println("September, October, November, December, January, February, March, April, May, June, July, August");
//                break;
//            case "10":
//                System.out.println("October, November, December, January, February, March, April, May, June, July, August, September");
//                break;
//            case "11":
//                System.out.println("November, December, January, February, March, April, May, June, July, August, September, October");
//                break;
//            case "12":
//                System.out.println("December, January, February, March, April, May, June, July, August, September, October, November");
//                break;
//            default:
//                System.out.println("invalid entry");
//        }

        //2.Way
        List<String> monthList = new ArrayList<>();
        String monthNumber = input.nextLine().trim();

        switch (monthNumber) {
            case "1":
                monthList.add("January");
            case "2":
                monthList.add("February");
            case "3":
                monthList.add("March");
            case "4":
                monthList.add("April");
            case "5":
                monthList.add("May");
            case "6":
                monthList.add("June");
            case "7":
                monthList.add("July");
            case "8":
                monthList.add("August");
            case "9":
                monthList.add("September");
            case "10":
                monthList.add("October");
            case "11":
                monthList.add("November");
            case "12":
                monthList.add("December");
                System.out.println(monthList);
                break;
            default:
                System.out.println("Invalid entry");
        }
    }
}
