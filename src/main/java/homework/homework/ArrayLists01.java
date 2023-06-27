package homework.homework;

import java.util.ArrayList;

public class ArrayLists01 {
    public static void main(String[] args) {
        ArrayList<String> seasons = new ArrayList<>();
        seasons.add("Spring");
        seasons.add("Summer");
        seasons.add("Fall");
        seasons.add("Winter");

        System.out.println(seasons);
        System.out.println( containsParticularValue( seasons, "summer" ) );
    }
    public static boolean containsParticularValue(ArrayList<String> checkValue, String seasonName){


        String lowerCaseSeason = seasonName.substring(0, 1).toUpperCase();
        String rest = seasonName.substring(1).toLowerCase();

        String combine = lowerCaseSeason + rest;
        return checkValue.contains(combine);

    }

}
