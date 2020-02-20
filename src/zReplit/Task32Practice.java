package zReplit;

import java.util.*;

public class Task32Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inputSeconds, hours, minutes, seconds;

        System.out.println("Enter seconds:");
        inputSeconds = scan.nextInt();

        hours = inputSeconds / 3600;  // 1    remainder 95
        minutes = (inputSeconds % 3600) / 60;  // 95/60 = 1   remainder 35 seconds
        seconds = inputSeconds % 60;

        System.out.println("hours = " + hours);
        System.out.println("minutes = " + minutes);
        System.out.println("seconds = " + seconds);

    }
}
