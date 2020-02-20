package zReplit;

import java.util.*;

public class Task144_2D_ArraysMatchTwo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt(), cols = scan.nextInt();
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        int matches = 0;

        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < cols-1; y++) {
                if (arr[x][y] == arr[x][y + 1]) {
                    matches++;
                }
            }
        }

        System.out.println(matches);

    }

}
