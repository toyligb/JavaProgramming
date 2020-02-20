package zReplit;

import java.util.*;

public class Task096RepeatSeparator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();

//        String output = word;
//
//        for (int i = 1; i < count; i++) {
//            output += separator + word;
//        }
//
//        System.out.println(output);
        String out = "";
        for (int j = 1; j <= count; j++) {
            out = out + word + separator;
        }
        System.out.println(out.substring(0, out.length() - separator.length()));
    }

}
