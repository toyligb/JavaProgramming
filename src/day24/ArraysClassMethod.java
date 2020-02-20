package day24;

import java.util.Arrays;

public class ArraysClassMethod {
    public static void main(String[] args) {

        // for printing the content of the array
        // toString --->> Arrays.toString(yourArrayHere)
        // This method will give you string representation of any type of array
        // the result will look --->> [item1, item2, item3, ......, lastItem]
        String[] superHeros = {"Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash"};
        System.out.println(Arrays.toString(superHeros));
        // saving the string result into a cariable and print
        String superHerosAsString = Arrays.toString(superHeros);
        System.out.println(superHerosAsString);
        System.out.println(superHerosAsString.charAt(0));

        int[] numbers = {10, 44, 55, 3, 78};
        System.out.println("Arrays to numbers:");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers).charAt(1));

        double[] nums = {3.45, 5.12, 1.44};
        String dobNums = Arrays.toString(nums);
        for (int i = 0; i < dobNums.length(); i++) {
            System.out.println("Index " + i + " is -->> " + dobNums.charAt(i));
        }

    }
}
