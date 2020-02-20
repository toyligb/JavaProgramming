package day27;

import java.util.*;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

        int[] arr1D = {1, 2, 3};
                       // 0  1  2    0  1  2     indexes of elements
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};
                      //     0          1          indexes of arrays

        System.out.println("arr2D = " + Arrays.toString(arr2D)); // Arrays.toString dine 1d arraylere bolyar

        System.out.println(arr2D.length);
        System.out.println(Arrays.toString(arr2D[0]));   // returns int array
        System.out.println(Arrays.toString(arr2D[1]));

        System.out.println(arr2D[0][2]); // 0 index arrayin 3 index elementini print edyar

        // Arrays.deepToString     multi dimensional arrayleri print etmek ucin ulanilyar
        System.out.println(Arrays.deepToString(arr2D));


    }

}
