package office_hour;

import java.util.*;

public class Practice_11_26 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the season now:");
        String season = scan.next();

        if (season.equalsIgnoreCase("spring") || season.equalsIgnoreCase("summer")) {
            System.out.println("It is " + season + ", bear is active.");
        } else if (season.equalsIgnoreCase("fall")) {
            System.out.println("It is " + season + ", bear prepare for winter.");
        } else if (season.equalsIgnoreCase("winter")) {
            System.out.println("It is " + season + ", bear is sleeping.");
        } else {
            System.out.println("We don't have " + season + " season.");
        }

    }

}
