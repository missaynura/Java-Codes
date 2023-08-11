package practices.practice03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q01_ArrayList_GradeAverage {
    //--------------- Practice ArrayList -----------------------
    /*
        get as many grades as a teacher wants to enter, and find the number of 
        students who pass the average
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> examGradeList = new ArrayList<>();

        do {
            System.out.println("enter exam grade:");
            int examGrade = scanner.nextInt();
            examGradeList.add(examGrade);
            System.out.println("continue: y/n");
            String condition = scanner.next();

            if(condition.equalsIgnoreCase("n")){
                break;
            }
        }while (true);// while true == infinate loop
        //as long as we do not break code this loop will keep repeating
        System.out.println("examGradeList = " + examGradeList);

        //calculate the average
        double sum = 0;
        for(int w: examGradeList){
            sum += w;// sum = sum + w;
        }
        double average = sum/examGradeList.size();
        System.out.println("average = " + average);

        //calculate how many students are above the average
        int numOfStdAboveAverage = 0;

        for(int w: examGradeList){
            if(w>average){
                numOfStdAboveAverage++;
            }
        }
        System.out.println("number of students above average = "+ numOfStdAboveAverage);
    }
}
