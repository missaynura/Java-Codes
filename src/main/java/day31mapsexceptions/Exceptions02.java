package day31mapsexceptions;

public class Exceptions02 {
    public static void main(String[] args) {
    String[] arr={"Tom", "Ajda", "Brad", "Angelina"};
        System.out.println(getElementFromStringArray(arr, 3));//Angelina
        System.out.println(getElementFromStringArray(arr, 5));
        System.out.println(getElementFromStringArray(arr, -5));
    }

    //ex1. create a method that returns any element from an array by using the index of the element
    public static String getElementFromStringArray(String [] arr, int idx){

        try{
            return arr[idx];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Do not use non-existing index");
            return arr[arr.length-1];//will return last element from the list
        }

    }
}
