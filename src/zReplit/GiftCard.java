package zReplit;

import java.util.*;

public class GiftCard {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();

        //WRITE YOUR CODE HERE
        int balance;
        if (item.equals("Smartphone")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equals("Laptop")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equals("Charger")) {
            balance = 100 - 15;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equals("USB cable")) {
            balance = 100 - 10;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equals("Headphones")) {
            balance = 100 - 30;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equals("Pants")) {
            balance = 100 - 50;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equals("Hat")) {
            balance = 100 - 25;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equals("Socks")) {
            balance = 100 - 5;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equals("Blanket")) {
            balance = 100 - 60;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equals("Pillow")) {
            balance = 100 - 40;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        } else {
            System.out.println("Invalid item!");
        }

    }
}
