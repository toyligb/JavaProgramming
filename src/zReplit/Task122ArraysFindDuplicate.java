package zReplit;

import java.util.*;

public class Task122ArraysFindDuplicate {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] nums = {scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(),
                scan.nextInt(), scan.nextInt(), scan.nextInt()};

        int unique = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int n = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    n++;
                }
            }
            if (n == 1) {
                unique = nums[i];
            }
        }
        System.out.println(unique);
    }
}
