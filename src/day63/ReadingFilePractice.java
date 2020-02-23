package day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ReadingFilePractice {

    public static void main(String[] args) throws IOException {

        List<String> allData = Files.readAllLines(Paths.get("src/day63/employeeData.txt"));
//        for (String eachLine : allData) {
//            System.out.println("eachLine = " + eachLine);
//        }

        // Lambda expression
        allData.forEach(eachLine -> System.out.println("eachLine = " + eachLine));

        Map<Integer, String> idNamePair = new HashMap<>();
//        for (String eachLine : allData) {
//            int id = Integer.parseInt(eachLine.split(",")[0]);
//            String name = eachLine.split(",")[1];
//            idNamePair.put(id, name);
//        }

        allData.forEach(eachLine -> idNamePair.put(Integer.parseInt(eachLine.split(",")[0]),
                                                    eachLine.split(",")[1]));

        System.out.println("idNamePair = " + idNamePair);

        // get the person with employee id 20
        System.out.println("idNamePair.get(20) = " + idNamePair.get(20));

    }

}
