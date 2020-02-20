package day22;

import java.util.*;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        System.out.println("Enter number:");
//        int num = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Multiplication Table of " + i);
            for (int j = 1; j <= 12; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }

        }

    }

}
