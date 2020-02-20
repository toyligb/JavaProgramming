package day37;

import java.util.*;

public class ArrayListWithStringPractice {

    public static void main(String[] args) {

        List<String> superHeroes = new ArrayList<>();
        superHeroes.add("Superman");
        superHeroes.add("Batman");
        superHeroes.add("Cyborg");
        superHeroes.add("Wonder Woman");
        superHeroes.add("Flash");
        superHeroes.add("Aquaman");

        System.out.println("superHeroes = " + superHeroes);

        // Do we have superman in the list?
        System.out.println("superHeroes.contains(\"Superman\") = "
                + superHeroes.contains("Superman"));

        System.out.println("superHeroes.contains(\"man\") = "
                + superHeroes.contains("man"));

        // remove any heroes that does not have man in the String
//        for (int i = 0; i < superHeroes.size(); i++) {
//            if (!superHeroes.get(i).contains("man")) {
//                superHeroes.remove(superHeroes.get(i));
//            }
//        }
//        System.out.println("superHeroes = " + superHeroes);

        for (int i = superHeroes.size() - 1; i >= 0; i--) {
            if (!superHeroes.get(i).contains("man")) {
                superHeroes.remove(superHeroes.get(i));
            }
        }
        System.out.println("superHeroes = " + superHeroes);

        List<String> superHeroesCopy = new ArrayList<>(superHeroes);
        System.out.println("superHeroesCopy = " + superHeroesCopy);

        // THIS WILL CREATE A UNMODIFIABLE LIST!!!
        List<String> topics = Arrays.asList("Java", "Selenium", "Database", "API");
        System.out.println("topics = " + topics);

        // HERE COPYING EVERYTHING inside topic to topicCopy
        // And it's just regular arraylist, we can do anything with it.
        List<String> topicsCopy = new ArrayList<>(topics);
        System.out.println("topicsCopy = " + topicsCopy);

    }
}
