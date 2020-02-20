package home_tasks;

import java.util.*;

public class Task12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String textToSwamp = scan.nextLine();

        char firstLetter = textToSwamp.charAt(0);
        char lastLetter = textToSwamp.charAt(textToSwamp.length()-1);
        String middleText = textToSwamp.substring(1, textToSwamp.length()-1);
        String newText = lastLetter + middleText + firstLetter;
        System.out.println("newText = " + newText);

    }

}
