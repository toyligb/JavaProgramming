package day27;

import java.util.*;

public class MultiDArraysTask {

    public static void main(String[] args) {

        int[][] numbers = {{12, 11, 10, 19}, {19, 20, 15}, {100, 90, 7878, 89}};
        int max = numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] > max) {
                    max = numbers[i][j];
                }
            }
        }
        System.out.println("max = " + max);

        System.out.println("====================");

        for (int eachArr[] : numbers) {
            for (int eachItem : eachArr) {
                if (max < eachItem) {
                    max = eachItem;
                }
            }
        }
        System.out.println("max = " + max);
        System.out.println("======================");

        int min = numbers[0][0];

        for (int eachArr[] : numbers) {
            for (int eachItem : eachArr) {
                if (eachItem < min) {
                    min = eachItem;
                }
            }
        }
        System.out.println("min = " + min);
    }
}
