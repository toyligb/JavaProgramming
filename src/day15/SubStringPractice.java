package day15;

import java.util.*;

public class SubStringPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sentence:");

        String sentence = scan.nextLine();

        String wordFromSentence = sentence.substring(5);
        System.out.println("wordFromSentence = " + wordFromSentence);

        wordFromSentence = sentence.substring(5,10);
        System.out.println("wordFromSentence = " + wordFromSentence);

        wordFromSentence = sentence.substring(7,13);
        System.out.println("wordFromSentence = " + wordFromSentence);

        // Get the second word!
        // Second word starts where the 1st space and ends where the 2nd space

        int startingPoint = sentence.indexOf(" ") + 1;
        int endingPoint = sentence.length() - 1;

        System.out.println("Second word till last: " + sentence.substring(startingPoint,endingPoint));
        System.out.println(sentence.substring(startingPoint));

    }

}
