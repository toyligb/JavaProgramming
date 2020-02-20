package zReplit;

import java.util.*;

public class Task217_MethodsWithArrays5_badProducts {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 1, 0, 1};
        int x = 5;
        System.out.println(badP(arr, x));

    }

    public static boolean badP(int[] products, int limit) {

        int count = 0;
        for (int each : products) {
            if (each == 0) {
                count++;
            }
        }
        return count < limit;

    }

}
