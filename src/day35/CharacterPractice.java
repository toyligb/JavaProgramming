package day35;

import java.util.*;

public class CharacterPractice {

    public static void main(String[] args) {

        System.out.println("IS DIGIT METHOD PRACTICE:");
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit(' '));
        System.out.println(Character.isDigit('7'));

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scan.nextLine();

        // Get the number out of this String
        // and store it into Integer variable x;
        System.out.println("Sum of the numbers in your string is = " + sumOfNumsFromString(str));

    }

    public static int sumOfNumsFromString(String str) {

        String numsInStr = "";
        int sumOfNumbers = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                System.out.println("str.charAt(" + i + ") = " + str.charAt(i));
                numsInStr += str.charAt(i);
                sumOfNumbers += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println("numsInStr = " + numsInStr);
        Integer num = Integer.valueOf(numsInStr);
        System.out.println("num = " + num);
        System.out.println("sumOfNumbers = " + sumOfNumbers);
//        String[] splittedNum = numsInStr.split("");
//        System.out.println(Arrays.toString(splittedNum));

        return sumOfNumbers;
    }

}
