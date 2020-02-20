package home_tasks;

import java.util.*;

public class Task5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name with prefix:");
        String fullName = scan.nextLine();

        if (fullName.toUpperCase().startsWith("DR")) {
            System.out.println("Doctor");
        } else if (fullName.toUpperCase().startsWith("MR")) {
            System.out.println("Male");
        } else if (fullName.toUpperCase().startsWith("MISS") || fullName.toUpperCase().startsWith("MS")) {
            System.out.println("Single female");
        } else if (fullName.toUpperCase().startsWith("MRS")) {
            System.out.println("Married female");
        } else {
            System.out.println("Unidentified prefix");
        }

    }

}
