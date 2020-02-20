package zReplit;

import java.util.*;

public class Task156_Methods11_AddToArray {

    public static void add_to_r(int[] r, int n) {

        int[] new_r = new int[r.length + 1];

        for (int i = 0; i < r.length + 1; i++) {
            if (i != r.length) {
                new_r[i] = r[i];
            } else {
                new_r[i] = n;
            }
        }

        System.out.println(Arrays.toString(new_r));

    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(), n = inp.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i <= size - 1; i++) {
            arr[i] = inp.nextInt();
        }

        add_to_r(arr, n);

    }

}
