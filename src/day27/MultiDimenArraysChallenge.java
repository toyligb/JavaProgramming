package day27;

import java.util.*;

public class MultiDimenArraysChallenge {

    public static void main(String[] args) {

        String[] developersTeam = {"Vlad", "Hasan", "Tolkun", "Abide"};
        String[] testersTeam = {"Zhibekchach", "Mohammed Sohrabi", "Nursultan"};
        String[] businessAnalystTeam = {"Lisa", "Ershad", "Naila"};

        String[][] scrumTeam = {developersTeam, testersTeam, businessAnalystTeam};

        int maxLength = scrumTeam[0][0].length();
        String maxLengthWord = "";

        for (String eachArr[] : scrumTeam) {
            for (String eachPerson : eachArr) {
                if (eachPerson.length() > maxLength) {
                    maxLength = eachPerson.length();
                    maxLengthWord = eachPerson;
                }
            }
        }
        System.out.println("maxLength = " + maxLength);
        System.out.println("maxLengthWord = " + maxLengthWord);
        maxLengthWord = "Toyly";

        System.out.println(Arrays.deepToString(scrumTeam));

    }

}
