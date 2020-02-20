package day06;

import java.util.Scanner;

public class RemainderOperator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //System.out.println(5 % 2);  // galyndyny gorkezyar, yagny 1

        int minute, hour;

        System.out.print("Enter the minutes: ");
        minute = scan.nextInt();

        hour = minute / 60;

        System.out.print(minute + " minutes is " + hour + " hours and " + minute % 60);

    }
}