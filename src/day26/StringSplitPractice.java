package day26;

import java.util.*;

public class StringSplitPractice {

    public static void main(String[] args) {

        String students1 = "Abbos, Zulyar, Zhibek, Hasan, Muge, Orhan, Susan";

        String[] eachName = students1.split(", ");

        for (int i = 0; i < eachName.length; i++) {
            for (int j = 0; j < eachName[i].length(); j++) {
                System.out.print(eachName[i].charAt(j) + " -->> ");
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(eachName));

        String students = "";
        Scanner scan = new Scanner(System.in);
        String response = "";
        do {
            System.out.println("Enter Student Name: ");
            students += scan.nextLine() + ", ";
            System.out.println("Add More?");
            response = scan.nextLine();
        } while (response.equalsIgnoreCase("yes"));

        // spell the name of each person in this format
        // A-b-b-o-s ....
        // optionally: count the number of "a"

        String[] studentsArray = students.split(", ");
        System.out.println(Arrays.toString(studentsArray));

        for (int i = 0; i < studentsArray.length; i++) {
            String spelling = "";
            int countOfA = 0;
            for (int j = 0; j < studentsArray[i].length(); j++) {
                if (j == studentsArray[i].length() - 1) {
                    spelling += studentsArray[i].charAt(j);
                } else {
                    spelling += studentsArray[i].charAt(j) + "-";
                }
                if (studentsArray[i].charAt(j) == 'a' || studentsArray[i].charAt(j) == 'A') {
                    ++countOfA;
                }
            }
            if (countOfA == 0) {
                System.out.println(studentsArray[i] + ":  " + spelling + " || There is no \"a\" in " +
                        studentsArray[i]);
            } else {
                System.out.println(studentsArray[i] + ":  " + spelling + " || Count of \"a\" in " +
                        studentsArray[i] + " is: " + countOfA);
            }

        }

    }

}
