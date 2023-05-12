package ssg;

public class Arrays02 {
    public static void main(String[] args) {
        //print the sum of the elements of an array on the console
        int arr[]= {5, 1, 3, 5,6 ,8,9,55};
        int sum =0;
        for(int w:arr){
            sum = sum + w;

        }
        System.out.println(sum);

        //print even and odd numbers in the array
        int ar[]= {5, 1, 3, 4,6 ,8,9,55};

        for(int w:arr){
            if(w%2==0){
                System.out.println(w+ " this is even number");
            }else {
                System.out.println(w+ " this is odd number");
            }

        }
    }
}
