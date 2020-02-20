package home_tasks;

import java.util.*;

public class HomeTasks_12_09 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        float[] storePrices = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};

        int itemCount = groceryItems.length;
        int lastItemIndex = itemCount - 1;
        String lastFruit = groceryItems[lastItemIndex]; // groceryItems[groceryItems.length-1]

        // task 1
        System.out.println("TASK 1:");
        for (String eachItem : groceryItems) {
            System.out.print(eachItem);
            if (!eachItem.equals(lastFruit)) {
                System.out.print(" -->> ");
            }
        }

        // task 1.1
        System.out.println("\n\nTASK 1.1:");
        for (int i = 0; i < groceryItems.length; i++) {
            if (i % 2 == 1) {
                System.out.println(groceryItems[i] + " at index " + i);
            }
        }

        // task 1.2
        System.out.println("\n\nTASK 1.2:");
        for (int i = lastItemIndex; i >= 0; i--) {
            System.out.println(groceryItems[i] + " at index " + i);
        }

        // task 1.3
        System.out.println("\n\nTASK 1.3:");
        for (int i = 0; i < groceryItems.length; i++) {
            if (groceryItems[i].equals("strawberry")) {
                System.out.println("Index of strawberry is: " + i);
            }
        }

        // task 1.4
        System.out.println("\n\nTASK 1.4:");
        int countOfBerry = 0;
        for (int i = 0; i < groceryItems.length; i++) {
            if (groceryItems[i].contains("berry")) {
                countOfBerry++;
            }
        }
        System.out.println("countOfBerry = " + countOfBerry);

        // task 1.5
        System.out.println("\n\nTASK 1.5:");
        System.out.println("Character counts:");
        for (int i = 0; i < groceryItems.length; i++) {
            System.out.println((i + 1) + " item " + groceryItems[i] + " char count is " + groceryItems[i].length());
        }

        // task 1.6
        System.out.println("\n\nTASK 1.6:");
        System.out.println("ITEMS WITH EVEN CHAR COUNTS:");
        for (int i = 0; i < groceryItems.length; i++) {
            if (groceryItems[i].length() % 2 == 0) {
                System.out.println(groceryItems[i] + " has even char count = " + groceryItems[i].length());
            }
        }

        // task 1.7
        System.out.println("\n\nTASK 1.7:");
        System.out.println("ITEMS WITH e IN THE END:");
        for (int i = 0; i < groceryItems.length; i++) {
            if (groceryItems[i].charAt(groceryItems[i].length() - 1) == 'e') {
                System.out.println(groceryItems[i] + " ends with letter e");
            }
        }

        // task 1.8
        System.out.println("\n\nTASK 1.8:");
        System.out.println("LAST 3 CHARS OF ITEMS:");
        for (int i = 0; i < groceryItems.length; i++) {
            System.out.println(groceryItems[i] + " last 3 chars is "
                    + groceryItems[i].substring(groceryItems[i].length() - 3));
        }

        // task 1.9
        System.out.println("\n\nTASK 1.9:");
        System.out.println("STORE IN ONE STRING:");
        String allItems = "";
        for (int i = 0; i < groceryItems.length; i++) {
            allItems += groceryItems[i];
            //if (!groceryItems[groceryItems.length-1])
        }


    }
}