package day08;

import java.util.Scanner;

public class WarmUpTask {

    public static void main(String[] args) {

        int age;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        age = scan.nextInt();

        if(age >= 18) {
            System.out.println("You can vote!!! Whooolaaa");
        } else {
            System.out.println("Wait until you are 18!!! Not Whooolaaa");
        }

    }

}
