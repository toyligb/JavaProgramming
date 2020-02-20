package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramsOrNotTask {

    public static boolean isAnagram(String a, String b) {

        boolean checkResult = false;

        String[] aLetters = a.toUpperCase().split("");
        String[] bLetters = b.toUpperCase().split("");

        System.out.println(Arrays.toString(aLetters));
        System.out.println(Arrays.toString(bLetters));

        Arrays.sort(aLetters);
        Arrays.sort(bLetters);

        if (aLetters.length != bLetters.length) {
            checkResult = false;
        } else {
            checkResult = Arrays.equals(aLetters, bLetters);
        }

        return checkResult;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word:");
        String a = scan.nextLine();

        System.out.println("Enter second word:");
        String b = scan.nextLine();

        System.out.println(isAnagram(a, b));

    }

}
