package day36;

import java.util.*;

public class MethodWithWrapperTypes {

    public static void main(String[] args) {

        // i1 is a variable with data type Integer
        // and it can store integer object
        // what's deal here with 12? --->> autoboxing
        Integer i1 = 12;
        Integer i2 = 20;

        sumAndPrint(i1, i2);

        // we directly passed int
        // knowing that autoboxing can take care of converting to object
        // if not specified otherwise, this is recommended
        sumAndPrint(23, 10);
        sumAndPrint(new Integer(23), new Integer(10));
        sumAndPrint(Integer.valueOf(23), Integer.valueOf(10));

        System.out.println("==== Method with int parameter ====");
        printTheDoubledValue(10);

        // Why we can pass Integer Object to a method that accept int
        // It will turn it into int by the power of auto-unboxing
        printTheDoubledValue(new Integer(10));

    }

    private static void printTheDoubledValue(int x) {
        System.out.println("After doubling x = " + (x*2));
    }

    private static void sumAndPrint(Integer num1, Integer num2) {

        System.out.println(num1 + num2);

    }

}
