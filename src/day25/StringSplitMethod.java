package day25;

import java.util.*;

public class StringSplitMethod {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String sentence = scan.nextLine();

        String[] allWords = sentence.split(" ");

        System.out.println("allWords = " + Arrays.toString(allWords));

        String longestWord = "";
        for (String eachWord : allWords) {
            System.out.println("eachWord = " + eachWord);
            if (eachWord.length() > longestWord.length()) {
                longestWord = eachWord;
            }
        }
        System.out.println("longestWord = " + longestWord);
    }
}
