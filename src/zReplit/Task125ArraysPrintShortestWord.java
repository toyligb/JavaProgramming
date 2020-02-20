package zReplit;

import java.util.*;

public class Task125ArraysPrintShortestWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        //int shortest = str[0].length();
        String shortWord = str[0];

        for (int i = 0; i < str.length; i++) {
            if (str[i].length() < shortWord.length()) {
                //shortest = str[i].length();
                shortWord = str[i];
            }
        }
        System.out.println(shortWord);
    }

}
