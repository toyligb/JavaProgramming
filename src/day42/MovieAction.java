package day42;

import java.util.*;

public class MovieAction {

    public static void main(String[] args) {

        Movie m1 = new Movie("Jumanji", 2.31, "Adventure");
        //System.out.println("m1 = " + m1);

        Movie m2 = new Movie("Joker", 2.2, "Drama");
        //System.out.println("m2 = " + m2);

        Movie m3 = new Movie("Dictator", 2.4, "Comedy");
        //System.out.println("m3 = " + m3);

        // I want to get the name of m2 separately so I can do something
        // I can not access field directly, because it is private
        // System.out.println("m2.name = " + m2.name);
        // System.out.println(m2.getName());

        Movie m4 = new Movie("The Guilty", 1.25, "Drama");
        Movie m5 = new Movie("Mission Impossible: Fallout", 2.27, "Action");
        Movie m6 = new Movie("Searching", 1.42, "Mystery");
        Movie m7 = new Movie("A Star is Born", 2.16, "Romance");
        Movie m8 = new Movie("SpiderMan: Into the Spider Verse", 1.57, "Animation");
        Movie m9 = new Movie("Blind spotting", 1.35, "Comedy");
        Movie m10 = new Movie("A Quiet Place", 1.30, "Horror");

        List<Movie> myFavMovies = new ArrayList<>(Arrays.asList(m1, m2, m3, m4, m5, m6, m7, m8, m9, m10));

        System.out.println("===== Less tha 2 hours =====");
        for (Movie each : myFavMovies) {
            if (each.getLength() < 2) {
                System.out.println("Movies less than 2 hours: " + each.getName());
            }
        }

        System.out.println("===== Action movies =====");
        for (Movie each : myFavMovies) {
            if (each.getType().equalsIgnoreCase("Action")) {
                System.out.println("Action movie: " + each.getName());
            }
        }

        System.out.println("===== Long movies =====");
        for (Movie each : myFavMovies) {
            if (each.getLength() > 2) {
                System.out.println("Before adding long " + each);
                each.setType("Long" + each.getType());
                System.out.println("After adding long " + each);
            }
        }

        System.out.println("===== Longest movie name =====");
        String longest = "";
        for (Movie each : myFavMovies) {
            if (each.getLength() > longest.length()) {
                longest = each.getName();
            }
        }
        System.out.println("Longest movie is " + longest);

    }

}
