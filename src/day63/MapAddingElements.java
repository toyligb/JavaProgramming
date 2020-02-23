package day63;

import java.util.HashMap;
import java.util.Map;

public class MapAddingElements {

    public static void main(String[] args) {

        // CREATING HashMap objects
        Map<String, Integer> nameAgePair = new HashMap<>();

        // adding elements: put
        nameAgePair.put("Jemal", 36);
        nameAgePair.put("Toyly", 37);
        nameAgePair.put("Kerim", 13);
        nameAgePair.put("Dursun", 9);
        nameAgePair.put("Ayka", 19);
        nameAgePair.put("Rahym", 16);
        // The keys of the Map is unique, it does not accept duplicate
        // here since we already have Zehra --> it will just replace the old value with new one
        nameAgePair.put("Dursun", 25);

        System.out.println("nameAgePair = " + nameAgePair);
        // getting the size of map
        System.out.println("nameAgePair.size() = " + nameAgePair.size());

        // how do we get an value according to the key
        System.out.println("nameAgePair.get(\"Dursun\") = " + nameAgePair.get("Dursun"));

        // how do I check a key already exist or not
        // containsKey method
        System.out.println("nameAgePair.containsKey(\"Gozel\") = " + nameAgePair.containsKey("Gozel"));

        // HOW DO I ONLY ADD NEW ITEMS IF IT DOES NOT ALREADY EXISTS
        // putIfAbsent method
        nameAgePair.putIfAbsent("Toyly", 18);
        nameAgePair.putIfAbsent("Gozel", 40);

        System.out.println("nameAgePair = " + nameAgePair);

        // Updating the element in the Map using replace
        nameAgePair.replace("Jemal", 18);
        System.out.println("nameAgePair.get(\"Jemal\") = " + nameAgePair.get("Jemal"));
        // why don't we use put? what is the  downside?
        // if I don't have that key, it will just add new one and that's not what we want,
        // we only want to update
        nameAgePair.replace("Gozel", 40, 20);
        System.out.println("nameAgePair.get(\"Gozel\") = " + nameAgePair.get("Gozel"));

        // Removing Entry by the key
        nameAgePair.remove("Toyly");
        System.out.println("nameAgePair.get(\"Toyly\") = " + nameAgePair.get("Toyly"));
        System.out.println("nameAgePair.containsKey(\"Toyly\") = " + nameAgePair.containsKey("Toyly"));

    }

}
