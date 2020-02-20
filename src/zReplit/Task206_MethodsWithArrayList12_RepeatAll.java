package zReplit;

import java.util.*;

public class Task206_MethodsWithArrayList12_RepeatAll {

    public static void main(String[] args) {

        ArrayList<Boolean> bools = new ArrayList<>();
        bools.add(true);
        bools.add(false);
        bools.add(false);
        System.out.println("bools = " + bools);
        repeatALL(bools);

    }

    public static void repeatALL(ArrayList<Boolean> lst) {

        lst.addAll(lst);
        System.out.println("lst = " + lst);

    }

}
