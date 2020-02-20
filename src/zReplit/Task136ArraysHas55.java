package zReplit;

import java.util.*;

public class Task136ArraysHas55 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(),
                input.nextInt(), input.nextInt()};

        int countOf5 = 0;
        int countOf55 = 0;
        for (int each : nums) {
            if (each == 5) {
                countOf5++;
            }
        }

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 5 && nums[i + 1] == 5) {
                countOf55++;
            }
        }

        System.out.println(countOf5 > 0 && countOf55 > 0);

    }

}
