package day40;

import java.util.ArrayList;

public class HotMarketActions2 {

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
        o3.salary = 95000;
        o3.displayOfferDetails();

        Offer o4 = new Offer();
        o4.displayOfferDetails();

        // Add 2K to the Intel offer
        // o3.salary = 95000 + 2000;

        o3.salary += 2000;
        System.out.println("New Intel Salary = " + o3.salary);

        // set the salary value of o4 offer object to sum of all the offers
        o4.salary = o1.salary + o2.salary + o3.salary;
        o4.displayOfferDetails();

        o4.turnToFullTime();
        o4.displayOfferDetails();
        o4.turnToFullTime();
        o4.changeLocationTo("DC");
        o4.displayOfferDetails();

    }

}
