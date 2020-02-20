package home_tasks;

import java.util.*;

public class Task13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = scan.nextLine();

        char firstLetter = text.charAt(0);
        char lastLetter = text.charAt(text.length() - 1);
        String middleText = text.substring(1, text.length() - 1);
        String newText = lastLetter + middleText + firstLetter;

        if (newText.equalsIgnoreCase(text)) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not palindrome.");
        }

    }

}
