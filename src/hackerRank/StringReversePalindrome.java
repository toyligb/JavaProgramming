package hackerRank;

import java.util.*;

public class StringReversePalindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.next().toLowerCase();

        String reverseWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord = reverseWord + word.charAt(i);
        }

        if (word.equals(reverseWord)) {
            System.out.println("The word is palindrome!");
        } else {
            System.out.println("The word is NOT palindrome!");
        }

    }

}
