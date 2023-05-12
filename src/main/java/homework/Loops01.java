package homework;

public class Loops01 {
        public static void main(String[] args) {
        /*
        Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line
        with a space between two consecutive integers
         */
        for(int num=120; num>10; num--){
            if(num%4==0 && num%6==0){
                System.out.print(num + " ");
            }
        }

            //1.Way:
            String s = "";
            for(Integer i=120; i>10; i--){
                if(i%4==0 && i%6==0){
                    s = s + i + " ";
                }
            }
            System.out.println(s);

            /*
            Type code to print repeated characters in a String. For example; accessories ⇒ ces
             */
            String str = "accessories";
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                if(str.indexOf(ch)!=str.lastIndexOf(ch)){
                    System.out.print(ch);
                }
            }
            System.out.println("-----------");
            //1.Way:
            String st = "accessories";
            String d = "";
            for(Integer i=0; i<st.length(); i++){
                String c = st.substring(i,i+1);
                if(s.indexOf(c)!=st.lastIndexOf(c)){
                    if(!d.contains(c)){
                        d = d + c;
                    }
                }
            }
            System.out.println(d);


    }
}
