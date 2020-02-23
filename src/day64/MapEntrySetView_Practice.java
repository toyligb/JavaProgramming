package day64;

import java.util.*;
import java.util.Map.Entry;

public class MapEntrySetView_Practice {

    public static void main(String[] args) {

        Map<String,String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene","Female");
        employeeMap.put("Winfred","Male");
        employeeMap.put("Jereme","Male");
        employeeMap.put("Glad","Female");
        employeeMap.put("Desirae","Female");
        employeeMap.put("Kakalina","Female");
        employeeMap.put("Bertrando","Male");
        employeeMap.put("Ajay","Female");
        employeeMap.put("Brigitte","Female");
        employeeMap.put("Derk","Male");
        employeeMap.put("Orlando","Male");
        employeeMap.put("Selle","Female");
        employeeMap.put("Marika","Female");
        employeeMap.put("Griffy","Male");
        employeeMap.put("Shanon","Female");
        employeeMap.put("Clerkclaude","Male");
        employeeMap.put("Rickard","Male");
        employeeMap.put("Job","Male");
        employeeMap.put("Aida","Female");
        employeeMap.put("Alonzo","Male");

        System.out.println("employeeMap = " + employeeMap);

        // Task 1: get the name of all the Female from the map
        Set<Map.Entry<String, String>> entryView = employeeMap.entrySet();
        for (Map.Entry<String, String> each : entryView) {
            if (each.getValue().equals("Female")) {
                System.out.println("Female employee name = " + each.getKey());
            }
        }

        // Task 2: update the Female to Queen and Male to King
        for (Map.Entry<String, String> each : entryView) {
            each.setValue(each.getValue().equals("Female")? "Queen" : "King");
        }

        System.out.println("employeeMap = " + employeeMap);

    }

}
