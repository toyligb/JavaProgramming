package day27;

import java.util.*;

public class MultiDimensionalArrays_3D {
    public static void main(String[] args) {

        // 2D Array: contains 1D dimensional array
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};

        // 3D Array: contains 2D dimensional array
        int[][][] arr3D = {{{1, 2, 3}, {4, 55, 6}}, {{7, 8, 9}, {10, 11, 12}}};
        // [index num of 2D array] [index num of 1D array] [index num of item]

        System.out.println(arr3D[1][0][2]);  // will print 9

        System.out.println(Arrays.toString(arr3D[0][0])); // will print [1, 2, 3]

        System.out.println(Arrays.toString(arr3D[1][1])); // will print [10, 11, 12]

        System.out.println(Arrays.deepToString(arr3D[1])); // will print [[7, 8, 9], [10, 11, 12]]

        System.out.println(Arrays.deepToString(arr3D));
        int max = arr3D[0][0][0];
        for (int each2DArray[][] : arr3D) {
            for (int each1DArray[] : each2DArray) {
                for (int eachItem : each1DArray) {
                    System.out.print(eachItem + " ");
                    if (eachItem > max) {
                        max = eachItem;
                    }
                }
            }
        }
        System.out.println("\nmax = " + max);

        System.out.println("========================");

        for (int i = 0; i < arr3D.length; i++) {
            for (int j = 0; j < arr3D[i].length; j++ ) {
                for (int k = 0; k < arr3D[i][j].length; k++) {
                    System.out.print(arr3D[i][j][k] + " / ");
                }
            }
        }
    }

}
