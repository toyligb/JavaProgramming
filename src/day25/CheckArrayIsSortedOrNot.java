package day25;

import java.util.*;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {

        int[] nums = {13, 31, 8, 5, 21, 2};
        // temporary array doretmeli, size den bolmaly
        int[] numsCopy = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            numsCopy[i] = nums[i];
        }
        System.out.println("Before sorting numsCopy = " + Arrays.toString(numsCopy));

        Arrays.sort(numsCopy);
        System.out.println("After sorting numsCopy = " + Arrays.toString(numsCopy));

        // check the array still have same content in same order after sorting

        if (Arrays.equals(nums, numsCopy)) {
            System.out.println("Array already sorted");
        } else {
            System.out.println("Array is not sorted already");
        }



    }
}
