package day14;

import java.util.*;

public class TrimAndIsEmpty {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your message:");
        String message = scan.nextLine();

        System.out.println(message);
        System.out.println("Message character count is: " + message.length());
        System.out.println("Trimmed message is: \n" + message.trim());
        String trimmedMessage = message.trim();
        System.out.println(trimmedMessage.length());
        System.out.println(message.isEmpty());

    }

}
