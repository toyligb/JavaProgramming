package day60.collections_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
//INTERVIEW
//how do you remove an item while iterating over collection ?
//safest way that you can remove an element with any type of collection ?
//for loop ok but it it deals with index
//what if other type of collections => they do not have index
//We use iterator : it is common for all of collection types
//i check with hasNext() method if i do , i keep going using next() and remove() method

public class IteratingAnyCollection {

    public static void main(String[] args) {

        // this is the ArrayList constructor that accept any type of Collection object
        // public ArrayList(Collection<E> c) { }
        Collection<Integer> nums = new ArrayList<>(Arrays.asList(10, 4, 5, 22, 88, 13));

        // ***** Interview question:
        // What is the best way to remove element while iterating over the collections
        // Answer: Using the Iterator instead of for each loop / for loop / ...

        // iterating over a collection object using iterator
        Iterator<Integer> myIter = nums.iterator();
        while (myIter.hasNext()) {
            //System.out.println("myIter.next() = " + myIter.next());
            if (myIter.next() <= 10) {
                myIter.remove();
            }
        }
        // hasNext() -->> check whether you have next item
//        System.out.println("myIter.hasNext() = " + myIter.hasNext());
        // next() -->> will move the pointer of iterator to the next element
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//        myIter.remove();
//        System.out.println("myIter.next() = " + myIter.next());

//        System.out.println("myIter.hasNext() = " + myIter.hasNext());

        System.out.println("nums = " + nums);

    }

}
