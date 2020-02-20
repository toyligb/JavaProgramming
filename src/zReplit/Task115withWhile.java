package zReplit;

public class Task115withWhile {

    public static void main(String[] args) {
                   // 0  1  2  3  4
        int[] nums = {2, 4, 3, 6, 1}; // sum = 16

        int sum = 0;
        int i = 0;
        int countOfEvens = 0;

        while (i < nums.length) {
            sum = sum + nums[i];
            if (nums[i] % 2 == 0) {
                countOfEvens++;
                System.out.println(nums[i] + " is an even number");
            }
            i++;
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] % 2 == 0) {
                countOfEvens++;
            }
            System.out.println(nums[j]);
        }




        System.out.println("sum = " + sum);
    }

}
