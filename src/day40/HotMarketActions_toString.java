package day40;

import java.util.ArrayList;

public class HotMarketActions_toString {

    public static void main(String[] args) {

        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = true;
        o1.salary = 140000;

        Offer o2 = new Offer();
        o2.company = "Google";
        o2.location = "Boston";
        o2.isFullTime = true;
        o2.salary = 120000;

        Offer o3 = new Offer();
        o3.company = "Intel";
        o3.location = "Folsom";
        o3.isFullTime = true;
        o3.salary = 950000;

        ArrayList<Offer> myOffers = new ArrayList<>();
        myOffers.add(o1);
        myOffers.add(o2);
        myOffers.add(o3);

        System.out.println("myOffers = " + myOffers);

    }

}
