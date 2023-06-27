package homework.homework;

import java.util.Scanner;

public class Practice03SwitchStatement {
    public static void main(String[] args) {
        /*
        Use switch statement to print
        a) "Winter" for December, January, February
        b) "Spring" for March, April, May
        c) "Summer" for June, July, August
        d) "Fall" for September, October, November
        e) "Invalid month name" for all the others

        - we will use Scanner class
        - switch statement
        - last statement = the default= we will use e) invalid month name
        - multiple conditions for cases

        - Potential problems:
        - we will ignorecase method
        - regex and trim

         */
            Scanner input = new Scanner(System.in);
//        System.out.println("Provide me a month");
//        String month = input.nextLine().replaceAll("[^a-zA-Z]", "").trim().toLowerCase();
//
//
//        // way 1
//        switch ( month ){
//
//            case "december":
//                System.out.println("Winter");
//                break;
//            case "january":
//                System.out.println("Winter");
//                break;
//            case "february":
//                System.out.println("Winter");
//                break;
//
//            case "march":
//                System.out.println("Spring");
//                break;
//            case "april":
//                System.out.println("Spring");
//                break;
//            case "may":
//                System.out.println("Spring");
//                break;
//
//            case "june":
//                System.out.println("Summer");
//                break;
//            case "july":
//                System.out.println("Summer");
//                break;
//            case "august":
//                System.out.println("Summer");
//                break;
//
//            case "september":
//                System.out.println("Fall");
//                break;
//            case "october":
//                System.out.println("Fall");
//                break;
//            case "november":
//                System.out.println("Fall");
//                break;
//
//            default:
//                System.out.println("Not valid");
//
//        }

        //2.way adding loops and refactoring (consolidating) the switch
        //DRY-code, don't repeat yourself

        do{
            System.out.println("Provide me a month");
            String month = input.nextLine().replaceAll("[^a-zA-Z]", "").trim().toLowerCase();

            switch ( month ){

                case "december" :
                case "january":
                case "february" :
                    System.out.println("Winter");
                    break;

                case "march":
                case "april":
                case "may":
                    System.out.println("Spring");
                    break;

                case "june":
                case "july":
                case "august":
                    System.out.println("Summer");
                    break;

                case "september":
                case "october":
                case "november":
                    System.out.println("Fall");
                    break;

                default:
                    System.out.println("Not valid");
                    continue;
            }
                break;

        }while (true);

    }
}
