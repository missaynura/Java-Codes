package practices.practice04;

import java.time.LocalTime;
import java.util.Scanner;

public class Q04_DateTime_DiceSecond {
    /*
    write a method that rolls two dice and compares the result with the score of the computer by multiplying the result by 2 or 5
    according to the second it was.
    if the second of the dice is a multiple of 5, the number of dice will be multiplied by 5 and added to the score
    if the second of the dice is odd number, the number of dice will be added to the score
     */
    public static void main(String[] args) {
        rollDice();
    }

    static int playerDice;
    static int computerDice;
    static int playerSecond;
    static int computerSecond;
    static int playerScore;
    static int computerScore;
    static int counter;

    public static void rollDice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter R to roll dice");
        if (scanner.next().equalsIgnoreCase("r")) {
            playerDice = (int) (Math.random() * 6) + 1;
            System.out.println("playerDice = " + playerDice);
            playerSecond = LocalTime.now().getSecond();
            System.out.println("playerSecond = " + playerSecond);
            if (playerSecond % 5 == 0) {
                playerScore += playerDice * 5;
            } else if (playerSecond % 2 == 0) {
                playerScore += playerDice * 2;
            } else {
                playerScore += playerDice;
            }
            System.out.println("playerScore = " + playerScore);
        } else {
            rollDice();
        }

        computerDice = (int) (Math.random() * 6) + 1;
        System.out.println("computerDice = " + computerDice);
        computerSecond = playerSecond + 1; // computer is goint to be luckier
        System.out.println("computerSecond = " + computerSecond);
        if (computerSecond % 5 == 0) {
            computerScore += computerDice * 5;
        } else if (computerSecond % 2 == 0) {
            computerScore += computerDice * 2;
        } else {
            computerScore += computerDice;
        }
        System.out.println("computerScore = " + computerScore);

        counter++;
        if (counter == 2) {
            if (playerScore > computerScore) {
                System.out.println("you win! your score is: " + playerScore + "  Computer's score is: " + computerScore);
            } else if (computerScore > playerScore) {
                System.out.println("you lost, your score is: " + playerScore + "  computer's score is: " + computerScore);
            } else {
                System.out.println("draw! your score is:" + playerScore + "  Computer's score is: " + computerScore);
            }
        } else {
            rollDice();
        }

    }
}
