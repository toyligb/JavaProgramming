package day06;

    import java.util.Scanner;

public class UsingNextLine {

    public static void main(String[] args) {
        // Task 4
        // use nextLine to ask your bio
        // whats your name
        // which city you live in , including state , Tyson, VA
        // What is your street address

        Scanner scan = new Scanner(System.in);

        System.out.print("What is your full name: ");
        String fullName = scan.nextLine();

        System.out.print("What is your address: ");
        String address = scan.nextLine();

        System.out.println("Clients name: " + fullName);
        System.out.println("Clients address: " + address);

    }
}