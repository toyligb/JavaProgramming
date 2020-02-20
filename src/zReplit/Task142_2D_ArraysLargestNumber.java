package zReplit;

import java.util.*;

public class Task142_2D_ArraysLargestNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt(), cols = scan.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        int biggest = arr[0][0];

        for (int[] each1D : arr) {
            for (int each : each1D) {
                if (each > biggest) {
                    biggest = each;
                }
            }
        }

        System.out.println(biggest);

    }

}
