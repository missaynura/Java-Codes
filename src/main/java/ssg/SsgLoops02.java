package ssg;

public class SsgLoops02 {
    public static void main(String[] args) {
      //write a program between 10 and 30 including 10 and 30
      // print numbers on the same line with commas between them 10, 11,12...30

      for (int num=10; num<31; num++) {
          System.out.print(num);
          if(num!=30){
              System.out.print(", ");
          }

      }
    }
}
