package day14;

import java.util.Scanner;

public class Task3 {

    /*
        Task 3 :
        given 3 whole numbers variable num1, num2, num3 with value already set .
        Write a program to find out the largest number and print the result
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("The number " + num1 + " is larger than " + num2 + " & " + num3);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The number " + num2 + " is larger than " + num1 + " & " + num3);
        } else {
            System.out.println("The number " + num3 + " is larger than " + num1 + " & " + num2);
        }

    }

}
