package day32;

import java.util.*;

public class MethodWithReturnTypePractice {

    public static void main(String[] args) {

        System.out.println(divide2Numbers(10, 2.7));
        System.out.println(divide2Numbers(10, 0));

    }

    public static double divide2Numbers(double x, double y) {

        if (y == 0) {
            return 0;
        } else {
            return x / y;
        }

    }



}
