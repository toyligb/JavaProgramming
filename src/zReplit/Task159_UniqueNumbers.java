package zReplit;

import java.util.*;

public class Task159_UniqueNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size = scan.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    private static void printUniqueNumbers(int[] nums) {

        //int unique = nums[0];
        //int count = 0;
        for (int j = 0; j < nums.length; j++) {
            int count = 0;
            for (int k = 0; k < nums.length; k++) {
                if (nums[j] == nums[k]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(nums[j]);
            }
        }

    }

}
