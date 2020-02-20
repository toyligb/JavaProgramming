package day14;

import java.util.Scanner;

public class Task2 {

    /*
    Task 2 :
 given 3 whole numbers variable  num1, num2 , num3 with value already set .
 and another int variable called sumOfSpecialNumber with initial value 0
 Write a program to print If the sum of the numbers are more than 100 ! */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int sumOfSpecialNumber = 0;

        sumOfSpecialNumber = num1 + num2 + num3;

        String out = sumOfSpecialNumber > 100 ? "The sum of the numbers are greater than 100" : "The sum of the numbers are less than 100";
        System.out.println(out);

    }

}
