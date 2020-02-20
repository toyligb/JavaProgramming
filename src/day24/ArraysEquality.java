package day24;

import java.util.*;

public class ArraysEquality {
    public static void main(String[] args) {

        // for checking for equality of 2 array object content
        // equals --->> Arrays.equals(firstArray, secondArray)

        int[] scores1 = {2, 5, 6, 7, 3, 34, 6};
        int[] scores2 = {22, 45, 6, 37, 3, 6, 9};
        int[] scores3 = {2, 5, 6, 7, 3, 34, 6};
        int[] scores4 = {6, 5, 6, 34, 3, 7, 2};

        System.out.println(scores1 == scores2); // false, different address
        System.out.println(scores1 == scores3); // false, different address

        boolean isS1S2Equals = Arrays.equals(scores1, scores2);
        System.out.println("isS1S2Equals = " + isS1S2Equals); // false

        boolean isS1S3Equals = Arrays.equals(scores1, scores3);
        System.out.println("isS1S3Equals = " + isS1S3Equals); // true

        boolean isS1S4Equals = Arrays.equals(scores1, scores4);
        System.out.println("isS1S4Equals = " + isS1S4Equals); // false

        System.out.println("sorting 3 and 4 then compare:");
        Arrays.sort(scores3);
        Arrays.sort(scores4);

        System.out.println("After sorting 3 and 4: ");
        System.out.println(Arrays.equals(scores3, scores4)); // true

    }
}
