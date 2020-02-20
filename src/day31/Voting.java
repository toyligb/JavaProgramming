package day31;

public class Voting {

    public static void checkEligibility(int age) {

        if (age > 18) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are not eligible to vote!");
        }

    }

    public static void main(String[] args) {

        checkEligibility(19);
        checkEligibility(13);
        checkEligibility(90);

        int myAge = 37;

        checkEligibility(myAge);

    }

}
