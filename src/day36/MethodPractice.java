package day36;

import java.util.*;

public class MethodPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scan.next();

        System.out.println(checkIfStringHasNumber(str));

    }

    /**
     * write a static method to accept a String and return Boolean (Yes Uppercase)
     * it should return true if the String contains at least one number.
     * @param str
     * @return true if the String contains at least one number.
     */
    public static Boolean checkIfStringHasNumber(String str) {

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
            if (Character.isDigit(eachChar)) {
                return Boolean.valueOf(true);
            }
        }
        return Boolean.valueOf(false);
    }

}
