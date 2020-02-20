package day05;

import java.util.Calendar;
import java.util.Scanner;

public class CelsiusToFahrenheitScanner {

    public static void main(String[] args) {

        System.out.print("Temperature in Celsius: ");
        Scanner celsius = new Scanner(System.in);
        double cels = celsius.nextDouble();

        double fahr = 9 * cels / 5 + 32;

        int year = Calendar.getInstance().get(Calendar.YEAR);

        System.out.println(year);

        System.out.println(cels + " Celsius is " + fahr + " Fahrenheit degrees!");

    }

}
