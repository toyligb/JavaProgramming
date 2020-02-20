package day38;

import java.util.*;

public class SortingAListObject {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(300, 200, 700, 600, 800));
        System.out.println("before sorting nums = " + nums);

        // 2 ways to sort an Arraylist
        // Use Collections utility class (just like Arrays utility class for array objects)

        // Collections is a class coming from java.util package
        // it has a lot of ready method to work with Collection objects like ArrayList and so on
        Collections.sort(nums);
        System.out.println("after sorting nums = " + nums);

        // This version of sort method accept 2 arguments
        // 1st is the list to be sorted
        // 2nd a Comparator  Object that contains comparing logic
        // good news is there is ready method already in java
        // we can get reverse order comparator object by calling
        // Comparator.reverseOrder(), just take it and use it!
        Collections.sort(nums, Comparator.reverseOrder());
        System.out.println("tersden sort edilen nums = " + nums);

        // List itself also has sort method that accept one Comparator Object
        // simple way to get Comparator objects are
            // Comparator.naturalOrder() -->> low to high order
            // Comparator.reverseOrder() -->> high to low order

        nums.sort(Comparator.naturalOrder());
        System.out.println("Natural order ulananymyzdan son nums = " + nums);

        nums.sort(Comparator.reverseOrder());
        System.out.println("Tersden sort edilen son nums = " + nums);

    }

}
