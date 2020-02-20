package day12;

import java.util.Scanner;

public class SeasonChecker {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String season;

        System.out.print("Enter your season: ");
        season = scan.next();

        if (season.equalsIgnoreCase("Spring")) {
            System.out.println("On Spring --->> Hiking, Novruz, Allergy, Cool weather.");
        } else if (season.equalsIgnoreCase("Summer")) {
            System.out.println("On Summer --->> Pool, Swimming, Beach, Vacation.");
        } else if (season.equalsIgnoreCase("Fall")) {
            System.out.println("On Fall --->> Halloween, Barbecue, Riding bike, Code.");
        } else if (season.equalsIgnoreCase("Winter")) {
            System.out.println("On Winter --->> CODE!!! Ski, Sledding, Snowman");
        } else {
            System.out.println("CODE ANYWAY!");
        }

    }

}
