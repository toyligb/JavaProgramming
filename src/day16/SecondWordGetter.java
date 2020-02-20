package day16;

import java.util.*;

public class SecondWordGetter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String sentence = scan.nextLine();

        int firstSpaceIndex = sentence.indexOf(" ");
        int secondSpaceIndex = sentence.indexOf(" ", firstSpaceIndex+1);

        String secondWord = sentence.substring(firstSpaceIndex+1, secondSpaceIndex);
        System.out.println("secondWord = " + secondWord);

    }

}
