package day64;

import java.util.*;

public class MapKeySetView {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Potato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap = " + groceryPriceMap);

        // Map view:
            // keySet view, values view, entrySet view

        // How do I store all the keys into a Collection?
        // What do you think the data type will be to store such Collection?
        // --- Set, because keys are unique

        // we can use keySet() method of Map to get Set of keys
        // keySet view of Map strictly connected to Map
        // if you remove certain item it goes back to Map

        Set<String> allNames = groceryPriceMap.keySet();
//        System.out.println("allNames = " + allNames);
//        allNames.remove("Tomato");
//        System.out.println("allNames no Tomato = " + allNames);
//
//        System.out.println("groceryPriceMap = " + groceryPriceMap);

        // What if we do not want such relationship and we just want to use the keys somewhere else?
        // --->>> Get a copy of the Set into different object

        Set<String> namesCopy = new HashSet<>(allNames);
        namesCopy.remove("Tomato");
        System.out.println("namesCopy = " + namesCopy);
        System.out.println("allNames = " + allNames);
        System.out.println("groceryPriceMap = " + groceryPriceMap);

    }

}
