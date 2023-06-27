package homework.homework;

public class Loops03 {

    public static void main(String[] args) {

        //Type code to print the unique digits in an integer. Example; 223878 ⇒ 37
        int number = 23223341;
        String str = String.valueOf(number);
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                System.out.print(ch);
            }
        }
        System.out.println();

        //Type code to draw the following image by using a for loop.
        //A A A A A
        //A A A A A
        //A A A A A

        int row = 4;
        for (int k = 1; k<=row; k++){
            for(int b = 0; b<5; b++){
                System.out.print("A");
            }
            System.out.println();
        }
        //2.way
        int rows = 3;
        int columns = 5;
        for(int i=1; i<=rows; i++){
            String s = "";
            for(Integer k=1; k<=columns; k++){
                s = s + "A ";
            }
            System.out.println(s);
        }
        //with while loop
        int row2=1;
        while (row2<6){
            int l = 1;
            while (l<6){
                System.out.print("B");
                l++;
            }
            System.out.println();
            row2++;
        }
        //2. way
        int rows1 = 3;
        int columns1 = 5;
        int i=1;
        while(i<=rows1){
            String s = "";
            for(Integer k=1; k<=columns1; k++){
                s = s + "A ";
            }
            System.out.println(s);
            i++;
        }
    }
}
