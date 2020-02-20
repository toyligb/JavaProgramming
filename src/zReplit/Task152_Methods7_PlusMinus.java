package zReplit;

import java.util.Scanner;

public class Task152_Methods7_PlusMinus {

    public static void plusMinus(int[] numbers) {

        int countPlus = 0, countMinus = 0, countZero = 0;
        String output = "";

        for (int each : numbers) {
            if (each == 0) {
                countZero++;
            } else if (each > 0) {
                countPlus++;
            } else {
                countMinus++;
            }
        }

        output += "positives:" + countPlus + ", negatives:" + countMinus
                            + ", zeros:" + countZero;

        System.out.println(output);
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {

            arr[i] = inp.nextInt();
        }

        plusMinus(arr);

    }

}
