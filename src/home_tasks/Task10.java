package home_tasks;

import java.util.*;

public class Task10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence with 3 words:");
        String sentence = scan.nextLine();

        System.out.println("The second word is:" + sentence.substring(sentence.indexOf(' ')+1, sentence.lastIndexOf(' ')));

    }

}
