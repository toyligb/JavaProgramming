package zReplit;

import java.util.*;

public class Task120ArraysFindMaxLengthString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = scan.nextLine();
        }

        String longestWord = words[0];
        for (String tempWord:words) {
            if (longestWord.length() < tempWord.length()) {
                longestWord = tempWord;
            }
        }
        System.out.println(longestWord);
    }
}
