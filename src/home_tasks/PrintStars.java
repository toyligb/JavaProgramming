package home_tasks;

import java.util.*;

public class PrintStars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of stars: ");
        int stars = scan.nextInt();

        for (int i = 1; i <= stars; i++) {
            for (int j = stars - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
