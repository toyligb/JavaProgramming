package day34;

import java.util.Arrays;

public class MethodThatReturnMoreThanOneValue {

    public static void main(String[] args) {

        String sentence = "I Love Java";

        char[] eachChar = sentence.toCharArray();
        String[] eachWord = sentence.split(" ");

        System.out.println(Arrays.toString(eachChar));
        System.out.println(Arrays.toString(eachWord));

        int[] resultArr = boysVsGirlsResult();
        System.out.println(Arrays.toString(resultArr));

    }

    // create a method that return int array return BoysVsGirlsResult

    public static int[] boysVsGirlsResult() {

        // after fierce competition
        int[] boysGirlsCount = {56, 52};
        return boysGirlsCount;

    }

}
