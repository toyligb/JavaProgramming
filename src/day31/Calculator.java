package day31;

import java.util.Scanner;

public class Calculator {

    public static void mathOperators(int num1, int num2) {

        System.out.println("Addition of " + num1 + " & " + num2 + " = " + (num1 + num2));
        System.out.println("Subtraction of " + num1 + " & " + num2 + " = " + (num1 - num2));
        System.out.println("Multiplication of " + num1 + " & " + num2 + " = " + (num1 * num2));
        System.out.println("Division of " + num1 + " & " + num2 + " = " + (num1 / num2));

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = scan.nextInt();
        System.out.println("Enter number 2:");
        int num2 = scan.nextInt();

        mathOperators(num1, num2);

    }

}
