package day63;

import java.util.*;

public class MapTest {

    public static void main(String[] args) {

        String str = "The new link for joining will require you to login to okta, if it ask you to sign in" +
                ", please just click on it, it will take to Okta singing page, once you sign in with Okta" +
                " then you will be able to join right away.  PLEASE DO NOT TRY TO REGISTER, THE LINK IS " +
                "ALREADY IN THE EMAIL. Click to join";

        int count;
        Map<Character,Integer> charCountPair = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    ++count;
                }
                charCountPair.put(str.charAt(i),count);
            }
        }

        charCountPair.forEach( (k,v) -> System.out.println(k + "=" + v));

    }

}
