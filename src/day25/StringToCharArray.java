package day25;

import java.util.Arrays;
import java.util.*;

public class StringToCharArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();

        char[] myName = fullName.toCharArray();
        System.out.println("myName = " + Arrays.toString(myName));

        for (char eachLetter : myName) {
            System.out.println("eachLetter = " + eachLetter);
        }

        int countA = 0;

        for (int i = 0; i < myName.length; i++) {
            if (myName[i] == 'a') {
                countA++;
            }
        }

        System.out.println("countA = " + countA);

        Arrays.sort(myName);
        System.out.println("Sorted letters of my name = " + Arrays.toString(myName));

//        String myName = scan.nextLine();
//        char[] myNamesChars = myName.toCharArray();
//        int count = 0;
//
//        for (char eachChar : myNamesChars) {
//            System.out.println("eachChar = " + eachChar);
//            if (eachChar == 'a') {
//                count++;
//            }
//        }
//        System.out.println("count = " + count);
//
//        Arrays.sort(myNamesChars);
//        System.out.println("myNamesChars = " + Arrays.toString(myNamesChars));

    }
}
