package day12;

import java.util.Scanner;

public class LoginTest_V2 {

    public static void main(String[] args) {

        String userName = "CyberTek", password = "CybertekSchoolB15";
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String name = scan.next();
        boolean nameCheck = name.equalsIgnoreCase(userName);

        System.out.print("Enter your password: ");
        String userPassword = scan.next();
        boolean passCheck = userPassword.equals(password);

        if (nameCheck && passCheck) {
            System.out.println("Login successfull.");
        } else if (nameCheck) {
            System.out.println("Incorrect password!");
        } else if (passCheck) {
            System.out.println("Incorrect user!");
        } else {
            System.out.println("Not in system!");
        }

    }

}
