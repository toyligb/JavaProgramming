package day63;

import java.util.*;

public class FindingCharacterShowedUpAtLeastOnce_v2 {

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

        //Set<Character> chars = new HashSet<>(Arrays.asList('A', 'A', 'A', 'A', 'A'));

        // Instead of going through each and every character
        // I want to turn this String into a String array of each character
        String[] eachCharStrArray = str.split("");
        System.out.println("Arrays.toString(eachCharStrArray) = " + Arrays.toString(eachCharStrArray));

        // then turn it into a List with Arrays.asList
        List<String> charLst = Arrays.asList(eachCharStrArray);

        // eventually create a HashSet object by copying everything inside this list
        Set<String> charSet = new HashSet<>(charLst);
        System.out.println("charSet = " + charSet);

        // THE ONE SHOT WAY OF DOING THIS
        Set<String> charSetShortWay = new HashSet<>(Arrays.asList(str.split("")));
        System.out.println("charSetShortWay = " + charSetShortWay);

    }

}
