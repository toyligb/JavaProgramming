package Udacity;

        /*
        Write a Java function called absoluteValue(). The access modifier should be public, it
        should have a return type of double, and it should take one double parameter as input. If
        the double parameter is less than 0, it should return that number negated. Otherwise, it
        should return the parameter unchanged.
         */

import java.util.Scanner;

public class absoluteValue {

    public static double absoluteValueReturn(double x) {
        if ( x < 0) {
            return -x;
        } else {
            return x;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        double x = absoluteValueReturn(scan.nextDouble());
        System.out.println(x);
    }

}
