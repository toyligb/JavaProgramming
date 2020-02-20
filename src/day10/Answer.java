package day10;

import java.util.Scanner;

public class Answer {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String myAnswer = "";
        System.out.println("Enter a number:");
        int yourNumber = scan.nextInt();

        if(yourNumber%5 == 0) {
            myAnswer = "Fizz number";
        } else {
            myAnswer = "Not fizz number";
        }

        System.out.println("Your number is " + yourNumber + " and it is " + myAnswer);

    }

}
