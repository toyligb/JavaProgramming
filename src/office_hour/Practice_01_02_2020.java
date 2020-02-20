package office_hour;

import java.util.*;

/*
    1.  write a return method called RemoveDup that accepts a String and
    removes duplicate values from the String
    Ex: RemoveDuplicate("aaabbbccc") ==> "abc"
    2. write a return method called Frequency that accepts String and
    char, the method will return the total number of occurrence of the
    given char in the given string
    Ex:	Frequency("AAABBB", 'A') ==> 3
    3. Combined the methods 1 & 2 to write a method that prints the the
    frequency of each characters from the given String
    Ex:	FrequencyOfChars("CCAAABBBCCCC")  ==> "A3B3C6"
 */

public class Practice_01_02_2020 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scan.next();

        System.out.println("=== TASK 1 - REMOVE DUPLICATES ===");
        System.out.println(removeDup(str));

        System.out.println("=== TASK 2 - FREQUENCY OF A CHARACTER");
        System.out.println("Enter a character to check frequency:");
        char ch = scan.next().charAt(0);
        System.out.println("Frequency of " + ch + " is: " + frequency(str, ch));

        System.out.println("=== TASK 3 - FREQUENCY OF EACH CHARACTER IN A STRING");
        System.out.println("Frequency of characters in your string = " + frequencyOfEachChar(str));

    }

    private static String frequencyOfEachChar(String str) {

        String frqOfEach = "";
        int count = 0;
        String nonDup = removeDup(str);
        for (int i = 0; i < nonDup.length(); i++) {
            count = frequency(str, nonDup.charAt(i));
            frqOfEach += "" + nonDup.charAt(i) + count;
        }
        return frqOfEach;
    }

    private static int frequency(String str, char ch) {

        int frq = 0;
        char[] arr = str.toCharArray();
        for (char each : arr) {
            if (each == ch) {
                frq++;
            }
        }
        return frq;
    }

    private static String removeDup(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
            }
        }

        return result;
    }

}
