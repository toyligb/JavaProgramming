package day63;

import java.util.*;

public class WordFrequency {

    public static void main(String[] args) {

        String str = "The new link for joining will require you to login to Okta if it ask you to sign in" +
                " please just click on it it will take to Okta singing page once you sign in with Okta" +
                " then you will be able to join right away PLEASE DO NOT TRY TO REGISTER THE LINK IS " +
                "ALREADY IN THE EMAIL Click to join";


        String[] allWords = str.split(" ");
        System.out.println("allWords.length = " + allWords.length);

        // we want to solve this using the Map
        // because Map only can have unique key, so we can use it for unique words
        // first create Map object HashMap implementation
        Map<String, Integer> wordFreqMap = new HashMap<>();
        // Loop through the word array
        for (String currentWord : allWords) {
            if (!wordFreqMap.containsKey(currentWord)) {
                wordFreqMap.put(currentWord, 1);
            } else {
                wordFreqMap.replace(currentWord, wordFreqMap.get(currentWord) + 1);
            }
        }

        System.out.println("wordFreqMap = " + wordFreqMap);
        // Check if we already have the word in the key or not
        // If we do not have the key, it means we are entering for the first time
        // so the count will be 1, add using put method
        // else it means we already have it in the key
        // so we get existing count using that key
        // and replace the old count value with new count value by incrementing by 1

    }

}
