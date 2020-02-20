package home_tasks;

import java.util.*;

public class Task8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Write a sentence:");
        String sentence = scan.nextLine();

        sentence = sentence.trim();

//        if (sentence.indexOf(' ') == sentence.lastIndexOf(' ')) {
//            System.out.println("You have entered 2 words.");
//        } else {
//            System.out.println("You have entered more than 2 words.");
//        }
        System.out.println(sentence.indexOf(' ') == sentence.lastIndexOf(' ') ? "You have entered 2 words." : "You have entered more than 2 words.");

    }

}
