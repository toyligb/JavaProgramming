package zReplit;

import java.util.*;

public class Task069PrintHalfTwice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        System.out.println(word.substring(0,word.length()/2) + word.substring(0, word.length()/2));

    }

}
