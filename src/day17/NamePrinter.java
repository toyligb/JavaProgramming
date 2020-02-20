package day17;

import java.util.*;

public class NamePrinter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = scan.nextLine();
        int startingPoint = 0;

        while (startingPoint < fullName.length()) {
            System.out.println(fullName.charAt(startingPoint));
            startingPoint++;
        }

        System.out.println();

        while (startingPoint > 0) {
            startingPoint--;
            System.out.println(fullName.charAt(startingPoint));
        }

    }

}
