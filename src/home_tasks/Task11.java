package home_tasks;

import java.util.*;

public class Task11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scan.nextLine();

        String firstWord = sentence.substring(0, sentence.indexOf(' '));
        String lastWord = sentence.substring(sentence.lastIndexOf(' '));

        System.out.println("firstWord = " + firstWord);
        System.out.println("lastWord = " + lastWord);

    }

}
