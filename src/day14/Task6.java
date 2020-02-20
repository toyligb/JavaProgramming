package day14;

import java.util.Scanner;

public class Task6 {

    /*
        Task 6 :
        given 3 whole numbers variable num1, num2, num3 with value already set.
        Write a program with below logic
        if multiplication result of num1 and num2 greater than sum of all the numbers
        print excellent result else not the numbers combination I am looking for
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        String out = (num1 * num2) > (num1 + num2 + num3) ? "Excellent" : "Not the numbers combination I am looking for";
        System.out.println("out = " + out);

    }

}
