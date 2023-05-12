package day35lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Lambda04 {
    public static void main(String[] args) throws IOException {
        readTextFile();
        System.out.println(checkSpecificWordExistInAllLines("Lambda"));

    }

    //E1: go to LambdaTextFile and print the text in the file on the console
    public static void readTextFile() throws IOException {
        Files.
                lines(Paths.get("src/main/java/day35lambda/LambdaTextFile.txt")).
                forEach(System.out::println);
    }

    //E2. go to LambdaTextFile and check if the lines have Lambda word
    public static boolean checkSpecificWordExistInAllLines(String word) throws IOException {
      return   Files.
               lines(Paths.get("src/main/java/day35lambda/LambdaTextFile.txt")).
              allMatch(t->t.contains(word));
    }
}
