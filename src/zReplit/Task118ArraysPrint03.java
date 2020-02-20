package zReplit;

import java.util.*;

public class Task118ArraysPrint03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = scan.nextLine();
        }
        for (int j = 0; j < arr.length-2; j++) {
            System.out.println(arr[j] + " , " + arr[j+1] + " , " + arr[j+2]);
        }
    }
}
