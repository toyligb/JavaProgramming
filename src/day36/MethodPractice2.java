package day36;

import java.util.Arrays;

public class MethodPractice2 {

    public static void main(String[] args) {

        long myLongs[] = {12L, 342L, 123425L, 645653443435L, 23L};
        System.out.println("Before swamp myLongs = " + Arrays.toString(myLongs));

        swampFirstAndLastValue(myLongs);

        long[] myNums1 = new long[5];
        System.out.println("myNums1 = " + Arrays.toString(myNums1));
        Long[] myNums2 = new Long[5];
        System.out.println("myNums2 = " + Arrays.toString(myNums2));
        String[] names = new String[5];
        System.out.println("names = " + Arrays.toString(names));

        // primitive type hokman value isleyar
        // reference type null bolup bilyar
        // meselem int x = null ; --->> diyip bolmayar
        // Integer x1 = null ; --->> diyip bolyar

        String str = "abc";


    }

    /**
     * Swamp first and last value of long array
     * @param nums long array
     */
    public static void swampFirstAndLastValue(long[] nums) {

        // first value is nums[0], last value is nums[nums.length - 1]
        long temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        System.out.println("After swamp " + Arrays.toString(nums));

    }

}
