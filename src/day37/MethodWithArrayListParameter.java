package day37;

import java.util.*;

public class MethodWithArrayListParameter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        names.add("Toyly");
        names.add("Muhammed");
        names.add("Cybertek");
        names.add("Muradil");

        printAList(names);

        byte myByte = 17;
        printByte(myByte);

        int myInt = 100;
        printByte((byte) myInt);

        System.out.println("Longest name in list is: " + getLongestElement(names));

    }

    /**
     * A simple method to print a byte value passed
     *
     * @param b
     */

    public static void printByte(byte b) {

        System.out.println("You passed byte value = " + b);

    }

    // Create a method that accept a List of String as argument
    // same thing as a method that has List of String parameter
    // and print out each and every item in the list vertically
    // return nothing

    /**
     * This method will print out the content of passed List Object vertically
     *
     * @param lst
     * @return nothing
     */

    public static void printAList(List<String> lst) {

        for (String each : lst) {
            System.out.println("each = " + each);
        }

    }

    /**
     * Simple method to get longest String from ArrayList
     * @param lst
     * @return longest String from list
     */

    public static String getLongestElement(List<String> lst) {

        String longestName = "";
        for (String each : lst) {
            if (each.length() > longestName.length()) {
                longestName = each;
            }
        }

        return longestName;

    }

}
