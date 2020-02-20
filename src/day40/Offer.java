package day40;

/*
    *   Create Offer class with instance fields :
        location, company, salary , isFullTime
        instance methods : displayOfferDetails -- print all info about offers
        Create 5 offer objects with your ideal offers with all details,
        call displayOfferDetails method on each of them
        Optionally : @channel
        Store them into List<Offer> then call the method.
        Optionally :
        Add 5000 to each offers less than 100K
 */

public class Offer {

    String location;
    String company;
    int salary;
    boolean isFullTime;
    int offerCount;

    public void displayOfferDetails() {

        System.out.println("Company: " + company + " | " +
                "Location: " + location + " | " +
                "Desired salary: $" + salary + " | " +
                "Is Full Time?: " + isFullTime);

    }

    public void add5000() {

        if (salary < 100000) {
            salary += 5000;
        }

        System.out.println("Salary after adding 5000: " + salary);

    }

    // Write a method called turnToFullTime
    public void turnToFullTime() {

        if (isFullTime == false) {
            isFullTime = true;
        } else {
            System.out.println("Already Full Time.");
        }

    }

    // Write a method to change the location of the Offer
    // to the location user passed

    public void changeLocationTo(String newLocation) {

        location = newLocation;

    }

    // Write a method to accept 4 parameters to change all info
    // about offers
    public void changeAllInfo(String newCompany, String newLocation, int newSalary, boolean newIsFullTime) {

        company = newCompany;
        location = newLocation;
        salary = newSalary;
        isFullTime = newIsFullTime;
        // Since we already have functionality to display information
        // we called it here to display new information after modifying
        displayOfferDetails();

    }

    // Write a method to check the offer belong to 100K club
    // and return the result as true or false

    /**
     * a method to check the offer belong to 100K club
     * @return true if salary is more than 100K, false if not
     */
    public boolean is100KOffer() {
        // salary >= 100000 already generate a boolean result
        // so we can directly return that result
        return salary >= 100000;

    }

    // Create an instance method called toString
    // has no parameter
    // return String representation of Offer Object
    // in below format:
    // [Company: Amazon , Location: Atlanta | Desired salary: $150000 | Is Full Time?: true]

    public String toString() {

        return "[ Company: " + company + " | " +
                "Location: " + location + " | " +
                "Desired salary: $" + salary + " | " +
                "Is Full Time?: " + isFullTime + " ]";

    }

}
