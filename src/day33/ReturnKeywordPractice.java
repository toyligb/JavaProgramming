package day33;

import java.util.*;

/*
 *    Create a class called ReturnKeywordPractice with main
 *    calculateAndReturnAge
 *    Write a method accept a birth year and return the age :
 *    the birth year should be within the range of 1900-2020
 *    if not return 0
 *    optionally : test your code against array of birthYears
 *    {1999,122,2019, 1987, 1978,1964,3999, 2004}
 */

public class ReturnKeywordPractice {

    public static int calculateAndReturnAge(int birthYear) {

        int age = 0;
        if (birthYear >= 1900 && birthYear <= 2020) {
            age = 2020 - birthYear;
        }

        return age;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your birth year:");
        int year = scan.nextInt();

        System.out.println("Your age is " + calculateAndReturnAge(year));

        int[] birthYears = {1999, 122, 2019, 1987, 1978, 1964, 3999, 2004};
        int[] ages = new int[8];

        for (int each : birthYears) {
            System.out.println("Birth year " + each + ", age is " + calculateAndReturnAge(each));
        }

        for (int i = 0; i < birthYears.length; i++) {
            ages[i] = calculateAndReturnAge(birthYears[i]);
        }

        System.out.println(Arrays.toString(ages));

    }

}
