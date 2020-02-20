package day20;

import java.util.*;

public class WorkingWithMoreThanOneCharInString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // given a String with even number character count
        // print 2 characters in one line
        // for example : Gokyuzum
        /*
            Go
            ky
            uz
            um
         */

        System.out.println("Write your word: ");
        String word = scan.nextLine();

        for (int i = 0; i < word.length() - 2; i++) {
            System.out.println(word.substring(i, i + 3));
        }

    }

}
