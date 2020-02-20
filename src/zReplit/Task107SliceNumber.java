package zReplit;

import java.util.*;

public class Task107SliceNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, digit1, digit2, digit3, digit4, digit5;

        System.out.println("Enter your number:");
        num = scan.nextInt();
        String number = String.valueOf(num);

        for (int i = 0; i < number.length(); i++) {
            System.out.println(number.charAt(i));
        }

    }
}
