package day17;

import java.util.*;

public class PrintNameWithOdIndexes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String fullName = scan.nextLine();
        int x = 0;

        while (x < fullName.length()) {
            if (x % 2 == 0) {
                System.out.println(fullName.charAt(x));
            }
            x++;
        }

    }

}
