package home_tasks;

import java.util.*;

public class DividingWithoutUsingOperator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1 = scan.nextInt();
        System.out.println("Enter 2nd number:");
        int num2 = scan.nextInt();

        int count = 0;
        int firstNum = num1;

        for (int i = num1; i >= num2; i -= num2) {
            count++;
        }
        System.out.println(firstNum + " divided by " + num2 + " = " + count);
    }

}
