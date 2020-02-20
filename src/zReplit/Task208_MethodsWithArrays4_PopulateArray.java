package zReplit;

import java.util.*;

public class Task208_MethodsWithArrays4_PopulateArray {

    public static void main(String[] args) {

        int[] i = new int[9];
        i = populate(i);
        System.out.println(Arrays.toString(i));

    }

    private static int[] populate(int[] r) {

        for (int i = 0; i < r.length; i++) {
            r[i] = i + 1;
        }
        return r;

    }


}
