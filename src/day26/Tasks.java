package day26;

import java.util.*;

public class Tasks {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[]{56, 133, 7, -150, 9, 12, 92, 205, 111};

        System.out.println(Arrays.toString(numbers));
        int count = 0;
        System.out.println("What number do you want to find:");
        int findNumber = scan.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 100) {
                System.out.println(numbers[i] + " is larger than 100");
            }
            if (numbers[i] == findNumber) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Count of " + findNumber + " is = " + count);
        } else {
            System.out.println("Count of " + findNumber + " is = " + count);
            System.out.println("Number of items in Array is " + numbers.length);
        }
        System.out.println("Before swap: " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        System.out.println("After swap: " + Arrays.toString(numbers));

        scan.nextLine();

        System.out.println("Enter a sentence:");
        String sentence = scan.nextLine();
        String[] words = sentence.split(" ");

        System.out.println("sentence = " + Arrays.toString(sentence.toCharArray()));
        System.out.println("Before swap words = " + Arrays.toString(words));

        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }
        System.out.println("After swap words = " + Arrays.toString(words));

        for (int i = 0; i < words.length; i++) {
            char[] eachLetter = words[i].toCharArray();
            for (int y = 0; y < eachLetter.length / 2; y++) {
                char temp = eachLetter[y];
                eachLetter[y] = eachLetter[eachLetter.length - 1 - y];
                eachLetter[eachLetter.length - 1 - y] = temp;
            }
            System.out.println("eachLetter = " + Arrays.toString(eachLetter));
        }
        System.out.println("Before swap words = " + Arrays.toString(words));

        for (int i = 0; i < words.length; i++) {
            String reverse = "";
            for (int j = words[i].length()-1; j >= 0; j--) {
                reverse += words[i].charAt(j);
            }
            words[i] = reverse;
        }
        System.out.println("after swapped letters words = " + Arrays.toString(words));
    }

}
