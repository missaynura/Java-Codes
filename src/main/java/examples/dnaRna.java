package examples;

public class dnaRna {
    // take DNA convert to RNA

    public static void main(String[] args) {

        //Create a method that returns true when x is equal to y; otherwise return false. x & y are numbers

        System.out.println(checkEqual( 3,3 ));

        /*
        Transcribe the given DNA strand into corresponding mRNA -
        a type of RNA, that will be formed from DNA after transcription.
        DNA has the bases     A, T, G and C,
        while RNA converts to U, A, C and G respectively.

                ATTAGCGCGATATACGCGTAC
                CGATATA
                GTCATACGACGTA

         */

        System.out.println(dnaToRna("ATTAGCGCGATATACGCGTAC"));


    }

    public static boolean checkEqual(int x, int y){
        return x == y ? true : false;
    }


    // Take dna as String
    public static String dnaToRna(String dna){

        //create an empty RNA string , we will add rna codes into this string from loop
        String rnaString = "";
        //split the dna code that we took as string, so we get an Array
        // we will use this array in the loop
        String[] dnaCode = dna.split("");

        // loop through each index of the String array
        // from the dnaCode array
        for( int index = 0; index <= dnaCode.length - 1; index++ ){
            // match each letter from that dnaCode String array to the cases below
            switch ( dnaCode[index] ){

                case "A":
                    //String = immutable cannot be changed
                    //Creates different references (objects) whenever we (append) add strings at end, so when we use +=
                    //The original String container is lost
                    //To prevent multiple String objects being created, we can just use a single object
                    // and just reassign a new value to it
                    //This way the original data is not lost + new updates are made each time from loop
                    rnaString = rnaString + "U";
                    break;

                case "T":
                    rnaString = rnaString + "A";
                    break;

                case "G":
                    rnaString = rnaString + "C";
                    break;

                case "C":
                    rnaString = rnaString + "G";
                    break;

                default:
                    System.out.println("error");
            }
        }
        return rnaString;
    }
}
