package zReplit;

import java.util.*;

public class Task209_MethodsWithString12_ExtractNumberFromString {

    public static void main(String[] args) {

        System.out.println(extractNum("aa2aa3"));

    }

    public static String extractNum(String s) {

        char[] ch = s.toCharArray();
        String result = "";
        for (char each : ch) {
            if (Character.isDigit(each)) {
                result += each;
            }
        }
        return result;
    }

}
