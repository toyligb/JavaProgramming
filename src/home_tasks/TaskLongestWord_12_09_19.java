package home_tasks;

import java.util.*;

public class TaskLongestWord_12_09_19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        * Plain english to find longest word:
        * pick up first word from array
        * find out length of word
        * assign it as the longest word
        * pick up second word, find out length
        * if the length of second word is longer than the first
        * then new longest word is second word.
         */
        System.out.print("How many words do you want to enter? ");
        int n = scan.nextInt();
        String[] words = new String[n];

        System.out.println("Enter words:");
        for (int i = 0; i < words.length; i++) {
            words[i] = scan.next();
        }

        String longest = words[0];
        String shortest = words[0];

        for (String eachWord : words) {
            if (longest.length() < eachWord.length()) {
                longest = eachWord;
            }
            if (shortest.length() > eachWord.length()) {
                shortest = eachWord;
            }
        }
        System.out.println("longest = " + longest);
        System.out.println("shortest = " + shortest);
    }
}
