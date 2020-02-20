package day09;

import java.util.Scanner;

public class DayPrinter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String weekDay = "";
        int day;
        System.out.print("Enter weekday in number: ");
        day = scan.nextInt();

        switch (day) {
            case 1 : weekDay = "Monday";
                break;
            case 2 : weekDay = "Tuesday";
                break;
            case 3 : weekDay = "Wednesday";
                break;
            case 4 : weekDay = "Thursday";
                break;
            case 5 : weekDay = "Friday";
                break;
            case 6 : weekDay = "Saturday";
                break;
            case 7 : weekDay = "Sunday";
                break;
            default: weekDay = "Unknown day";
                break;
        }
        System.out.println("Day name is: " + weekDay);
    }
}
