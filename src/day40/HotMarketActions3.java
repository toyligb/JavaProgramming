package day40;

public class HotMarketActions3 {

    public static void main(String[] args) {

        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = false;
        o1.salary = 140000;

        o1.displayOfferDetails();
        o1.turnToFullTime();
        o1.displayOfferDetails();
        o1.turnToFullTime();
        o1.changeLocationTo("DC");
        o1.displayOfferDetails();

        o1.changeAllInfo("Amazon", "Virginia", 150000, true);
        //o1.displayOfferDetails();

        // if this guy earns more than 100K
        // move him to Atlanta
//        boolean result = o1.is100KOffer();
//        if (result == true) {
        if (o1.is100KOffer()) {
            o1.changeLocationTo("Atlanta");
        }

        o1.displayOfferDetails();

        o1.toString();

    }

}
