package day51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonComparing {

    public static void main(String[] args) {

        Person p1 = new Person("Toyly", 37);
        Person p2 = new Person("Zhibekchach", 17);
        Person p3 = new Person("Asena", 18);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.compareTo(p2));
        System.out.println(p2.compareTo(p3));

        // can we just directly provide Person Object new keyword
        int result = p2.compareTo(new Person("John Snow", 27));
        System.out.println("result = " + result);

        // print out the name of older person between p1 and p3

        if (p1.compareTo(p3) == 1) {
            System.out.println(p1.name);
        } else if (p1.compareTo(p3) == -1) {
            System.out.println(p3.name);
        } else {
            System.out.println(p1.name + " and " + p3.name + " are same age.");
        }

        // compare p1 and p2 by age
        // if p1 is older, print 1
        // if they are same age, print 0
        // if p2 is older, print -1

        int out = Integer.compare(p1.age, p2.age);
        System.out.println("out = " + out);

        List<Person> lst = new ArrayList<>();
        lst.add(p1);
        lst.add(p2);
        lst.add(p3);
        lst.add(new Person("John Snow", 27));
        System.out.println("lst = " + lst);

        // ANYTHING WE SORT MUST BE TYPE OF COMPARABLE
        Collections.sort(lst);
        System.out.println("lst = " + lst);

    }

}
