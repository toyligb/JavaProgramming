package zReplit;

import java.util.*;

public class Task162_Methods17_FibonacciNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = scan.nextInt();
        fib(num);

    }

    private static void fib(int x) {

        int num1 = 0, num2 = 1;
        int sum = 0;
        for (int i = 2; i <= x; i++) {
            if (x == 0) {
                sum = num1;
                break;
            } else {
                sum = num1 + num2;
                num1 = num2;
                num2 = sum;
            }
        }
        System.out.println("in sonky sum = " + sum);
    }

}
