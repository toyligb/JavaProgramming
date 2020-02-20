package day37;

import java.util.*;

public class ArrayListRemoveItemPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> lst = new ArrayList<>();
        lst.add(2);
        lst.add(14);
        lst.add(34);
        lst.add(41);
        lst.add(19);
        System.out.println("lst = " + lst);

        lst.remove(3);
        System.out.println("After deleting item at index 3 = " + lst);

//        lst.remove(new Integer(2));
//        System.out.println("After deleting item value of which is 2 = " + lst);

        lst.remove(Integer.valueOf(2));
        System.out.println("lst = " + lst);

    }

}
