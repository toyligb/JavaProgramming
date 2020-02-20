package day15;

import java.util.*;

public class StringCaseInsensitiveCheck {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.next().toLowerCase();

        // This is called method chaining, combining multiple method call
        System.out.println(name.toLowerCase().contains("st"));

    }

}
