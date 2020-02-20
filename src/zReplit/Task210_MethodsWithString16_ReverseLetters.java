package zReplit;

import java.util.*;

class Utils {
    public static String reverseLetters(String word) {
        String letters = "";
        String exp = "";

        for (int i = word.length()-1; i >= 0; i--) {
            if (Character.isLetter(word.charAt(i))) {
                letters += word.charAt(i);
            }
        }

        int k = 0;
        for (int j = 0; j < word.length(); j++) {
            if (!Character.isLetter(word.charAt(j))) {
                exp += word.charAt(j);
            } else {
                exp += letters.charAt(k);
                k++;
            }
        }

        return exp;
    }
}

public class Task210_MethodsWithString16_ReverseLetters {

    public static void main(String[] args) {

        String result = Utils.reverseLetters("..zxcv..d");
        System.out.println(result.equals("..dvcx..z")); //true

        String result2 = Utils.reverseLetters("---abmkl.o-");
        System.out.println(result2.equals("---olkmb.a-")); //true

        String result3 = Utils.reverseLetters("---abmkl.o-");
        System.out.println(result3.equals("-o.lkmba---")); //false

    }

}
