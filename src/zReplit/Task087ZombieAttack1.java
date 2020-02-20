package zReplit;

import java.util.*;

public class Task087ZombieAttack1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        for (int day = 0; inhabitants > 0; day++) {
            System.out.println("Day " + day + " " + "[" + inhabitants + "]");
            inhabitants = inhabitants / 2;
        }
        System.out.println("---- EXTINCT ----");
//        while (inhabitants > 0) {
//            int day = 0;
//            System.out.println("Day " + day + " " + "[" + inhabitants + "]");
//            inhabitants = inhabitants / 2;
//            day++;
//        }
//
//        System.out.println("---- EXTINCT ----");

    }

}
