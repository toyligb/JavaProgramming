package Udacity;

import java.util.*;

public class PrimeNumberOrNot {

    // Prime number: Dine ozune we 1-e bolunyan san. 0 we 1-den bashga

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scan.nextInt();
        int count = 0;

        if (n == 1 || n == 0) {
            System.out.println("Not a prime number.");
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("A prime number.");
            } else {
                System.out.println("Not a prime number.");
            }
        }

    }

}
