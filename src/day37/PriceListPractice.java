package day37;

import java.util.*;

public class PriceListPractice {

    public static void main(String[] args) {

        List<Double> priceList = new ArrayList<>();
        priceList.add(9.99);
        priceList.add(3.29);
        priceList.add(2.95);
        priceList.add(12.99);
        priceList.add(14.25);
        priceList.add(999.99);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);

        System.out.println("=== Before changing ===");
        System.out.println("priceList = " + priceList);
        // change the third price to $10
        priceList.set(2, 10.0);
        System.out.println("After replacing 3rd item to 10 = " + priceList.get(2));

        // Add 4 dollar to first price
        priceList.set(0, (priceList.get(0) + 4));
        System.out.println("After adding 4 to first item = " + priceList.get(0));

        // Change last price to sum of first and second price
        priceList.set(priceList.size() - 1, (priceList.get(0) + priceList.get(1)));
        System.out.println("After summing first and second items and setting them to last = "
                + priceList.get(priceList.size() - 1));

        // Give 40% off to second price
        priceList.set(1, priceList.get(1) * 0.6);
        System.out.println("After 40% off second item value is = " + priceList.get(1));

        // Double the value of each and every price in the list
        for (int i = 0; i < priceList.size(); i++) {
            priceList.set(i, priceList.get(i) * 2);
        }
        System.out.println("After doubling every item = " + priceList);

        // Cut the price into half if the price is more than 20$
        for (int i = 0; i < priceList.size(); i++) {
            if (priceList.get(i) > 20) {
                priceList.set(i, priceList.get(i) / 2);
            }
        }
        System.out.println("After halfing the prices > 20 = " + priceList);

        // swap the first value with the last value
        Double temp = priceList.get(0);
        priceList.set(0, priceList.get(priceList.size() - 1));
        priceList.set(priceList.size() - 1, temp);
        System.out.println("After swapping first and last = " + priceList);

        priceList.set(0, priceList.get(0) + priceList.get(priceList.size() - 1));
        priceList.set(priceList.size() - 1, priceList.get(0) - priceList.get(priceList.size() - 1));
        priceList.set(0, priceList.get(0) - priceList.get(priceList.size()-1));
        System.out.println("After swapping back = " + priceList);

    }

}
