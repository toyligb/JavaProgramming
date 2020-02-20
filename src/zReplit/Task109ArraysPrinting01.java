package zReplit;

import java.util.*;

public class Task109ArraysPrinting01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] arr = new String[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = scan.nextLine();
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j].substring(0, 3));
        }

    }

}
