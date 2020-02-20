package day14;

import java.util.*;

public class Task1 {

    /*
    Task 1 :
 given 3 whole numbers variable num1, num2 , num3 with value already set .
 If the sum of the numbers are more than 100 print you have won
 if not print sum of 3 numbers are not more than 100 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        String out = num1 + num2 + num3 > 100 ? "You have won!" : "The sum of the numbers are less than 100";
        System.out.println(out);

    }

}
