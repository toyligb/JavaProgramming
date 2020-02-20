package day15;

import java.util.*;

public class NameChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scan.next();
        int len = name.length();

        for (int x = 0; x <= len - 1; x++) {
            for (int i = 0; i < x; i++) {
                System.out.print(" ");
            }
            System.out.println(name.charAt(x));
        }

        for (int x = len - 1; x >= 0; x--) {
            for (int i = x; i > 0; i--) {
                System.out.print(" ");
            }
            System.out.println(name.charAt(x));
        }

    }

}
