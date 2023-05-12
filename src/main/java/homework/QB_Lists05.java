package homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class QB_Lists05 {

    /*
        If the list has 15 as element, change all 15s to 51
        Example: (12, 11, 15, 34, 43) ==> Output is (12, 11, 51, 34, 43)
     */
    public static void main(String[] args) {

        //1.Way ArrayList
        List<Integer> num=new ArrayList<>();
        num.add(12);
        num.add(11);
        num.add(1);
        num.add(34);
        num.add(43);
        System.out.println(num);//[12, 11, 15, 34, 43]

        if(num.contains(15)) {
            for (Integer w : num) {
                if (w == 15) {
                    num.set(num.indexOf(w), 51);
                }
            }
            System.out.println(num); //[12, 11, 51, 34, 43]
        }else {
            System.out.println("The expected element not found");
        }


        //2.Way LinkedList ????????????????????????????????????????????
        LinkedList<Integer> n=new LinkedList<>();
        n.add(12);
        n.add(11);
        n.add(15);
        n.add(34);
        n.add(43);
        System.out.println(n);//[12, 11, 15, 34, 43]

        for (Integer w : n){
            if(n.element()==15){
                n.remove(w);
                n.add(w, 51);
            }
        }
        System.out.println(n);

    }
}
