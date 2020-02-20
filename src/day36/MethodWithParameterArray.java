package day36;

import java.util.*;

public class MethodWithParameterArray {

    public static void main(String[] args) {

        int[] nums = {1, 5, 3, 4, 7, 2};
        System.out.println("Before sort nums = " + Arrays.toString(nums));

        Arrays.sort(nums);
        changeArrayFirstItemTo100(nums);
        System.out.println("After sort nums = " + Arrays.toString(nums));

    }

    /**
     *
     * @param numbers
     */
    public static void changeArrayFirstItemTo100 (int[] numbers) {

        numbers[0] = 100;
        // *** INTERVIEW QUESTION: ***
        // JAVA IS A PASS BY VALUE LANGUAGE
        // WHEN IT COMES TO PASSING ARGUMENT TO THE METHOD

    }

}
