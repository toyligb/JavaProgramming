package home_tasks;

import java.util.*;

public class Task6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();

        System.out.println("Generated email is: " + fullName.charAt(0) + fullName.substring(fullName.indexOf(" ")+1)
                            + "@NightWatch.com");

    }

}
