package day62;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetIntro {

    public static void main(String[] args) {

        // SortedSet interface extends Set interface
        // it is a data structure that store unique elements in sorted order
        // The implementing class is TreeSet
        // it keep out the duplicate and sorts
        // Set,HashSet,LinkedHasSet does not accept duplicates
        // hashSet fastest, tree set is sorted, LinkedSet doesn't change the order of element
        /*
        Interview Question:
        - Tell me about difference between hashSet linkedHashSet and treeSet ?
            does not have duplicate hashSet
            everything sorted duplicates removed treeSet
            no duplicates + insertion order LinkedHashSet
         */

        SortedSet<Integer> mySet = new TreeSet<>();
        mySet.add(70);
        mySet.add(90);
        mySet.add(30);
        mySet.add(30);
        mySet.add(50);
        mySet.add(65);
        mySet.add(35);
        mySet.add(70);

        System.out.println("mySet = " + mySet);
        System.out.println("mySet.first() = " + mySet.first());
        System.out.println("mySet.last() = " + mySet.last());

    }

}
