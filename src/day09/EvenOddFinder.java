package day09;

import java.util.Scanner;

public class EvenOddFinder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int myNumber = scan.nextInt();

        System.out.println(myNumber%2);

        int remainder = myNumber%2;

        if( remainder == 0 ) {
            System.out.println("Even number!");
        } else {
            System.out.println("Odd number!");
        }

    }

}
