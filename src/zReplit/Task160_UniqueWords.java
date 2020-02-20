package zReplit;

import java.util.*;

public class Task160_UniqueWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for (int i = 0; i < size; i++) {
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    private static void printUniqueWords(String[] words) {

        for (int j = 0; j < words.length; j++) {
            int count = 0;
            for (int k = 0; k < words.length; k++) {
                if (words[j].equals(words[k])) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(words[j]);
            }
        }

    }

}
