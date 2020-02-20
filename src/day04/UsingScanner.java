package day04;

import java.util.Scanner;

public class UsingScanner {

    public static void main(String[] args) {

        // I want to save users input after asking some questions
        // and I want to save this input so I can do something with it.

        // Step 1: Use Scanner class to create scanner object
        //         that have this functionality
        Scanner input = new Scanner(System.in);

        // ask user to enter name
        System.out.print("Please enter your first name: ");

        // capture what user typed on keyboard in console
        String firstName = input.next();

        // print the result of what we saved from user input
        System.out.println("Your first name is: " + firstName);

    }

}
