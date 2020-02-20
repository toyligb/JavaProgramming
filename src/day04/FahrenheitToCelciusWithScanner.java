package day04;

import java.util.Scanner;

public class FahrenheitToCelciusWithScanner {

    public static void main(String[] args) {

        System.out.print("What is temperature in Fahrenheit: ");
        Scanner f = new Scanner(System.in);
        double fahrenheit = f.nextDouble();
        double c;

        c = (5.0 / 9) * (fahrenheit - 32);

        System.out.println("\nThe " + fahrenheit + "F is " + (int)c + "C Celsius.");

      }

}
