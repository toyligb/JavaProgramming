package day35;

import java.util.*;

public class TomatoTask {

    public static void main(String[] args) {

        String sentence = "I bought 3 tomato and the price was 3.14 each";
        String[] words = sentence.split(" ");

        int count = Integer.parseInt(words[2]); // parse - return primitive
        // int count = Integer.valueOf(words[2]); // valueOf - return object
        double price = Double.parseDouble(words[words.length - 2]);

        double result = count * price;
        System.out.println("result = " + result);

    }

}
