package day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class WordFrequencyFromTheFile {

    public static void main(String[] args) {

        try {
            List<String> allLines = Files.readAllLines(Paths.get("src/day63/tekst.txt"));
            System.out.println("allLines = " + allLines);

            String allLinesAsString = allLines.toString();
            Map<String, Integer> map = WordUtil.getFrequencyMap(allLinesAsString);
            System.out.println("map = " + map);

        } catch (IOException e) {
            System.out.println("ERROR!!!!!!");
        }

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
