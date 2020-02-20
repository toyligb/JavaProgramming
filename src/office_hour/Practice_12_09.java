package office_hour;

import java.util.*;

public class Practice_12_09 {
    public static void main(String[] args) {

        // first way to create array:
        // int[] arr = new arr[7];
        // arr[0] = 3;
        // arr[1] = 6; we sheyle gidyar.

        // second way to create array:
        // int[] arr2 = new int[] { 11, 4, 2, 14, 7, 5, 9 };

        // 3rd and the shortest way to create array:
        // must be in one line
        // int[] arr3 = { 11, 4, 2, 14, 7, 5, 9 };

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array length:");
        int n = scan.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }
        int max = nums[0];
        int max2 = nums[0];

        for (int j = 1; j < nums.length; j++) {
            if (max < nums[j]) {
                max = nums[j];
            }
        }
        System.out.println("max = " + max);

        for (int j = 1; j < nums.length; j++) {
            if (max2 < nums[j] && max2 < max) {
                max2 = nums[j];
            }
        }
        System.out.println("max2 = " + max2);
    }
}
