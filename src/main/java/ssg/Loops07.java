package ssg;

public class Loops07 {
    public static void main(String[] args) {
        /*
        type code to draw the following image by using a for loop
        AAAAAAAA
        AXXXXXXA
        AXXXXXXA
        AXXXXXXA
         */

        for(int i=0; i<4; i++){
            for(int j=0; j<8; j++){

                if(j>0 && j<7 && i>0 && i<3){
                    System.out.print("X ");
                }else{
                    System.out.print("A ");
                }
            }
            System.out.println();
        }

    }
}
