package day10;

import java.util.*;

public class SeasonAction {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("What is the season now: ");
        String season = scan.next();

        switch (season) {
            case "Spring":
                System.out.println("Hike, Easter, Nowruz, Blossom!");
                break;
            case "Summer":
                System.out.println("Swim, Vacation, BBQ, Holiday!");
                break;
            case "Fall":
                System.out.println("Black Friday, Hiking, Harvest, Shopping!");
                break;
            case "Winter":
                System.out.println("Ski, New Year, Snow, My birthday!");
                break;
            default:
                System.out.println("Drink coffee!");
                break;
        }

    }

}
