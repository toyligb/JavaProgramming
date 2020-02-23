package day63;

import java.util.*;

public class GroceryMap {

    public static void main(String[] args) {

        Map<String, Double> grocery = new HashMap<>();

        grocery.put("Tomato", 4.99);
        grocery.put("Cheese", 6.79);
        grocery.put("Bread", 1.99);
        grocery.put("Banana", 3.49);
        grocery.put("Yogurt", 12.00);
        grocery.put("Egg", 7.49);
        grocery.put("Cheese", 10.99);

        System.out.println("grocery.size() = " + grocery.size());

        System.out.println("grocery = " + grocery);

        grocery.putIfAbsent("Bread", 5.49);
        System.out.println("grocery.size() = " + grocery.size());
        System.out.println("grocery = " + grocery);

        System.out.println("grocery.get(\"Bread\") = " + grocery.get("Bread"));

        grocery.replace("Tomato", grocery.get("Tomato")*2);
        System.out.println("grocery.get(\"Tomato\") = " + grocery.get("Tomato"));

        grocery.replace("Cheese", grocery.get("Cheese")-1);
        System.out.println("grocery.get(\"Cheese\") = " + grocery.get("Cheese"));

        if (grocery.containsKey("Tomato")) {
            grocery.remove("Tomato");
            System.out.println("NO MORE TOMATO");
        }
        System.out.println("grocery = " + grocery);

    }

}
