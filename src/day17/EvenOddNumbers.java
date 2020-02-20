package day17;

import java.util.Scanner;

public class EvenOddNumbers {

    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter number:");
//        int number = scan.nextInt();
//        int counter = 0;
//
//        System.out.print("Even numbers till your number: ");
//        while (counter <= number) {
//            if (counter % 2 == 0) {
//                System.out.print(counter + " ");
//            }
//            counter++;
//        }
//
//        counter = 0;
//        System.out.println();
//        System.out.print("Odd numbers till your number: ");
//        while (counter <= number) {
//            if (counter % 2 == 1) {
//                System.out.print(counter + " ");
//            }
//            counter++;
//        }
        int num = 0;
        String odd = "", even = "";
        while (num <= 50) {
            if (num % 2 == 0) {
                even += num + " ";
            } else {
                odd += num + " ";
            }
            ++num;
        }
        System.out.println(even);
        System.out.println(odd);

    }

}
