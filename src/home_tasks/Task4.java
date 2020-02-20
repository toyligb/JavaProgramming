package home_tasks;

import java.util.*;

public class Task4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: (Length at least 3 letters)");
        String word = scan.next();

        System.out.println("First letter: " + word.charAt(0));
        System.out.println("Last letter: " + word.charAt(word.length() - 1));
        System.out.println("Middle letter: " + word.charAt((word.length() - 1) / 2));

    }

}
