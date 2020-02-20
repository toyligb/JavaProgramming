package zReplit;

import java.util.*;

public class Task143_2D_ArraysMultiplicationTable {

    public static void main(String[] args) {

        int[][] multiplicationTable = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multiplicationTable[i][j] = (i+1) * (j+1);
            }
        }

        System.out.println(Arrays.deepToString(multiplicationTable));

    }

}
