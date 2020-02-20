package zReplit;

import java.util.*;

public class Task113ArraysCountEvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = scan.nextInt();
        }

        int count = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
