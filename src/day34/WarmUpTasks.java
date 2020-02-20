package day34;

import java.util.*;

public class WarmUpTasks {

    public static int build3DigitNumber(int a, int b, int c) {

        int result = 0;

        if (a < 0 || a > 9) {
            a = 0;
        }

        if (b < 0 || b > 9) {
            b = 0;
        }

        if (c < 0 || c > 9) {
            c = 0;
        }

        result = a * 100 + b * 10 + c;

        return result;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st digit:");
        int digit1 = scan.nextInt();
        System.out.println("Enter 2nd digit:");
        int digit2 = scan.nextInt();
        System.out.println("Enter 3rd digit:");
        int digit3 = scan.nextInt();

        System.out.println(build3DigitNumber(digit1, digit2, digit3));

    }

}
