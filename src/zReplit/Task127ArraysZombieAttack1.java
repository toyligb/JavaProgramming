package zReplit;

import java.util.*;

public class Task127ArraysZombieAttack1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = scan.nextInt();
        }

        int day = 0;
        System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
        int sum = 0;

        for (int each : inhabitants) {
            sum += each;
        }

//        do {
//            for (int i = 0; i < inhabitants.length; i++) {
//                //if (inhabitants[i] > 0) {
//                inhabitants[i] = inhabitants[i] / 2;
//            }

        while (sum > 0) {
            sum = 0;

            day++;
            for (int i = 0; i < inhabitants.length; i++) {
                inhabitants[i] /= 2;
                sum += inhabitants[i];
            }
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
//            for (int eachItem : inhabitants) {
//                sum += eachItem;
//            }
//            System.out.println("sum = " + sum);
//        } while (sum > 0);
        }
        System.out.println("---- EXTINCT ----");

    }

}
