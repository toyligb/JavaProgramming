package zReplit;

import java.util.*;

public class Task064MiddleOne {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int x = word.length();

        if (x == 1) {
            System.out.println(word + word + word);
        } else if (x == 2) {
            System.out.println(word + word);
        } else if (x >= 3 && x%2 == 1) {
            System.out.println(word.charAt(x/2));
        } else if (x >= 4 && x%2 == 0) {
            System.out.println(word.substring(x/2-1, x/2+1));
        }

    }

}
