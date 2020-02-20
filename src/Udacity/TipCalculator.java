package Udacity;

import java.util.*;

public class TipCalculator {

    /*
    Write a Java function named calculateTip(). The access modifier should be public,
    it should have a return type of double, and it should take as input a double parameter
    representing the cost of a meal at a restaurant. And finally, it should return a double equal
    to 15% of the cost parameter.
    */

    public static double calculateTip(double mealCost) {
        double tip = mealCost * 15/100;
        return tip;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the price of the meal: ");
        double tipp = calculateTip(scan.nextDouble());
        System.out.println("Your tip is: " + tipp);

    }
}
