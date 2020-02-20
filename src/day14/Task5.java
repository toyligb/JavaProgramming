package day14;

import java.util.Scanner;

public class Task5 {

    /*
        Task 5 :
        given 3 whole numbers variable num1, num2, num3 with value already set .
        Write a program with below logic add 100 to all the numbers less than 20 ;
        print out the value of each variable to test your code.
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int num1Test = num1 < 20 ? num1 += 100 : num1 ;
        int num2Test = num2 < 20 ? num2 += 100 : num2 ;
        int num3Test = num3 < 20 ? num3 += 100 : num3 ;

        System.out.println(num1Test + " / " + num2Test + " / " + num3Test);

    }

}
