package zReplit;

import java.util.*;

public class Task141ArraysMakeLast {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }

        int[] newNums = new int[size * 2];

//        for (int i = 0; i < newNums.length; i++) {
//            if (i != newNums.length - 1) {
//                newNums[i] = 0;
//            } else {
//                newNums[i] = nums[size - 1];
//            }
//
//        }

        newNums[size * 2 -1] = nums[size - 1];

        System.out.println(Arrays.toString(newNums));

    }

}
