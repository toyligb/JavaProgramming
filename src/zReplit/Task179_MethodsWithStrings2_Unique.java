package zReplit;

import java.util.*;

public class Task179_MethodsWithStrings2_Unique {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();

        System.out.println(uniqueChars(word));

    }

    private static String uniqueChars(String word) {

        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if (!result.contains(word.charAt(i) + "")) {
                result += word.charAt(i);
            }
        }
        return result;
    }

}
