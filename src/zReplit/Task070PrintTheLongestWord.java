package zReplit;

import java.util.Scanner;

public class Task070PrintTheLongestWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
//        int x = word1.length();
//        int y = word2.length();
//
//        if (x > y) {
//            System.out.println(word1);
//        } else {
//            System.out.println(word2);
//        }
        String out = word1.length() > word2.length() ? word1 : word2;
        System.out.println(out);

    }

}
