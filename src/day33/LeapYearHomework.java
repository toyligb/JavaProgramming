package day33;

import java.util.*;

public class LeapYearHomework {

    public static boolean isLeapYear(int year) {

        return (year % 100 == 0 && year % 400 == 0 && year % 4 == 0);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year:");
        int checkYear = scan.nextInt();

        System.out.println(checkYear + " is leap year result is: " + isLeapYear(checkYear));

    }

}
