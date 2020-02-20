package zReplit;

import java.util.*;

public class Task121ArraysCountEvens {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] nums = {scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()};

        int countOfEvens = 0;

        for (int eachItem : nums) {
            if (eachItem % 2 == 0) {
                countOfEvens++;
            }
        }

        System.out.println(countOfEvens);

    }
}
