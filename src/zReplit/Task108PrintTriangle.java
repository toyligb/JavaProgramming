package zReplit;

import java.util.*;

public class Task108PrintTriangle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i = 1;
        int j = 1;
        int n = scan.nextInt();

        for (; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
