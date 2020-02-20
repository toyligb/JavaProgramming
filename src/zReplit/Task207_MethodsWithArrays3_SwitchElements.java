package zReplit;

import java.util.*;

public class Task207_MethodsWithArrays3_SwitchElements {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 4};
        do_switch(nums);
        System.out.println("nums = " + Arrays.toString(nums));

    }

    public static int[] do_switch(int[] i) {

        int temp = i[0];
        i[0] = i[i.length - 1];
        i[i.length - 1] = temp;
        return i;

    }

}
