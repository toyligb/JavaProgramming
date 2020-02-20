package day11;

import java.util.*;

public class PasswordReEntering {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your password:");
        String word1 = scan.nextLine();

        System.out.println("Confirm your password:");
        String word2 = scan.nextLine();

        if (word1.equals(word2)) {
            System.out.println("Password accepted!");
            System.out.println("Enter a password hint:");
            String hint = scan.nextLine();
        } else {
            System.out.println("Try again!");
        }

    }

}
