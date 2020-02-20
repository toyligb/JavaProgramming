package day11;

import java.util.*;

public class StringEqualityPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.nextLine();
        String word2 = scan.nextLine();

        System.out.println(word1.equals(word2));

        String myStr = "Java";
        System.out.println(myStr.equals("Java"));

        String yourStr = new String("Java");
        System.out.println("is my string same as your string?");
        System.out.println(myStr.equals(yourStr));


    }

}
