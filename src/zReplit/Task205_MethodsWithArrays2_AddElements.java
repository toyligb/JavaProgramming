package zReplit;

import java.util.*;

public class Task205_MethodsWithArrays2_AddElements {

    public static void main(String[] args) {

        int[] arr1 = new int[]{10, 40, 50, 3, 1};
        int[] arr2 = new int[]{11, 0, 500, 44, 1101};
        System.out.println(Arrays.toString(addElements(arr1, arr2)));

    }

    public static int[] addElements(int[] ints1, int[] ints2) {

        int[] newInts = new int[5];
        for (int i = 0; i < newInts.length; i++) {
            newInts[i] = ints1[i] + ints2[i];
        }
        return newInts;
    }

}
