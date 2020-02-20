package hackerRank;

import java.util.Scanner;

public class SayiyiTerstenYazdirma {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scan.nextInt();
        int num = x;
                                            // 123
        long newNum = 0;

        while (x != 0) {
            newNum = newNum * 10 + x % 10; // 0 * 10 + 123 % 10 = 3 => 3 * 10 + 12 % 10 = 32
                                            // => 32 * 10 + 1 % 10 = 321
            x /= 10;
        }
        System.out.println("newNum = " + newNum);

        System.out.println(newNum == num);

    }

}
