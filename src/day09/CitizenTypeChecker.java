package day09;

import java.util.Scanner;

public class CitizenTypeChecker {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String cityzenType;
        int age;

        System.out.print("Enter your age: ");
        age = scan.nextInt();

        if(age > 65) {
            cityzenType = "Senior";
        } else {
            cityzenType = "Not-Senior";
        }

        System.out.println("The citizen age is " + age + ", he/she is " + cityzenType + ".");

    }
}
