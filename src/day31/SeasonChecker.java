package day31;

import java.util.Scanner;

public class SeasonChecker {

    public static void decideSeasonAction(String season) {

        switch (season) {
            case "Spring":
                System.out.println("Hiking");
                break;
            case "Summer":
                System.out.println("Swim");
                break;
            case "Fall":
                System.out.println("Pumpkin");
                break;
            case "Winter":
                System.out.println("Snowboard");
                break;
            default:
                System.out.println("Not correct");
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a season:");
        String season = scan.next();

        decideSeasonAction(season);

    }

}
