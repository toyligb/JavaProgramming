package day13;

import java.util.*;

public class StringMethods {

    public static void main(String[] args) {

        String s1 = "Hello";
        System.out.println(s1.equals("abc"));

        System.out.println(s1.equalsIgnoreCase("HELLO"));

        System.out.println(s1.equals("HELLO"));

        System.out.println(s1 == "HELLO");

        System.out.println(s1.toUpperCase());
        System.out.println(s1.length());

        System.out.println(s1.toLowerCase());

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();
        //System.out.println(fullName.charAt(1));

        System.out.println("Enter your address:");
        String address = scan.nextLine();

        System.out.println("Lower case full name: " + fullName.toLowerCase());
        System.out.println("Upper case full name: " + fullName.toUpperCase());
        System.out.println("Lower case address: " + address.toLowerCase());
        System.out.println("Upper case address: " + address.toUpperCase());
        System.out.println("Length of your full name is: " + fullName.length());
        System.out.println("Length of your address is: " + address.length());

    }

}
