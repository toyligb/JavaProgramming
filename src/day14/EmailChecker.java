package day14;

import java.util.*;

public class EmailChecker {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email:");
        String email = scan.nextLine();

        int length = email.length();

        if (!email.contains("@") || email.contains(" ")) {
            System.out.println(email + " is invalid email.");
        } else if (email.endsWith("@gmail.com")) {
            System.out.println("Gmail");
        } else if (email.endsWith("@yahoo.com")) {
            System.out.println("Yahoo");
        } else if (email.endsWith("@mail.ru")) {
            System.out.println("Runet");
        } else {
            System.out.println("Other server");
        }

    }

}
