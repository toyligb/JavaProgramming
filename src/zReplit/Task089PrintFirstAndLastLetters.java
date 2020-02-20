package zReplit;

import java.util.Scanner;

public class Task089PrintFirstAndLastLetters {

    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        System.out.println(word.charAt(0) + "" + word.charAt(word.length()-1));

    }

}
