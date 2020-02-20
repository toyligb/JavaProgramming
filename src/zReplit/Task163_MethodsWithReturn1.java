package zReplit;

import java.util.*;

public class Task163_MethodsWithReturn1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n = scan.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter " + n + " words:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.next();
        }
        System.out.println("Enter word to count in array:");
        String t = scan.next();
        System.out.println(count_appearance(arr, t));
    }

    public static int count_appearance(String[] arr, String t) {

        int count = 0;
        for (String each : arr) {
            if (each.equals(t)) {
                count++;
            }
        }
        return count;
    }

}
