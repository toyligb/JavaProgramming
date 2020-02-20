package day39;

import java.util.*;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<String> productLst = new ArrayList<>(Arrays.asList(
                "iPhone6s, 499, 18.71", "iPhone6s Plus, 549, 22.88",
                "iPhone X, 1149, 56.16", "MacbookPro, 1499.99, 79.49",
                "ThumbDrive, 39.99, 2.68", "Beats HeadPhones, 349.99, 15.12",
                "Mouse, 79.99, 8.98", "Charger, 39.99, 4.56",
                "iPad, 429, 18.31", "Dyson Vacuum, 399, 16.25",
                "TV, 2199, 89.49", "Apple Watch, 559, 21.18"
        ));

        System.out.println("productLst = " + productLst);
        System.out.println("productLst.size() = " + productLst.size());

        // Task 1: print only items name
        System.out.println("\nTask 1: print only items name");
//        String itemDetails = "iPhone 6s, 449, 18.71";
//        System.out.println("item name = " + itemDetails.split(",")[0].trim());
//        System.out.println("item price = " + itemDetails.split(",")[1].trim());
//        System.out.println("item monthly = " + itemDetails.split(",")[2].trim());

        // atlary print etmegin 1-nji yoly
        for (int i = 0; i < productLst.size(); i++) {
            String productNames = productLst.get(i).split(",")[0];
            System.out.println("productName = " + productNames);
        }

        // atlary print etmegin 2-nji yoly
//        for (String eachProduct : productLst) {
//            String namePart = eachProduct.split(",") [0];
//            System.out.println("namePart = " + namePart);
//        }

        // Task 2 : print all the prices more than 500
        System.out.println("\nTask 2 : print all the prices more than 500");
        for (String eachProduct : productLst) {
            double price = Double.parseDouble(eachProduct.split(",")[1]);
            if (price > 500) {
                System.out.println("price = " + price);
            }
        }

        // Task 3 : print average price
        System.out.println("\nTask 3 : print average price");
        double sum = 0;
        double average = 0;

        for (String eachProduct : productLst) {
            double price = Double.parseDouble(eachProduct.split(",")[1]);
            sum += price;
        }

        average = sum / productLst.size();
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);

        // Task 4 : print all the items name that has less than 20$ monthly payment.
        System.out.println("\nTask 4 : print all the items name that has less than 20$ monthly payment.");
        for (String eachProduct : productLst) {
            String name = eachProduct.split(",")[0];
            double monthly = Double.parseDouble(eachProduct.split(",")[2]);
            if (monthly < 20) {
                System.out.println(name + ": " + monthly);
            }
        }

        // Task 5 : Print the monthly payments of all the iPhone no matter what model.
        System.out.println("\nTask 5 : Print the monthly payments of all the iPhone no matter what model.");
        for (String eachProduct : productLst) {
            String name = eachProduct.split(",")[0];
            double monthly = Double.parseDouble(eachProduct.split(",")[2]);
            if (name.contains("iPhone")) {
                System.out.println(name + " : " + monthly);
            }
        }

        // Task 6 : Print all information about most expensive item.
        System.out.println("\nTask 6 : Print all information about most expensive items.");

        double maxPrice = Double.parseDouble(productLst.get(0).split(",")[1]);
        int maxIndex = 0;
        for (int i = 0; i < productLst.size(); i++) {
            double itemPrice = Double.parseDouble(productLst.get(i).split(",")[1]);
            if (itemPrice > maxPrice) {
                maxPrice = itemPrice;
                maxIndex = i;
            }
        }
        System.out.println("The most expensive item is: " + productLst.get(maxIndex));

        // Task 7 : Update Dyson price to 80% off (Monthly payment should also be calculated accordingly)
        System.out.println("\nTask 7 : Update Dyson price to 80% off (Monthly payment should also be calculated accordingly)");

        for (int i = 0; i < productLst.size(); i++) {
            if (productLst.get(i).split(",")[0].contains("Dyson")) {
                double itemPrice = Double.parseDouble(productLst.get(i).split(",")[1]);
                itemPrice *= 0.2;
                //double monthly = Double.parseDouble(productLst.get(i).split(",")[2]);
                double monthly = itemPrice / 24;
                productLst.set(i, "Dyson Vacuum, " + itemPrice + ", " + monthly);
            }
        }

        System.out.println("productLst = " + productLst);

        // Task 8 : Count the items prices more than average price.
        System.out.println("\nTask 8 : Count the items prices more than average price.");
        int cnt = 0;
        for (String eachProduct : productLst) {

            double price = Double.parseDouble(eachProduct.split(",")[1]);
            if (price > average) {
                ++cnt;
            }
        }
        System.out.println("all the items with prices more than average price  = " + cnt);


        // Task 9 : Remove all the items has more than average price.
        System.out.println("\nTask 9 : Remove all the items has more than average price.");
        for (int i = 0; i < productLst.size(); i++) {

            double price = Double.parseDouble(productLst.get(i).split(",")[1]);
            if (price > average) {

                productLst.remove(i);
                --i;
            }

        }
        System.out.println("productLst count  after removing = " + productLst.size());
        // You may also store all the items with more than average into another list
        // then use remove all method :  productLst.removeAll( newListHere)


        // OPTIONAL TASK:
        // Create 3 more ArrayList objects to separately store  itemNames(String),
        // prices(Double) , monthlyPayments(Double)
        System.out.println("\nOPTIONAL TASK:");
        System.out.println("\n-----------Task 3 ArrayList Objects ----------");
        System.out.println("\n-----------Task Three ArrayList Objects ----------");
//         * ------------------------
//         * Create 3 more ArrayList objects to separately store
//         *  itemNames(String), prices(Double) , monthlyPayments(Double)  :
        ArrayList<String> itemNames = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Double> monthlyPayments = new ArrayList<>();

        for (String eachProduct : productLst) {
            // store the name part into ItemName list
            String name = eachProduct.split(",")[0];
            itemNames.add(name);
            // store the name price into prices list
            double pricePart = Double.parseDouble(eachProduct.split(",")[1]);
            prices.add(pricePart);
            // store the name monthlyPart into monthlyParts list
            double monthlyPart = Double.parseDouble(eachProduct.split(",")[2]);
            monthlyPayments.add(monthlyPart);

        }

        System.out.println("itemNames = " + itemNames);
        System.out.println("prices = " + prices);
        System.out.println("monthlyPayments = " + monthlyPayments);

    }

}
