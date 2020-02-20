package day35;

import java.util.*;

public class WrapperReview {

    public static void main(String[] args) {

        Integer i1 = new Integer(1000000000);
        Integer i2 = Integer.valueOf(123);
        // is i3 primitive type variable
        // is i3 reference type variable
        Integer i3 = 45; // --->> new Integer(45); primitive wrapped up and
                         // making it object, autoboxing
        int i4 = 54;
        // Auto unboxing: wrapper type to primitive type conversion
        int i5 = new Integer(100);
        // int i3 = 45 --->> Stack    -    Integer i3 = 45 --->> Heap

        // AUTO BOXING AND UNBOXING IS UNIQUE FEATURE
        // OF CONVERSION BETWEEN PRIMITIVE VALUE WRAPPER CLASSES OBJECTS
        System.out.println(i1 + i2);

    }

}
