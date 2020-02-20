package zReplit;

import java.util.*;

public class Task035WithSwitchStatement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();

        int price = 0;

        switch (item) {
            case "Smartphone":
            case "Laptop":
                System.out.println("Sorry, not enough funds on your gift card!");
                break;
            case "Charger":
                price = 15;
                break;
            case "USB cable":
                price = 10;
                break;
            case "Headphones":
                price = 30;
                break;
            case "Pants":
                price = 50;
                break;
            case "Hat":
                price = 25;
                break;
            case "Socks":
                price = 5;
                break;
            case "Blanket":
                price = 60;
                break;
            case "Pillow":
                price = 40;
                break;
            default:
                System.out.println("Invalid item!");
                break;
        }
        int balance = 100 - price;
        System.out.println("Thank you for your purchase!");
        System.out.println("Your current balance is: " + balance + "$");
    }

}
