package day38;

import java.util.*;

public class ListObjectEqualityCheck {

    public static void main(String[] args) {

        List<Integer> nums1 = new ArrayList<>(Arrays.asList(200, 300, 600, 700, 800));

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(200, 300, 600, 700, 800));

        List<Integer> nums3 = new ArrayList<>(Arrays.asList(300, 200, 600, 700, 800));

        System.out.println("num1.equals(num2) = " + nums1.equals(nums2));
        System.out.println("num2.equals(num3) = " + nums2.equals(nums3));

    }

}
