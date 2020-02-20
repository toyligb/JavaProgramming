package zReplit;

import java.util.*;

public class Task170_Arrays_ZombieAttack2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = scan.nextInt();
        }

        int[] zeroArr = {0, 0, 0, 0, 0, 0, 0, 0};
        int[] tempArr = new int[8];
        int day = 0;
        System.out.println("Day " + day + " " + Arrays.toString(inhabitants));

        do {

            for (int i = 0; i <= inhabitants.length - 1; i++) {
                tempArr[i] = inhabitants[i];
            }

            for (int i = 0; i <= inhabitants.length - 1; i++) {


                if (tempArr[i] == 0) {
                    if (i != 0 && i != 7) {
                        inhabitants[i + 1] = tempArr[i + 1] / 2;
                        inhabitants[i - 1] = tempArr[i - 1] / 2;
                    }
                    if (i == 0) {
                        inhabitants[i + 1] = tempArr[i + 1] / 2;
                    }
                    if (i == 7) {
                        inhabitants[i - 1] = tempArr[i - 1] / 2;
                    }
                }

            }

            day++;
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
        } while (!Arrays.equals(zeroArr, inhabitants));
        System.out.println("---- EXTINCT ----");

    }

}
