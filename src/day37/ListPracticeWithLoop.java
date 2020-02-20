package day37;

import java.util.*;

public class ListPracticeWithLoop {

    public static void main(String[] args) {

        /*
         *   Create an ArrayList of Integer and fill it up with 1 - 100
         */

        List<Integer> nums = new ArrayList<>();
        for (int number = 1; number <= 100; number++) {
            nums.add(number);
        }
        System.out.println("nums = " + nums);

        // Change all the odd number value to 0
        for (int i = 0; i < nums.size(); i += 2) {
            //System.out.println("Odd Values are at index = " + i);
            nums.set(i, 0);
        }
        System.out.println("nums = " + nums);

        // How to find index of value 20 :
        System.out.println("index of 20 = " + nums.indexOf(20));

        // INSERT 100 TO FIRST INDEX :
        nums.add(0, 100);
        System.out.println("nums = " + nums);

        System.out.println("index of 20 after adding 100 = " + nums.indexOf(20));

        List<Integer> lst2 = new ArrayList<>();
        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);

        System.out.println("beginning lst2 = " + lst2);
        // insert 100 right after 34 : WE DO NOT KNOW WHERE IS 34 :
        lst2.add(lst2.indexOf(34) + 1, 100);
        System.out.println("after adding 100 lst2 = " + lst2);

        System.out.println("before five 100 added = " + lst2);
        // add five 100 in front of 44
        for (int i = 0; i < 5; i++) {
            lst2.add(lst2.indexOf(44), 100);
        }
        System.out.println("after five 100 added = " + lst2);

    }

}
