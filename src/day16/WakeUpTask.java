package day16;

import java.util.*;

public class WakeUpTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text1 = scan.nextLine();

        for (int i = text1.length()-1; i >= 0; i--) {
            System.out.print(text1.charAt(i));
        }

    }

}
