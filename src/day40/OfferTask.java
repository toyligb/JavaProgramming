package day40;

import java.util.*;

public class OfferTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Offer> allOffers = new ArrayList<>();

        System.out.println("Number of Offers: ");
        int num = scan.nextInt();

        for (int i = 0; i < num; i++) {
            Offer newOffer = new Offer();
            newOffer.offerCount = i + 1;
            System.out.println("Enter Offer " + (i + 1) + " details:");
            scan.nextLine();
            System.out.println("Location: ");
            newOffer.location = scan.nextLine();
            System.out.println("Company: ");
            newOffer.company = scan.nextLine();
            System.out.println("Desired salary: ");
            newOffer.salary = scan.nextInt();
            System.out.println("Is Full Time: ");
            newOffer.isFullTime = scan.nextBoolean();

            allOffers.add(newOffer);

        }

        for (int i = 0; i < num; i++) {
            allOffers.get(i).displayOfferDetails();
            allOffers.get(i).add5000();
        }

    }

}
