package homework.homework;

public class Loops02 {
    public static void main(String[] args) {
        /*
        Type code to check whether a String is palindrome or not. If a String is the same with its
        reverse then it is called palindrome. For example; “anna”, “123321” are palindromes
         */
        String a = "anna";
        String rev = "";
        for(int i=a.length()-1; i>=0; i--) {
            rev = rev + a.charAt(i);
        }if(rev.equals(a)){
            System.out.println(a + "=" + rev);
        }else{
                System.out.println("not palindrome");
        }

    }

}
