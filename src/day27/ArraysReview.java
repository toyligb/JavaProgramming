package day27;

import java.lang.reflect.Array;
import java.util.*;

public class ArraysReview {

    public static void main(String[] args) {

        int num = 10;
        int[] numArr = {10, 20};

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter your number at index " + i + ":");
            numbers[i] = scan.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[numbers.length-1] + " is the largest.");

        int[] scores = {100, 897, 645, 32, 1231, 224, 556, 7, 1, 2, 3, 4};
        int min = scores[0];

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        System.out.println("min = " + min);

        int secondMin = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == min) {
                continue;
            }
            if (secondMin > scores[i]) {
                secondMin = scores[i];
            }
        }
        System.out.println("secondMin = " + secondMin);

    }

}
