package day10;

import java.util.*;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char operator;
        System.out.print("Enter the operator: ");
        operator = scan.next().charAt(0);

        switch (operator) {
            case '+' :
                System.out.println("You are about to add numbers.");
                break;
            case '-' :
                System.out.println("You are about to subtract numbers.");
                break;
            case '*' :
                System.out.println("You are about to multiply numbers.");
                break;
            case '/' :
                System.out.println("You are about to divide numbers.");
                break;
            default:
                System.out.println("Invalid operator.");
                break;
        }

    }

}
