package day07;

    import java.util.Scanner;

public class EmailBuilder {

    public static void main(String[] args) {

        String firstName, lastName, company, email;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        firstName = scan.next();
        firstName = firstName.toLowerCase();

        System.out.print("Enter your last name: ");
        lastName = scan.next();
        lastName = lastName.toLowerCase();

        System.out.print("Enter your company name: ");
        company = scan.next();
        company = company.toLowerCase();

        email = firstName + "_" + lastName + "@" + company + ".com";

        System.out.println(email);

    }

}
