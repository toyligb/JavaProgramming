package day31;

import java.util.Scanner;

public class CalculatorV2 {

    public static void mathCalculations(String operator, int x, int y) {

        switch (operator) {
            case "+":
                System.out.println(x + operator + y + " = " + (x + y));
                break;
            case "-":
                System.out.println(x + operator + y + " = " + (x - y));
                break;
            case "*":
                System.out.println(x + operator + y + " = " + (x * y));
                break;
            case "/":
                System.out.println(x + operator + y + " = " + (x / y));
                break;
            case "%":
                System.out.println(x + operator + y + " = " + (x % y));
                break;
            default:
                System.out.println("Wrong operator.");

        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter operator:");
        String operator = scan.next();
        System.out.println("Enter number 1:");
        int x = scan.nextInt();
        System.out.println("Enter number 2:");
        int y = scan.nextInt();

        mathCalculations(operator, x, y);

    }

}
