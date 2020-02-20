package office_hour;

import java.util.Scanner;

public class Practice_11_19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        scan.nextLine();
        System.out.print("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Your full name is " + fullName + ", your age is " + age);

    }

}
