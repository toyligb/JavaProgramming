package day14;

import java.util.*;

public class PrintingEachCharacterOfString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.next();

        int nameLength = name.length();

        for (int x = 0; x < nameLength; x++) {
            System.out.println(name.charAt(x));
        }

    }

}
