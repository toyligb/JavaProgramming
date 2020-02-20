package zReplit;

import java.util.*;

public class Task184_MethodsWithString7_At3rdChar {

    public static void main(String[] args) {

        System.out.println(at3("longword", "foo"));

    }

    private static String at3(String word1, String word2) {

        return word1.substring(0, 3) + word2 + word1.substring(3);
    }

}
