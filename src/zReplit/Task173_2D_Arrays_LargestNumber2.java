package zReplit;

import java.util.*;

public class Task173_2D_Arrays_LargestNumber2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt(), cols = scan.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= cols - 1; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        int max = arr[0][0];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        //System.out.println("max = " + max);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = max;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }

}
