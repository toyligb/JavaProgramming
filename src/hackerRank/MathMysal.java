package hackerRank;

import java.util.*;

public class MathMysal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            int sum = a + b;
            for (int j = 1; j <= n; j++) {
                System.out.print(sum + " ");
                sum += ((Math.pow(2, j)) * b);
            }
            System.out.println();
        }
//        int sum = a + b;
//        for (int j = 1; j <= n; j++) {
//            System.out.print(sum + " ");
//            sum += ((Math.pow(2, j))*b);
//        }
//        System.out.println();
    }
}
