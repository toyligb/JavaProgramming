package day11;

import java.util.*;

public class ScoreChecker {

    public static void main(String[] args) {

        int score;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score: ");
        score = scan.nextInt();

        if( score < 0 || score > 100) {
            System.out.println("INVALID SCORE!");
        } else if ( score >= 0 && score < 50) {
            System.out.println("YOU HAVE FAILED!");
        } else if ( score >= 50 && score < 70) {
            System.out.println("LITTLE BIT MORE STUDY!");
        } else if ( score >= 70 && score < 100) {
            System.out.println("YOU HAVE PASSED!");
        } else {
            System.out.println("PERFECT SCORE!");
        }

    }

}
