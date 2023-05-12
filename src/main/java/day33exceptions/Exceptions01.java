package day33exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions01 {

    /*
       1. If you get red underline while you type code, it means it is CompileTime Exception (Checked Exception).
       2. To handle Checked Exception you can use try-catch block.
       3. If you use multiple catch blocks after try block and the Exception Classes have parent-child relationship
          Child Exception Class must be typed first, Parent must be typed later.

          Interview Question: What is the difference between throw and throws keywords?
          i) throw is used in method body, throws is used in the method signature line.
          ii) throw can be used many times in a method body, but throws can be used only once
          iii) after using throw keyword, we create an Exception Class Object, but after using throws we type just the name of the Exception Class
          iv) after using throw keyword we can use just one Exception Class, but after using throws we can use multiple Exception Classes
          v) throw keyword handles the Exception and lets next codes to be executed, but throws make the code throw exception and stops the execution.
     */
    public static void main(String[] args) {
        readTextFile1();


        try {
            readTextFile2();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //Example 1: create a method reads text in a text file

    //1.Way: using try-catch
    public static void readTextFile1(){
        try {
            FileInputStream fis = new FileInputStream("src/main/java/day33exceptions/MyTextFile.txt");
            int k=0; //always declare starting point in while loop
            while ((k=fis.read())!=-1){
                System.out.print((char) k);
            }

        //FileNotFoundException is for path and the existence of the file == CompileTime Exception or Checked Exception
        } catch (FileNotFoundException e) {
            System.out.println("There is an issue in the path or the file was deleted");
        //IOException is for all issues related with Input and Output == CompileTime Exception or Checked Exception
        } catch (IOException e) {
            System.out.println("Some characters are not in English");
        }
    }


    //2.Way: using throw keyword
    public static void readTextFile2() throws IOException {
        FileInputStream fis = new FileInputStream("src/main/java/day33exceptions/MyTextFile.txt");

        int k=0; //always declare starting point in while loop
        while ((k=fis.read())!=-1){
            System.out.print((char) k);
        }

    }
}
