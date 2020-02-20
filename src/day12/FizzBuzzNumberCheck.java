package day12;

import java.util.*;

public class FizzBuzzNumberCheck {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz number!");
        } else if (num % 3 == 0) {
            System.out.println("Buzz number!");
        } else if (num % 5 == 0) {
            System.out.println("Fizz number!");
        } else {
            System.out.println("NOT MY NUMBER!");
        }

    }

}
