package zReplit;

import java.util.*;

public class Task088CatsAndDogs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        for (int i = 0; i < word.length() - 2; i++) {
            if (word.substring(i, i + 3).equalsIgnoreCase("dog")) {
                countOfDogs++;
            }
            if (word.substring(i, i + 3).equalsIgnoreCase("cat")) {
                countOfCats++;
            }
        }

        boolean out = (countOfCats == countOfDogs) ? true : false;

        System.out.println(out);

    }

}
