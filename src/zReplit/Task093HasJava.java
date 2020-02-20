package zReplit;

import java.util.*;

public class Task093HasJava {
    public static void main(String[] args) {

        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.length() >= 4) {
            System.out.println(word.substring(0, 5).contains("java"));
        } else {
            System.out.println(exists);
        }
    }
}
