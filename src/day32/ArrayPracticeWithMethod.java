package day32;

import java.util.*;

public class ArrayPracticeWithMethod {

    public static void main(String[] args) {

        // this is passing the array object directly into the method
        printArrayItems(new int[]{1, 6, 5, 3, 12, 3});

        // this is assigning the array object into a variable
        // and then pass it into the method
        int[] scores = {2, 5, 68, 23, 4, 5, 6};

        printArrayItems(scores);

        printMaxMinSumOfIntArray(scores);

        compare2ArraySize(new String[]{"A", "E", "E"}, new String[]{"R", "T", "Y", "h"});

        String[] heroes1 = {"IronMan", "Deadpool", "Flash", "Antman", "Spiderman"};
        String[] heroes2 = {"Wonder woman", "Doctor Strange", "Hulk", "Aquaman"};

        compare2ArraySize(heroes1, heroes2);


    }

    // printArrayItems
    // create method that has 1 int array as a parameter
    // print each item in this format
    // arrays has items : ===>>> all the items here

    public static void printArrayItems(int[] nums) {

        System.out.println("Arrays has items: " + Arrays.toString(nums));

    }

    // printMaxOfIntArray
    // this method has one int array as parameter
    // and it will print the max number inside the array

    public static void printMaxMinSumOfIntArray(int[] arr) {

        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > 60) {
                ++count;
            }

        }

        System.out.println("sum = " + sum);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        if (count == arr.length) {
            System.out.println("All passed 60");
        } else {
            System.out.println("Not all passed 60");
        }

    }

    public static void compare2ArraySize(String[] arr1, String[] arr2) {

        if (arr1.length > arr2.length) {
            System.out.println("Array 1 has more item");
        } else if (arr1.length < arr2.length) {
            System.out.println("Array 2 has more item");
        } else {
            System.out.println("Both arrays have same amount aof items");
        }
    }

}
