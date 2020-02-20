package home_tasks;

import java.util.*;

public class Task3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your full name:");
        String fullName = scan.nextLine();
        System.out.println("Your initials are: " + fullName.charAt(0) + fullName.charAt(fullName.indexOf(" ") + 1));

    }

}
