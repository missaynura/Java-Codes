package homework;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Practice {

    // Write a Java program that takes in a string and prints out its first character
    // .charAt()

    public static void main(String[] args) {
        //1.Way
        String name1="Hello";
        stringCharacter(name1);

        //2.Way
        // We used .trim() method to get rid of the spaces before and after of the string
        Scanner input = new Scanner(System.in);
        System.out.println("Type name");
        String name2 = input.nextLine().trim();
        stringCharacter(name2);

        //3. Way
        // with .next() all white spaces before the string get ignored and spaces inbetween give an error with this regex
        // we used .replaceAll() method to get rid of all non-alphabetical characters with regex including whitespace
        System.out.println("Type another name");
        String name3 = input.nextLine().replaceAll("[^a-zA-Z]", "").toUpperCase();
        stringCharacter(name3);

    }


    public static void stringCharacter(String x){
        System.out.println(x.charAt(0));
    }

}
