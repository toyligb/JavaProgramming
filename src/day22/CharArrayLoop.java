package day22;

import java.util.*;

public class CharArrayLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.nextLine();
        char[] letter = new char[name.length()];

        for (int i = 0; i < name.length(); i++) {
            letter[i] = name.charAt(i);
            System.out.print(letter[i] + " ");
        }

    }

}
