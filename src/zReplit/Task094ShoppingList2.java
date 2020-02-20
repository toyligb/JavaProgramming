package zReplit;

import java.util.*;

public class Task094ShoppingList2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        do {
            System.out.println("Enter Item" + count + " and its price:");
            item = scan.next();
            price = scan.nextDouble();
            totalPrice += price;
            shoppingListReport += "Item" + count + ": " + item + " Price: " + price + ", ";
            System.out.println("Add one more item?");
            countinue = scan.next();
            count++;
        } while (countinue.equalsIgnoreCase("yes"));

        System.out.println(shoppingListReport.substring(0, shoppingListReport.length()-1));
        System.out.println("Total price: " + totalPrice);

    }

}
