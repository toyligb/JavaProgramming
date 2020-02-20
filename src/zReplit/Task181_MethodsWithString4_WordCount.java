package zReplit;

import java.util.*;

public class Task181_MethodsWithString4_WordCount {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = scan.nextLine();

        System.out.println(wordCount(str));

    }

    private static int wordCount(String str) {

//        int result = 0;
//        String[] word = str.split(" ");
//        result = word.length;
        return str.split(" ").length;
    }

}
