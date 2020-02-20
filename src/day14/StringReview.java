package day14;

import java.util.*;

public class StringReview {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Write a sentence:");
        String str = scan.nextLine();

        System.out.println( str.contains("Toyly"));
        boolean gotToyly = str.contains("Toyly");

        System.out.println("gotToyly = " + gotToyly);

    }

}
