package zReplit;

import java.util.*;

public class Task117ArraysPrint02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = scan.nextLine();
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
            if (j % 2 == 0) {
                System.out.print(" , ");
            }
            if (j % 2 == 1) {
                System.out.println();
            }

        }

    }
}
