package zReplit;

import java.util.*;

public class Task198_MethodsWithArrayList8_CombineAll {

    public static void main(String[] args) {

        ArrayList<String> wordList1 = new ArrayList<>(Arrays.asList("Ashgabat", "Turkmenistan", "Anew"));
        ArrayList<String> wordList2 = new ArrayList<>(Arrays.asList("Toyly", "Jemal", "Kerim", "Dursun"));
        System.out.println(combineAll(wordList1, wordList2));

    }

    public static ArrayList<String> combineAll(ArrayList<String> wordList1, ArrayList<String> wordList2) {

        ArrayList<String> combinedWordLists = new ArrayList<>();
        combinedWordLists.addAll(wordList1);
        combinedWordLists.addAll(wordList2);
        return combinedWordLists;
    }

}
