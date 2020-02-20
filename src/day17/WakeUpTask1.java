package day17;

import java.util.*;

public class WakeUpTask1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();

        int firstSpace = fullName.indexOf(" ");
        fullName = fullName.substring(0,1).toUpperCase() + fullName.substring(1, firstSpace+1).toLowerCase()
                  + fullName.substring(firstSpace+1, firstSpace+2).toUpperCase() + fullName.substring(firstSpace+2).toLowerCase();
        System.out.println("fullName = " + fullName);

    }

}
