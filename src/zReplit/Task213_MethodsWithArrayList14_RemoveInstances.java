package zReplit;

import java.util.*;

public class Task213_MethodsWithArrayList14_RemoveInstances {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        Integer[] nums = new Integer[]{1, 1, 2, 3};
        arr.addAll(Arrays.asList(nums));

        System.out.print(removeInst(arr, 1));

    }

    private static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n) {

        for (int i = r.size() - 1; i >= 0; i--) {
            if (r.get(i) == n) {
                r.remove(i);
            }
        }
        return r;
    }


}
