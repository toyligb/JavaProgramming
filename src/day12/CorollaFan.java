package day12;

import java.util.*;

public class CorollaFan {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int carPrice, budget;
        String carBrand;

        System.out.print("Enter the Car Brand: ");
        carBrand = scan.next();

        System.out.print("Enter the Car Price: ");
        carPrice = scan.nextInt();

        System.out.print("Enter your Budget: ");
        budget = scan.nextInt();

        if (carBrand.equals("Corolla") || carBrand.equals("Tesla") && budget >=60000) {
            System.out.println("Car acquired!");
        } else {
            System.out.println("Not what I look for.");
        }

    }

}
