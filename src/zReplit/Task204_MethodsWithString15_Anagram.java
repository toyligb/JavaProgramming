package zReplit;

import java.util.*;

public class Task204_MethodsWithString15_Anagram {

    public static void main(String[] args) {

        System.out.println(isAnagram("listen", "silent"));

    }

    public static boolean isAnagram(String word1, String word2) {

        boolean checkResult = false;

        char[] word1Letters = word1.toUpperCase().toCharArray();
        char[] word2Letters = word2.toUpperCase().toCharArray();

        Arrays.sort(word1Letters);
        Arrays.sort(word2Letters);

        return Arrays.equals(word1Letters, word2Letters);

    }

}
