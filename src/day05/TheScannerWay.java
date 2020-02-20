package day05;

import java.util.Scanner;

public class TheScannerWay {

    public static void main(String[] args) {

        System.out.print("Enter your name: ");
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();

        System.out.print("Enter your birth year: ");
        int age = 2019 - scan.nextInt();

        System.out.print("Enter your height: ");
        double pHeight = scan.nextDouble();

        System.out.print("Try boolean: ");
        boolean tryBool = scan.nextBoolean();

        System.out.println("\nYour name is " + firstName);
        System.out.println("You are " + age + " years old.");
        System.out.println("Your height is " + pHeight + "\".");
        System.out.println("Boolean is " + tryBool + ".");

    }

}
