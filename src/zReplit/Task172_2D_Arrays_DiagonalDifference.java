package zReplit;

import java.util.*;

public class Task172_2D_Arrays_DiagonalDifference {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}};

        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            result += matrix[i][i];
            result -= matrix[i][(matrix.length-1)-i];

        }

        System.out.println(Math.abs(result));

    }

}
