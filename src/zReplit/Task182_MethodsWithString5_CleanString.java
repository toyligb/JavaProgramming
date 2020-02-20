package zReplit;

import java.util.*;

public class Task182_MethodsWithString5_CleanString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a text:");
        String txt = scan.nextLine();

        System.out.println("Enter a word:");
        String word = scan.next();

        System.out.println(clean(txt, word));

    }

    private static String clean(String txt, String word) {

        return txt.replace(word, "");

    }

}
