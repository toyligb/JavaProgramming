package day08;

import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {

        int speedLimit = 60;
        Scanner scan = new Scanner(System.in);

        System.out.print("What is your speed limit?: ");
        int yourCurrentSpeed = scan.nextInt();

        if(yourCurrentSpeed > speedLimit) {
            System.out.println("You will be pulled by police & given ticket!");
        } else {
            System.out.println("Go shopping!");
        }

        System.out.println("The end!");

    }
}
