package day12;

import java.util.Scanner;

public class WakeUpTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //String weatherOnCity = new String("Sunny");
        System.out.println("How is the weather outside:");
        String weatherOnCity = scan.next();

        if (weatherOnCity.equals("Sunny")) {
            System.out.println("Code in Sunny weather.");
        } else if (weatherOnCity.equals("Rainy")) {
            System.out.println("Code in Rainy weather.");
        } else if (weatherOnCity.equals("Cloudy")) {
            System.out.println("Code in Cloudy weather.");
        } else if (weatherOnCity.equals("Snowy")) {
            System.out.println("Code in Snowy weather.");
        } else {
            System.out.println("Keep Coding Always!!!");
        }

    }

}