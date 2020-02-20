package day04;

import java.util.Scanner;

public class FahToCelScanner {

    public static void main(String[] args) {

        double cel;
        System.out.print("The temperature in Fahrenheit: ");
        Scanner fahr = new Scanner(System.in);
        double fah = fahr.nextDouble();

        cel = (5.0 / 9) * (fah - 32);

        System.out.println("\n"+fah + " Fahrenheit is " + (int)cel + " Celsius degrees.");

    }

}
