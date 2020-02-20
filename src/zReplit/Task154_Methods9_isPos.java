package zReplit;

import java.util.*;

public class Task154_Methods9_isPos {

    public static void isPos(int num) {

        String out = (num >= 0)? "Positive" : "Negative";
        System.out.println(out);

    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = inp.nextInt();
        }

        for (int each : arr) {
            isPos(each);
        }

    }

}
