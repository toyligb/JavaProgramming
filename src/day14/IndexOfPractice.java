package day14;

import java.util.*;

public class IndexOfPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println(fullName.indexOf("Y"));
        System.out.println(fullName.lastIndexOf("ly"));
        System.out.println(fullName.lastIndexOf('g'));

    }

}
