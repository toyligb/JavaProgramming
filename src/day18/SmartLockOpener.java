package day18;

import java.util.*;

public class SmartLockOpener {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("KNOCK KNOCK!!!");
        System.out.println("Enter password:");
        String password = scan.next();

        int attemptCount = 1;

        while (!password.equals("B15")) {

            System.out.println("You attempt count is : " + attemptCount);
            if (attemptCount == 3) {
                System.out.println("LOCKED OUT !!!!!!!");
                return; // this is used to exit from the method here!!!
            }

            System.out.println("WRONG PASSWORD!! TRY AGAIN!!");
            password = scan.next();
            ++attemptCount;

        }

        System.out.println("OPEN SESEAME !!!");

    }

}
