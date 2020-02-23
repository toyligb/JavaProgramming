package day63;

import java.util.*;

public class WordUtil {

    public static void main(String[] args) {

        String str = "Turkmenistan Java Ashgabat Turkmenistan Toyly Jemal Kerim Dursun Ashgabat Ashgabat";

        System.out.println("getFrequencyMap(str) = " + getFrequencyMap(str));

    }

    public static Map<String, Integer> getFrequencyMap(String str) {
        Map<String, Integer> wordFreqMap = new HashMap<>();

        for (String word : str.split(" ")) {
            if (!wordFreqMap.containsKey(word)) {
                wordFreqMap.put(word, 1);
            } else {
                wordFreqMap.replace(word, wordFreqMap.get(word) + 1);
            }
        }
        return wordFreqMap;
    }

}
