package day16;

import java.util.*;

public class WhileRepeatSentence {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Write a message:");
        String message = scan.nextLine();

        System.out.println("How many times do you want to send this message:");
        int times = scan.nextInt();
        int i = 1;

        while (i <= times) {
            System.out.println(message + " " + i);
            i++;
        }

        System.out.println("Finished sending message.");

    }

}
