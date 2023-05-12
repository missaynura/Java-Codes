package practices.practice03;

import java.util.Scanner;

public class Q02_DoWhile_GuessGame {
    public static void main(String[] args) {

       /*
       write a game that finds random numbers between 0 and 100
       hint: if the number you entered is less than randomNumber print == enter a larger number
       if the number you entered is greater than randomNumber print == enter a smaller number
       if the number you entered is equal to randomNumber print == Congrats you found it

        */
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int)(Math.random()*101);

        System.out.println("enter a number between 0 and 100");
        int number;
        int guessNumber = 10;

        do {
            guessNumber--;
            number = scanner.nextInt();
            if (number < randomNumber) {
                System.out.println("enter a larger number");
                System.out.println("you have "+guessNumber+" guess(es)");

            } else if (number > randomNumber) {
                System.out.println("enter a smaller number");
                System.out.println("you have "+guessNumber+" guess(es)");
            } else {
                System.out.println("Congrats, you found the number");
                System.out.println("you found the number in "+(10-guessNumber)+" guess(es)");
                System.out.println("your point is: "+ (guessNumber+1)*10);//1 ==100
                break;
            }
            if (guessNumber == 0) {
                System.out.println("you could not find the number in 10 guesses");
                System.out.println("Continue: y/n");
                String condition = scanner.next();
                if (condition.equalsIgnoreCase("y")) {
                    System.out.println("enter a number between 0 and 100");
                    guessNumber = 10;
                    randomNumber = (int) (Math.random() * 101);

                } else {
                    break;
                }
            }
            }while (true) ;
        System.out.println("good bye");

    }
}
