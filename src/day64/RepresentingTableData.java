package day64;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class RepresentingTableData {

    public static void main(String[] args) throws IOException {

        // for single row
        // I want to get the value by it's column name
        // so I choose Map

        Map<String, String> row1 = new LinkedHashMap<>();
        row1.put("first_name", "Regan");
        row1.put("email", "rboichat0@1688.com");
        row1.put("gender", "Female");

        Map<String, String> row2 = new LinkedHashMap<>();
        row2.put("first_name", "Carleen");
        row2.put("email", "cmorillas1@blog.com");
        row2.put("gender", "Male");

        System.out.println("row1 = " + row1);
        System.out.println("row2 = " + row2);

        // for one row I used one Map
        // but I have many rows!
        // may of Some type -->> List<SomeType>

        List<Map<String, String>> rowMapLst = new ArrayList<>();
        rowMapLst.add(row1);
        rowMapLst.add(row2);

        System.out.println("rowMapLst = " + rowMapLst);

        // How do I get 2nd row email column?
        System.out.println("rowMapLst.get(1).get(\"email\") = " + rowMapLst.get(1).get("email"));

        // update the name of 1st row to Hulk
        rowMapLst.get(0).replace("first_name", "Hulk");
        System.out.println("rowMapLst = " + rowMapLst);
        rowMapLst.get(0).put("first_name", "Jane");
        System.out.println("rowMapLst = " + rowMapLst);

        System.out.println("===========================");

        // HOMEWORK: FILL UP THIS LIST OF MAP USING FILE DATA
        List<String> readingEmployeeDataTxt = Files.readAllLines(Paths.get("src/day64/EmployeeData.txt"));
        for(String eachLine: readingEmployeeDataTxt) {
            String[] arr = eachLine.split(",");
            Map<String, String> eachRow = new LinkedHashMap<>();
            eachRow.put("first name", arr[0]);
            eachRow.put("email", arr[1]);
            eachRow.put("gender", arr[2]);
            rowMapLst.add(eachRow);
        }

        System.out.println("rowMapLst = " + rowMapLst);


    }

}
