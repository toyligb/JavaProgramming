package zReplit;

import java.util.*;

public class Task164_MethodsWithReturn2_Max {

    public static void main(String[] args) {

        System.out.println(max(11, 10));

    }

    public static int max(int x, int max) {

//        if (x > max) {
//            return max;
//        } else {
//            return x;
//        }
        return (x > max)? max : x;
    }

}
