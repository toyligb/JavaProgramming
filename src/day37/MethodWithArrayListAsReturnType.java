package day37;

import java.util.*;

public class MethodWithArrayListAsReturnType {

    public static void main(String[] args) {

        System.out.println(getListFrom1ToFinalNumber(10));
        System.out.println(getListFrom1ToFinalNumber(5));
        System.out.println(getListFrom1ToFinalNumber(30));

        List<Integer> myList = getListFrom1ToFinalNumber(25);

    }
    // create a method that accept a finalNumber as int
    // return an ArrayList of Integer containing numbers
    // starting from 1 till finalNumber

    /**
     * Method fills array list from 1 to final number
     * @param finalNumber This is the last item of the list
     * @return List<Integer> that contains 1 to final number increased by 1
     */

    public static List<Integer> getListFrom1ToFinalNumber(int finalNumber) {

        List<Integer> nums = new ArrayList<>();
        for (int numbers = 1; numbers <= finalNumber; numbers++) {
            nums.add(numbers);
        }

        return nums;

    }

}
