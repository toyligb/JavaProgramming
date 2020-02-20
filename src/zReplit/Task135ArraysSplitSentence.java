package zReplit;

import java.util.*;

public class Task135ArraysSplitSentence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] words = sentence.split(" ");
//        for (int i = 0; i < words.length; i++) {
//            System.out.println(words[i]);
//        }
        for (String each : words) {
            System.out.println(each);
        }
    }

}
