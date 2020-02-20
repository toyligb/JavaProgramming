package day15;

import java.util.*;

public class NameChecker {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scan.next();

        int nameLength = name.length();

        if (nameLength < 4) {
            System.out.println("Short name.");
        } else if (nameLength <= 10) {
            System.out.println("Middle name.");
        } else {
            System.out.println("Long name.");
        }

    }

}