package zReplit;

import java.util.*;

public class Task119ArraysSplitEmail {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();

        String withOutAt = email.replace("@", "");

        int countOfAt = email.length() - withOutAt.length();

        if (countOfAt == 0 || countOfAt > 1) {
            System.out.println("invalid email");
        } else {
            String[] emailID = email.split("@");
            System.out.println("Email id: " + emailID[0]);
            System.out.println("Email domain: " + emailID[1]);
        }

    }
}
