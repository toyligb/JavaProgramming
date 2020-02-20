package day06;

import java.util.Scanner;

public class ScannerPractices {

    public static void main(String[] args) {

        double regularPrice, salePrice, discount;
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the regular price?: ");
        regularPrice = scan.nextDouble();

        System.out.print("What is the discount?: ");
        discount = scan.nextDouble();

        salePrice = regularPrice - regularPrice * discount;

        System.out.println("Sale price is: $" + salePrice);

    }

}
