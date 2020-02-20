package zReplit;

import java.util.*;

public class Task132ArraysDiving {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float[] score = new float[7];

        float difficulty = 0f;
        float total = 0f;
        float sum = 0f;

        for (int i = 0; i < score.length; i++) {
            System.out.println("Enter score for judge " + (i+1) + ":");
            score[i] = scan.nextFloat();
        }

        Arrays.sort(score);
        System.out.println("Enter difficulty:");
        difficulty = scan.nextFloat();

        for (int i = 1; i < score.length-1; i++) {
            sum += score[i];
        }

        sum *= difficulty;
        total = sum * 0.6f;

        System.out.printf("Total: %.2f", total);

    }

}
