package day11;

import java.util.*;

public class LogicalOperators {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();

        System.out.println("Result for &&: " + (num < 10 && num > 100));
        System.out.println("Result for ||: " + (num < 10 || num > 100));
        System.out.println(num > 50 && num != 52 || num == 57);
        System.out.println(5 > 9 && 9 / 0 == 3);
        System.out.println(10 > 5 || 9 / 0 == 3); // 1nji OR true chikani ucin yzyna seretmeyar
        //System.out.println( 10 > 5 | 9/0 == 3); // bir OR ulanylany uchin yalnish beryar
        System.out.println(true);
        System.out.println(false);
        System.out.println(!true);
        System.out.println(!false);

    }

}
