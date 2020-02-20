package zReplit;

import java.util.*;

public class Task200_MethodsWithString13_FindErrorString {

    public static void main(String[] args) {

        System.out.println(isError("foo bar"));
        System.out.println(isError("error foo bar"));
        System.out.println(isError("three four error"));

    }

    public static boolean isError(String line) {

        return line.startsWith("error");

    }

}
