package day13;

import java.util.*;

public class AmazonShippingCalculator {

    public static void main(String[] args) {

        /*
        * Amazon has 2 type of user: one is Prime Member and another is Regular member
        * Prime member gets free shipping in all purchase no matter the amount
        * Regular member get free shipping only if their purchase is more than $25
        * otherwise they get $5 shipping fee
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Type of membership (Prime / Regular):");
        String memberType = scan.next();

        System.out.println("Amount of purchase:");
        double amount = scan.nextDouble();

        int shippingFee = 0;

        if (memberType.equalsIgnoreCase("Prime")) {
            System.out.println("YOU GET 1 DAY FREE SHIPPING!");
            System.out.println("Your final price is " + amount);
        } else if (amount > 25) {
            System.out.println("NOT A PRIME MEMBER BUT YOUR ORDER IS MORE THAN 25.");
            System.out.println("YOU GOT FREE SHIPPING ON AMOUNT: " + amount);
        } else {
            shippingFee += 5;
            amount += shippingFee;
            System.out.println("DO YOU WANNA SIGN UP FOR PRIME MEMBERSHIP ( Y / N) :");
            scan.nextLine();
            char answer = scan.next().charAt(0);
            if (answer == 'Y' || answer == 'y') {
                System.out.println("Enter your full name:");
                scan.nextLine();
                String fullName = scan.nextLine();
                System.out.println("Enter your email:");
                String email = scan.nextLine();
                System.out.println("Dear " + fullName + "! Please confirm on your " + email
                        + " email.");
                System.out.println("On your next shopping you will have free shipping!");
            } else {
                System.out.println("Thank you for shopping!");
            }
            System.out.println("Your total amount is: " + amount);
        }

    }

}
