package day28;

import java.util.*;

public class ExcelVisualizer2 {

    public static void main(String[] args) {

        int[][] myExcel = {
                {10, 27, 88, 99},
                {87, 100},
                {90, 45, 65}
        };

        // 3 questions about methods:
        // what does it do?
           // deepToString method takes multiD array and turn it into a String with all items
        // what external data do we provide
           // the multiD array object or multiD array variable
        // what do I get out of it
           // String representation of multiD array object
        System.out.println(Arrays.deepToString(myExcel));

        for (int[] eachRow : myExcel) {
            for (int eachCell : eachRow) {
                System.out.print(eachCell + " ");
            }
            System.out.println();
        }

    }

}
