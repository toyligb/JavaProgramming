package zReplit;

import java.util.*;

public class Task137ArraysReverseSentence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] wordsArray = sentence.split(" ");

        for (int i = wordsArray.length - 1; i >= 0; i--) {
            System.out.println(wordsArray[i]);
        }

    }

}
