package home_tasks;

import java.util.*;

public class Task15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = scan.nextLine();

        for (int x = 0 ; x < str.length() ; x++) {
            System.out.print(str.charAt(x) + " = " + (int)str.charAt(x) + " / ");
        }

    }

}
