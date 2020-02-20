package zReplit;

import java.util.*;

public class Task067ReverseIt {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int x = word.length();

        if (x < 5) {
            System.out.println("Too short!");
        } else if (x > 5) {
            System.out.println("Too long!");
        } else {
            while (x > 0) {
                x--;
                System.out.print(word.charAt(x));
            }
        }

    }

}
