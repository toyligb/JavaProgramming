package day19;

import java.util.*;

public class StartingEndingChars {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter starting and ending chars:");
        String chars = scan.nextLine().toUpperCase();

        char first = chars.charAt(0);
        char last = chars.charAt(chars.length()-1);

        if (first < last) {
            for (int i = first; i <= last; i++) {
                System.out.print((char)i + ", ");
            }
        } else {
            for (int i = first; i >= last; i--) {
                System.out.print((char)i + ", ");
            }
        }

    }

}
