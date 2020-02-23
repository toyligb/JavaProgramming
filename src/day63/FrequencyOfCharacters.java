package day63;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "The new link for joining will require you to login to okta, if it ask you to sign in" +
                ", please just click on it, it will take to Okta singing page, once you sign in with Okta" +
                " then you will be able to join right away.  PLEASE DO NOT TRY TO REGISTER, THE LINK IS " +
                "ALREADY IN THE EMAIL. Click to join";

        // Get the frequency and store into map  <Character, Integer>
        Map<Character, Integer> charFreq = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // if we do not have the key yet, it means we are entering for the first time
            // the count will be 1
            if (!charFreq.containsKey(currentChar)) {
                System.out.println("Enter for the first time: " + currentChar);
                charFreq.put(str.charAt(i), 1);
            } else {
                // if we come to this point it means it has already showed up
                // so we update the count with 1 extra than existing count
                charFreq.replace(currentChar, charFreq.get(currentChar) + 1);
            }
        }

        System.out.println("charFreq = " + charFreq);

    }

}
