package home_tasks;

import java.util.*;

public class Task16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word 1:");
        String word1 = scan.next();
        System.out.println("Enter word 2:");
        String word2 = scan.next();

        if (word1.contains(word2)) {
            System.out.println(word2 + " is at index " + word1.indexOf(word2) + " in " + word1);
            System.out.println(word1 + ", " + word2 + " --->> " + word1.replace(word2, "ZZZ"));
        } else {
            System.out.println(word1 + " doesn't contain " + word2);
        }

    }

}
