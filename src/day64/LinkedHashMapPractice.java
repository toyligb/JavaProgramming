package day64;

import java.util.*;

public class LinkedHashMapPractice {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new LinkedHashMap<>();
        // LinkedHashSet or LinkedHashMap keeps insertion order, it is slower than HashSet or HashMap
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Potato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap = " + groceryPriceMap);

    }

}
