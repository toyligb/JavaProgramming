package day38;

import java.util.*;

public class ReversingAList {

    public static void main(String[] args) {

        // reversing an ArrayList object

        List<Integer> nums1 = new ArrayList<>(Arrays.asList(200, 100, 700, 400, 500));
        System.out.println("bashdaky nums1 = " + nums1);

        // 200, 100, 700, 400, 500
        // after reversing
        // 500, 400, 700, 100, 200
        Collections.reverse(nums1);
        System.out.println("tersden yazylan nums1 = " + nums1);

        // after sorting in reverse order line 15
        // 700, 500, 400, 200, 100
        Collections.sort(nums1, Collections.reverseOrder()); // OR Comparator.reverseOrder();
        System.out.println("tersden sort edilip yazylan nums1 = " + nums1);

    }

}
