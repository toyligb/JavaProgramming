package zReplit;

import java.lang.reflect.Array;
import java.util.*;

public class Task189_MethodsWithArrayList1_DeclaringArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(8);
        nums.add(100);

        ArrayList<String> names = new ArrayList<>();
        names.add("Toyly");
        names.add("Jemal");
        names.add("Kerim");
        names.add("Dursun");

        System.out.println("nums = " + nums);
        System.out.println("names = " + names);

        nums.clear();
        System.out.println("cleared nums = " + nums);

        names.clear();
        System.out.println("cleared names = " + names);

        System.out.println("test() = " + test());

    }

    public static ArrayList<Integer> test() {

        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(5);
        lst.add(7);
        lst.add(100);
        lst.clear();
        return lst;
    }

}
