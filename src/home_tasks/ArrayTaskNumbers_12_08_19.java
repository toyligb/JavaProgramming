package home_tasks;


import java.util.*;

public class ArrayTaskNumbers_12_08_19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        double avg = 0;
        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
            if (arr[i] % 2 == 0) {
                sumEven += arr[i];
            }
            if (arr[i] % 2 == 1) {
                sumOdd += arr[i];
            }
        }
        avg = sum / size;
        System.out.println("Average of elements in array is = " + avg);
        System.out.println("Sum of the elements in array is = " + sum);
        System.out.println("Sum of the even number elements of array is = " + sumEven);
        System.out.println("Sum of the odd number elements of array is = " + sumOdd);
        System.out.println("Maximum number in elements of array is = " + max);
        System.out.println("Minimum number in elements of array is = " + min);
    }
}
