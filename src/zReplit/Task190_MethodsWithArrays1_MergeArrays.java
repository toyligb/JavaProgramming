package zReplit;

import java.util.*;

public class Task190_MethodsWithArrays1_MergeArrays {

    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{4, 5, 6, 7};
        System.out.println(Arrays.toString(mergR(a, b)));

    }

    public static int[] mergR(int[] a, int[] b) {

        int size = a.length + b.length;
        int[] mergedArray = new int[size];
        for (int i = 0; i < a.length; i++) {
            mergedArray[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            mergedArray[j + a.length] = b[j];
        }
        return mergedArray;
    }

}
