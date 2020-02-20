package day14;

import java.util.Scanner;

public class Task4 {

    /*
        Task 4 :
        given 3 whole numbers variable num1, num2 , num3 with value already set .
        Write a program with below logic
        it should print true if all the individual numbers are more than 100
        if not print not all numbers are more than 100
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        String out = num1 > 100 && num2 > 100 && num3 > 100 ? "TRUE" : "Not all numbers are more than 100.";
        System.out.println("out = " + out);

    }

}
