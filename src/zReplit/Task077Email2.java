package zReplit;

import java.util.*;

public class Task077Email2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String firstName = email.substring(0, email.indexOf("_")).toLowerCase();
        String capFirstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@")).toLowerCase();
        String capLastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
        String domain = email.substring(email.indexOf("@") + 1, email.indexOf(".")).toLowerCase();
        String topLevelDomain = email.substring(email.indexOf(".") + 1).toLowerCase();

        System.out.println("First name: " + capFirstName);
        System.out.println("Last name: " + capLastName);
        System.out.println("Domain: " + domain);
        System.out.println("Top-Level Domain: " + topLevelDomain);

    }

}
