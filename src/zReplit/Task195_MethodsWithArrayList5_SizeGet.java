package zReplit;

import java.util.*;

public class Task195_MethodsWithArrayList5_SizeGet {

    public static void main(String[] args) {

        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(5, 7, 100));
        System.out.println(sum(ints));

    }

    private static int sum(ArrayList<Integer> ints) {

        int sum = 0;
        for (int each : ints) {
            sum += each;
        }
        return sum;
    }
}
