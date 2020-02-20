package day60.collections_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

// a class extends another class
// an interface extends another interface
// a class implements one or more interfaces

public class CollectionIntro {

    public static void main(String[] args) {

        //List<String> names = new ArrayList<>();
        // and ArrayList implements List interface
        // So we can safely say ArrayList IS-A Collection
        // List is the only data structure that have index(order),
        // none of the other data structure has index
        Collection<String> names = new ArrayList<>();
        // with this assignment we can access only what Collection interface have
        // so we can learn what any type of Collection including Set, Queue, List have in common
        names.add("Hasan");
        names.add("Sevim");
        names.add("Kerim");
        names.add("Dursun");
        names.add("Jemal");
        names.add("Daria");
        names.add("Yazsoltan");

        names.addAll(names);

        //names.remove("Hasan");
        names.removeAll(Arrays.asList("Hasan"));

        // quickly generating a type of List object and assign it to super type Collection:
        Collection<String> toRemoveLst = Arrays.asList("Sevim");
        names.removeAll(toRemoveLst);

//        System.out.println("names = " + names);
//
//        for (String eachName : names) {
//            System.out.println("each = " + eachName);
//        }

        //System.out.println("First item " + names.get(0));
        // optionally: this is how we can use forEach method to print everything in one shot
        names.forEach(each -> System.out.println("each = " + each));

    }

}

/*
* The word Collection everywhere:
* Collection Framework -->> referring entire things, entire topic
* Collection Interface -->> one interface under the entire Collection Framework
* Collections class -->> (it has s at the end, just like Array and Arrays)
*                   -->> is a utility class with many static methods
*               for example: Collections.sort(your collection object)
 */
