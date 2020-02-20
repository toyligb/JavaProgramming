package day12;

import java.util.*;

public class LoginTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userName, password;

        System.out.println("Enter your username:");
        userName = scan.next();

        System.out.println("Enter your password:");
        password = scan.next();

        if (userName.equals("user123") && password.equals("pass123")) {
            System.out.println("Login successful");
            System.out.println("Welcome to the Cybertek school.");
        } else if (userName.equals("user123") && !password.equals("pass123")) {
            System.out.println("Username is correct. Password incorrect!");
        } else if (!userName.equals("user123") && password.equals("pass123")) {
            System.out.println("Username is incorrect. Password correct!");
        } else {
            System.out.println("No such user in our system!");
        }

    }

}
