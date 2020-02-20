package day38;

import java.util.*;

public class RetainAllPractice {

    public static void main(String[] args) {

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(100);
        nums1.add(200);
        nums1.add(300);
        nums1.add(400);
        nums1.add(500);
        nums1.add(600);
        System.out.println("nums1 = " + nums1);

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(200, 300, 600, 700, 800));
        System.out.println("nums2 = " + nums2);

        System.out.println("Does num1 has same elements as nums2 = " + nums1.equals(nums2));

        nums1.retainAll(nums2); // retainAll dine menzesh bahalary alyp galyar
        System.out.println("nums1 = " + nums1);

        nums2.retainAll(nums1);
        System.out.println("nums2 = " + nums2);

        // iki List object-inde shol bir value barmy bilmek uchin .equals method ulanylyar
        // order is important
        System.out.println("Does num1 has same elements as nums2 = " + nums1.equals(nums2));

    }

}
