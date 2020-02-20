package zReplit;

import java.util.*;

public class Task113OmerSanlialp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }
        int countEven = 0;
        for (int i:nums) {
            if (i%2 == 0) {
                countEven++;
            }
        }
        System.out.println("countEven = " + countEven);
    }
}
