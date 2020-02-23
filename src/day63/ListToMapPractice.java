package day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ListToMapPractice {

    public static void main(String[] args) throws IOException {

        List<String> groupMembers = Files.readAllLines(Paths.get("src/day63/group5Members"));
        Map<String, Integer> nameCharCountPair = new HashMap<>();

        groupMembers.forEach(eachMember -> nameCharCountPair.put(eachMember.split("- ")[1],
                eachMember.split("- ")[1].length()));

        System.out.println("nameCharCountPair = " + nameCharCountPair);

    }

}