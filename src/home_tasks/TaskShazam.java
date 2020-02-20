package home_tasks;

import java.util.*;

public class TaskShazam {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String keyword;
        do {
            System.out.println("Enter keyword to turn into super hero:");
            keyword = scan.next();
        } while (!keyword.equalsIgnoreCase("Shazam"));

        System.out.println("YOU ARE NOW SUPER HERO.");

    }

}
