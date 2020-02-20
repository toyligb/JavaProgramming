package zReplit;

import java.util.*;

public class Task114ArraysFindSum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] nums = {scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println(sum);
    }

}
