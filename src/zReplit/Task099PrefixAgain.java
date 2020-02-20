package zReplit;

import java.util.*;

public class Task099PrefixAgain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        String word=str.substring(0,n);
        System.out.println(str.substring(n).contains(word));

        String newStr = str.substring(0, n);
        int count = 0;

        for (int i = 0; i < str.length() - n; i++) {
            if (str.substring(i, i+n).equalsIgnoreCase(newStr)) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println(count + "true");
        } else {
            System.out.println(count + "false");
        }

    }

}
