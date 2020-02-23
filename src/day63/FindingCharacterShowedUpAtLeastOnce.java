package day63;

import java.util.*;

public class FindingCharacterShowedUpAtLeastOnce {

    public static void main(String[] args) {

        String str = "The new link for joining class will require you to login to Okta, " +
                "if it asks you to sign in, please just click on it, it will take you to " +
                "Okta signing page, once you signing with Okta then you will be able to join " +
                "right away. PLEASE DO NOT TRY TO REGISTER, THE LINK IS ALREADY IN THE EMAIL. " +
                "Click to join.";

        // How many unique character showed up in above sentence

        // ONE WAY TO DO IT
        // first find a data structure that automatically remove duplicate :
        //          create a HashSet object with type Character
        // iterate over each character in above String
        // then add it to the HashSet so it can remove the duplicate for us

        Set<Character> charSet = new TreeSet<>();
        for (int i = 0; i < str.length(); i++) {
            charSet.add(str.charAt(i));
        }
        System.out.println("How many characters in total = " + str.length());
        System.out.println("How many unique character = " + charSet.size());
        System.out.println("charSet = " + charSet);

        for (Character eachChar : charSet) {
            System.out.println("each unique char = " + eachChar);
        }

    }

}
