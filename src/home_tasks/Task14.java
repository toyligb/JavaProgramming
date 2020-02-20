package home_tasks;

import java.util.*;

public class Task14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Write a sentence:");
        String sentence = scan.nextLine();

        String lastWord = sentence.substring(sentence.lastIndexOf(' ')+1);
        System.out.println("lastWord = " + lastWord);
        String withoutLastWord = sentence.substring(0, sentence.lastIndexOf(' '));
        System.out.println("withoutLastWord = " + withoutLastWord);
        if (withoutLastWord.contains(lastWord)) {
            System.out.println("Even if we remove last word, your sentence contains it.");
        } else {
            System.out.println("Your sentence doesn't contain last word anymore.");
        }

    }

}
