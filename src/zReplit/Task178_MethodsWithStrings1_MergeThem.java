package zReplit;

import java.util.*;

public class Task178_MethodsWithStrings1_MergeThem {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word:");
        String word1 = scan.next();

        System.out.println("Enter second word:");
        String word2 = scan.next();

        System.out.println(mergeStrings(word1, word2));

    }

    private static String mergeStrings(String s1, String s2) {

        String result = "";
        int size = (s1.length() > s2.length()) ? s2.length() : s1.length();
        for (int i = 0; i < size; i++) {
            result += s1.charAt(i) + "" + s2.charAt(i);
        }
        result += (s1.length() > s2.length()) ? s1.substring(size) : s2.substring(size);
        return result;
    }

}
