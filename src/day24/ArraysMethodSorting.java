package day24;

import java.util.Arrays;
import java.util.*;

public class ArraysMethodSorting {
    public static void main(String[] args) {

        // for sorting an array in ascending order
        // sort --->> Arrays.sort(yourArrayHere)

        int[] scores = {99, 44, 66, 23, 19, 55};

        System.out.println(Arrays.toString(scores));

        Arrays.sort(scores);

        System.out.println(Arrays.toString(scores));

        char[] nameChars = {'b', '%', 'B', 'Г', '8', 'K'};
        System.out.println("Arrays.toString(nameChars) = " + Arrays.toString(nameChars));

        Arrays.sort(nameChars);

        System.out.println("Arrays.toString(nameChars) = " + Arrays.toString(nameChars));
        // chars sorted by ASCII table
        // special characters < number < uppercase < lowercase

        // sorting a String
        // ONLY FIRST CHARACTER MATTER WHEN SORTING A STRING ARRAY
        String[] superHeros = {"Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash"};
        System.out.println(Arrays.toString(superHeros));

        Arrays.sort(superHeros);
        System.out.println("sorted: " + Arrays.toString(superHeros));

        System.out.println("----- boolean -----");
        boolean[] fiveSwitchOnOffs = {true, false, false, true, true};
        System.out.println("fiveSwitchOnOffs = " + Arrays.toString(fiveSwitchOnOffs));

        //Arrays.sort(fiveSwitchOnOffs);
        // THERE IS NO SORT FOR BOOLEAN

    }
}
