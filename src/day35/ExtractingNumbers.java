package day35;

import java.util.*;

public class ExtractingNumbers {

    public static void main(String[] args) {
        String str = "A123b3W423cc4523B $$ aa 77J JsG8 2347SDFSJF";
        String nums = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            if (Character.isDigit(str.charAt(i))) {
                nums += str.charAt(i);
            }
        }
        System.out.println(nums);

        System.out.println(getNumbers(str));

    }

    public static int getNumbers(String str) {
        String numbers = "";
        char[] eachCharArr = str.toCharArray();
        for (char each : eachCharArr) {
            if (Character.isDigit(each)) {
                numbers += each;
            }
        }
        return Integer.parseInt(numbers);
    }

}
