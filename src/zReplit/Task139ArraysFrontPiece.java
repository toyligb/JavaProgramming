package zReplit;

import java.util.*;

public class Task139ArraysFrontPiece {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];

        for (int i = 0; i < size; i++) {
            num[i] = scan.nextInt();
        }

        if (size >= 2) {
            int newNums[] = {num[0], num[1]};
            System.out.println(Arrays.toString(newNums));
        } else {
            System.out.println(Arrays.toString(num));
        }

    }

}
