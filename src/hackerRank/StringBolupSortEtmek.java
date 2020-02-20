package hackerRank;

import java.util.*;

public class StringBolupSortEtmek {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = scan.nextLine();

        System.out.println("Enter number:");
        int k = scan.nextInt();

        System.out.println(getSmallestAndLargest(s, k));

    }

    public static String getSmallestAndLargest(String s, int k) {

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        for (int i = 0; i < s.length() - k + 1; i++) {
            if (s.substring(i, i + k).compareTo(smallest) < 0) {
                smallest = s.substring(i, i + k);
            }
            if (s.substring(i, i + k).compareTo(largest) > 0) {
                largest = s.substring(i, i + k);
            }
        }

        return smallest + "\n" + largest;

    }
}