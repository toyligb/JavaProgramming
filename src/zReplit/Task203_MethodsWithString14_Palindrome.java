package zReplit;

import java.util.*;

public class Task203_MethodsWithString14_Palindrome {

    public static boolean isPalindrome(String check) {

        check = check.replace(" ", "").toLowerCase();
        String reversed = "";

        for (int i = check.length() - 1; i >= 0; i--) {
            reversed += check.charAt(i);
        }
        return check.equals(reversed);
    }

}
