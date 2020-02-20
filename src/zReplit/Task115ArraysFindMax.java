package zReplit;

import java.util.*;

public class Task115ArraysFindMax {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] nums = {scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()};

        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        System.out.println(max);
    }

}
