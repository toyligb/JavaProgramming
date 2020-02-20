package day40;

import java.util.*;

public class HotMarketActions {

    public static void main(String[] args) {

        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = true;
        o1.salary = 140000;
        o1.displayOfferDetails();

        Offer o2 = new Offer();
        o2.company = "Google";
        o2.location = "Boston";
        o2.isFullTime = true;
        o2.salary = 120000;
        o2.displayOfferDetails();

        Offer o3 = new Offer();
        o3.company = "Intel";
        o3.location = "Folsom";
        o3.isFullTime = true;
        o3.salary = 950000;
        o3.displayOfferDetails();

        Offer o4 = new Offer();
        // if we don't assign values for instance filed | variable
        // we get default value
        // for primitive numbers: 0 or 0.0
                // boolean: false
                // char: ''
        // for any reference types:
                // null
        o4.displayOfferDetails();

        ArrayList<Offer> myOffers = new ArrayList<>();
        myOffers.add(o1);
        myOffers.add(o2);
        myOffers.add(o3);
        myOffers.add(o4);

        System.out.println("\n==== MY OFFERS ====");
        for (Offer each : myOffers) {
            each.displayOfferDetails();
        }

        System.out.println("\n==== MY OFFERS with for loop ====");

        for (int i = 0; i < myOffers.size(); i++) {

            // store each item to a variable each
            Offer each = myOffers.get(i);
            each.displayOfferDetails();
            // This is the one shot version
            //myOffers.get(i).displayOfferDetails();

        }

    }

}
