package day33;

import java.util.*;

public class GettingDaysByNumber {

    public static String getDaysOfTheWeekFromNumber(int dayCode) {

        String weekDay = "";
        switch (dayCode) {
            case 1:
                weekDay = "Monday";
                break;
            case 2:
                weekDay = "Tuesday";
                break;
            case 3:
                weekDay = "Wednesday";
                break;
            case 4:
                weekDay = "Thursday";
                break;
            case 5:
                weekDay = "Friday";
                break;
            case 6:
                weekDay = "Saturday";
                break;
            case 7:
                weekDay = "Sunday";
                break;
            default:
                weekDay = "Funday";
        }

        return weekDay;

    }

    public static String getWeekDay(int dayCode2) {

        String day2 = "";
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"};

        for (int i = 0; i < weekDays.length; i++) {
            if ((i + 1) == dayCode2) {
                day2 = weekDays[i];
            }
        }
        return day2;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day code:");
        int dayNum = scan.nextInt();

        System.out.println("Day of the week is " + getDaysOfTheWeekFromNumber(dayNum));

        System.out.println("Enter day code (second version):");
        int dayNum2 = scan.nextInt();

        System.out.println("Day of the week is " + getWeekDay(dayNum2));

    }

}
