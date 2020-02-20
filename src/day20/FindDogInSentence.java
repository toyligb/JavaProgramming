package day20;

import java.util.*;

public class FindDogInSentence {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int countDogs = 0;
        String sentence = scan.nextLine();

        for (int i = 0; i < sentence.length()-2; i++) {
            if (sentence.substring(i, i+3).equalsIgnoreCase("dog")) {
                countDogs++;
            }
        }

        System.out.println("countDogs = " + countDogs);

    }

}
