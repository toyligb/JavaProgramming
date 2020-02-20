package day19;

import java.util.*;

public class AddingNumbers2Range {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int sum = 0;

        for (int i = num1; i <= num2; i++) {
            sum += i;
        }

        System.out.println("The sum of the numbers between "
                          + num1 + " & " + num2 + " range is = " + sum);

    }

}
