package zReplit;

import java.util.*;

public class Task191_MethodsWithString11_ReverseString {

    public static void main(String[] args) {

        System.out.println(reverse("Turkmenistan"));

    }

    private static String reverse(String text) {

        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return reversed;
    }

}
