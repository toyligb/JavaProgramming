package day15;

import java.util.Scanner;

public class NameChecker2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scan.next();

        boolean containsA = name.contains("a");
        boolean containsE = name.contains("e");

        if (containsA || containsE) {
            System.out.println("Your name contains a or e.");
        } else {
            System.out.println("Your name does not contain a or e.");
        }

    }

}