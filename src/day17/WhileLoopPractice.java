package day17;

import java.util.*;

public class WhileLoopPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive number:");
        int x = scan.nextInt();
        int i = 0;

        while (i <= x) {
            System.out.print(i + " / ");
            i++;
        }

        System.out.println();
        while (x >= 0) {
            System.out.print(x + " / ");
            x--;
        }

    }

}
