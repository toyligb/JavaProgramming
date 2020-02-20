package day05;

import java.util.Scanner;

public class PracticeScanner {

    public static void main(String[] args) {

        System.out.println("This program converts Fahrenheit to Celsius & Converts Hours to Seconds");

        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter the Temperature in Fahrenheit: ");
        double fahrenheit = scan.nextDouble();
        double celsius = ( 5.0 / 9 ) * ( fahrenheit - 32 );

        System.out.print("How many Hours do you want to convert to seconds: ");
        int hours = scan.nextInt();
        int seconds = hours * 3600;

        System.out.println("\n" + fahrenheit + " Fahrenheit is " + (int)celsius + " Celsius degrees!");
        System.out.println(hours + " hours is equal to " + seconds + " seconds.");

    }

}
