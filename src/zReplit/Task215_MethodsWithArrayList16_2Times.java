package zReplit;

import java.util.*;

public class Task215_MethodsWithArrayList16_2Times {

    public static void main(String[] args) {

        ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(1, 5, 3, 7));
        System.out.println(twoItems(lst));

    }

    public static ArrayList<Integer> twoItems(ArrayList<Integer> nums) {

        for (int i = nums.size() - 1; i >= 0; i--) {
            nums.add(i + 1, nums.get(i));
        }
        return nums;
    }

}
