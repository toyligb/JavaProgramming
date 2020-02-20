package zReplit;

import java.util.Scanner;

public class SecondsConverter {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int inputSeconds, hours, minutes, seconds;

        System.out.println("Enter seconds:");
        inputSeconds = scan.nextInt();

        hours = inputSeconds / 3600;
        minutes = (inputSeconds % 3600) / 60;
        seconds = inputSeconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);

    }
}
