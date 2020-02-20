package day13;

import java.util.*;

public class PasswordLengthCheck {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter username:");
        String userName = scan.next();

        System.out.println("Enter password:");
        String password = scan.next();

        if ( password.length() < 8 ) {
            System.out.println("Password length must be minimum of 8 characters.");
            System.out.println("Please try again!");
        } else {
            System.out.println("User created!");
        }

    }

}
