package day17;

// if a number can be divided by both 3 and 5 ====>>>> FizzBuzz number
// if a number can be divided by 5 ====>>>> Fizz number
// if a number can be divided by 3 ====>>>> Buzz number

import java.util.*;

public class FizzBuzzTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = scan.nextInt();
        int x = 1;
        String fizzBuzz = "", fizz = "", buzz = "", notFizzBuzz = "";

        while (x <= number) {
            if (x % 5 == 0 && x % 3 == 0) {
                fizzBuzz += x + ", ";
            } else if (x % 5 == 0) {
                fizz += x + ", ";
            } else if (x % 3 == 0) {
                buzz += x + ", ";
            } else {
                notFizzBuzz += x + ", ";
            }
            ++x;
        }

        System.out.println("Fizz Buzz numbers till your number: " + fizzBuzz);
        System.out.println("Fizz numbers till your number: " + fizz);
        System.out.println("Buzz numbers till your number: " + buzz);
        System.out.println("Not Fizz nor Buzz numbers: " + notFizzBuzz);

    }

}
