package homework;

public class IfStatement02 {
    public static void main(String[] args) {
        /*
        Type code to print
        a) "Valid Password" if the password has at least 8 characters different from space
        character
        b) "Do not use space character in password" if the password has any space
        character in any position
        c) "Invalid Password" if a and b conditions are not satisfied
        Note: Be careful about the orders of conditions in the solution
         */
        String pwd = "Abccvmjjh";
        if(pwd.replaceAll("\\S", "").length()>0){
            System.out.println("do not use space character in password");
        }else if(pwd.length()>=8){
            System.out.println("valid password");
        }else{
            System.out.println("invalid password");
        }
        System.out.println("==========");


        String password = "a1b2c3d4";
        if(password.replaceAll("\\S", "").length()>0){
            System.out.println("Do not use space character in password");
        }else if(password.replaceAll("\\s", "").length()>=8){
            System.out.println("Valid Password");
        }else{
            System.out.println("Invalid Password");
        }


        /* 168
        3) Type code to print
        a) "Round up by last digit:" and print the rounded value if the last digit is greater than
        or equal to 5
        b) "Round down by last digit" and print the rounded value if the last digit is less than 5
         */





        int i = 124;
        if(i%10>=5){
            System.out.println("Round up by last digit:" + (i/10+1)*10);
        }else{
            System.out.println("Round down by last digit:" + (i/10)*10);
        }

    }

}
