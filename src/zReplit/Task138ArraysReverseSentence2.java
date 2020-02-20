package zReplit;

import java.util.*;

public class Task138ArraysReverseSentence2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String sentence = input.nextLine();

        String reversed = "";

        String[] wordsArray = sentence.split(" ");
        for (int i = wordsArray.length - 1; i >= 0; i--) {
            reversed += wordsArray[i] + " ";
        }

        System.out.println(reversed.trim());
    }

}
