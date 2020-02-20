package day08;

import java.util.Scanner;

public class MultiBranchIfStatement {

    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
        System.out.print("What is your current speed: ");
        int speed = scan.nextInt();

        if(speed > 90) {
            System.out.println("Jail");
        } else if(speed > 80) {
            System.out.println("Reckless driving");
        } else if(speed > 70) {
            System.out.println("Point taken");
        } else if(speed > 60) {
            System.out.println("Warning");
        } else {
            System.out.println("Keep driving");
        }

        System.out.println("The end!");

    }

}
