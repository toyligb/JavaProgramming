package day36;

import java.util.*;

public class ArrayListMethods {

    public static void main(String[] args) {

        // create ArrayList of long and assign it to variable

        ArrayList<Long> lst = new ArrayList<>();

        // C.R.U.D. -->> Create. Read. Update. Delete.
        // add item, insert item, read item, update item, remove item, check the location

        lst.add(12L); // 12L is automatically converted to new Long(12L); because ArrayList
        // only store object
        lst.add(100L);
        lst.add(150L);
        lst.add(200L);
        lst.add(null);

        System.out.println("lst = " + lst);

        // Counting items inside ArrayList
        System.out.println("Counting items using lst.size() = " + lst.size());

        // Getting items inside ArrayList object
        System.out.println("First item is: lst.get(0) = " + lst.get(0));

        // TASK: GET THE SUM OF ABOVE ARRAYLIST ITEM

//        long sum = 0L;
//        for (int i = 0; i < lst.size(); i++) {
//            sum += lst.get(i);
//        }
//
//        System.out.println("sum = " + sum);

        // TASK: GET THE MAX OF ABOVE ARRAYLIST ITEMS

//        long max = lst.get(0);
//        for (int i = 0; i < lst.size(); i++) {
//            if (max < lst.get(i)) {
//                max = lst.get(i);
//            }
//        }
//        System.out.println("max = " + max);

        // I want to insert 125 between 100L and 150L, basically 2nd and 3rd item
        lst.add(2, 125L);
        System.out.println("lst = " + lst);

        System.out.println("lst.get(3) = " + lst.get(3));

        // updating value at certain index: set method
        lst.set(3, 195L);
        System.out.println("New value for lst.get(3) = " + lst.get(3));

        // removing item by it's value
        lst.remove(100L);
        System.out.println("lst after removing 100 = " + lst);

        // removing item by it's index
        lst.remove(2);
        System.out.println("lst after removed item at index 2 = " + lst);

        // looking for location of certain item
        System.out.println("Location of 200L is: " + lst.indexOf(200L));
        // if you give value that is not on the list it will give -1 result

        // Check whether a list is empty or not
        System.out.println("lst.isEmpty() = " + lst.isEmpty());
        System.out.println("lst.size() > 0 = " + (lst.size() > 0));

        // to delete everything inside ArrayList
//        lst.clear();
//        System.out.println("lst.isEmpty() = " + lst.isEmpty());

        // check whether we have certain item or not
        System.out.println("lst.contains(100L) = " + lst.contains(200L));
        System.out.println("lst.contains(10L) = " + lst.contains(10L));

        // to check whether a list contains an item without using contains
        // use indexOf method, if it return -1, it means we don't have it
        System.out.println("DO I HAVE 10L = " + (lst.indexOf(10L) != -1));

    }

}
