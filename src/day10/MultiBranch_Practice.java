package day10;

import java.util.Scanner;

public class MultiBranch_Practice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String order = "";
        System.out.print("Welcome to McDonald! \nWhat can I get for you: ");
        int itemNumber = scan.nextInt();

        switch (itemNumber) {
            case 11:
                order = "Burger";
                break;
            case 5:
                order = "French Fry";
                break;
            case 8:
                order = "Nuggets";
                break;
            case 35:
                order = "Ice cream";
                break;
            case 55:
                order = "Coke";
                break;
            default:
                order = "Not in list. Try one more time!";
                break;
        }
        System.out.println("You have selected " + itemNumber);
        System.out.println("Your order " + order + " is ready for pickup.");

    }

}
