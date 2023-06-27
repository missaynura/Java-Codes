package day09nestedternaryswitch;

public class Switch03 {
    public static void main(String[] args) {
        //type code to print vowels for a,e,i,o,u and not vowels for other letters
        String ch = "e";
        switch (ch.toLowerCase()) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("vowel");
                break;
            case "b":
            case "c":
            case "d":
            case "f":
            case "g":
            case "h":
            case "j":
            case "k":
            case "l":
            case "m":
            case "p":
            case "q":
            case "r":
            case "s":
            case "t":
            case "v":
            case "w":
            case "x":
            case "y":
            case "z":
                System.out.println("not vowel");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
