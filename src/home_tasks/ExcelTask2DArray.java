package home_tasks;

import java.util.*;

public class ExcelTask2DArray {

    public static void main(String[] args) {

        int[][] excel = {{78, 54, 100, 58}, {33, 44, 77, 123}, {12, 88, 52, 76},
                {67, 33, 98, 67}, {12, 88, 52, 45}, {67, 33, 98, 34}};

        for (int i = 0; i < excel.length; i++) {
            for (int j = 0; j < excel[i].length; j++) {
                System.out.print("Cell(" + (i + 1) + "," + (j + 1) + ")=" + excel[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
