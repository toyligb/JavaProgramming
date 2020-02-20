package office_hour;

import java.util.*;

public class TaskMaxNumberByMykyta {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the length of the array:");
        int arrL = scan.nextInt();
        int[] num = new int[arrL];

        for (int i = 0; i < arrL; i++) {
            System.out.println("Enter value of element " + i);
            num[i] = scan.nextInt();
        }

        int max = num[0];
        int min = num[0];

        for (int j = 1; j < num.length; j++) {
            if (min > num[j]) {
                min = num[j];
            }
            if (max < num[j]) {
                max = num[j];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
