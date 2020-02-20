package zReplit;

import java.util.*;

public class Task066MergeThem {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        int x = word1.length();
        int y = word2.length();
        int count = 0;

        if (x == y) {
            while (count < x) {
                System.out.print(word1.charAt(count) + "" + word2.charAt(count));
                count++;
            }

        } else {
            System.out.println("cannot merge");
        }

    }

}
