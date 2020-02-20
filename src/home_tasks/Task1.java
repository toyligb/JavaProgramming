package home_tasks;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scan.nextLine();

        if (text.length() > 1) {
            System.out.println(text.substring(0, 2));
        } else if (text.isEmpty()) {
            System.out.println("Empty string.");
        } else {
            System.out.println(text.charAt(0) + "" + text.charAt(0));
        }

    }
}
