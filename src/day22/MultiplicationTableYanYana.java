package day22;

import java.util.Scanner;

public class MultiplicationTableYanYana {

    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);

//        System.out.println("Enter number:");
//        int num = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                //System.out.println("Multiplication Table of " + i);
                System.out.print(j + " * " + i + " = " + j * i + "\t\t");
            }
            System.out.println();
        }

    }

}
