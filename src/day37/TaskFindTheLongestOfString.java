package day37;

import java.util.*;

/*
       find longest name in List of String that contains 6 names
 */

public class TaskFindTheLongestOfString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Enter 6 names:");
        for (int i = 0; i < 6; i++) {
            names.add(scan.next());
        }

        System.out.println("names = " + names);

        String longestName = names.get(0);
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() > longestName.length()) {
                longestName = names.get(i);
            }
        }
        System.out.println("longestName = " + longestName);

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() == longestName.length()) {
                System.out.println("Longest names = " + names.get(i));
            }
        }

        for (String each : names) {
            System.out.println("each = " + each);
        }

    }

    // length     :  counting the elements inside array, it's a property of array object
                    // last element of an array :  arr[arr.length-1]
    // length()   :  counting the characters inside String , it's a method of String object
                    // last char of a String :  str.charAt( str.length()-1 )
    // size()     :  counting the elements inside ArrayList object, it's a method of List Object
                    // last element of an arrayList :  lst.get( lst.size()-1 )

}
