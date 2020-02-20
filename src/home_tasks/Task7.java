package home_tasks;

import java.util.*;

public class Task7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email:");
        String email = scan.next();

        String part1 = email.substring(0, email.indexOf('@'));
        String part2 = email.substring(email.indexOf('@') + 1, email.indexOf('.'));
        String part3 = email.substring(email.indexOf('.') + 1);

        System.out.println("Part 1: " + part1);
        System.out.println("Part 2: " + part2);
        System.out.println("Part 3: " + part3);

    }

}
