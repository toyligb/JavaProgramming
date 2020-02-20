package day12;

import java.util.*;

public class WakeUpTest2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of the month: ");
        int month = scan.nextInt();

        if(month < 1 || month > 12) {
            System.out.println("INVALID MONTH!");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Season is SPRING");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Season is SUMMER");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Season is FALL");
        } else {
            System.out.println("Season is WINTER");
        }
        System.out.println("KEEP CODING!");
    }

}
