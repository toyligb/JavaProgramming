package day26;

import java.util.Arrays;

public class SplitPractice {

    public static void main(String[] args) {

        // 2 additional String methods related to array
        // toCharArray() , another is split(bySomething)

        String survey = "Complete B15 Online 1 Month Survey";

        char[] surveyChars = survey.toCharArray();
        System.out.println("Before surveyChars: " + Arrays.toString(surveyChars));

        Arrays.sort(surveyChars);

        System.out.println("After surveyChars: " + Arrays.toString(surveyChars));

//        for (char eachItem : surveyChars) {
//            System.out.println("eachItem = " + eachItem);
//        }
//        System.out.println("=========");
//
//        int x = 0;
//        while (x < surveyChars.length) {
//            System.out.println("Each char is = " + surveyChars[x]);
//            x++;
//        }
//        System.out.println("==== for loop ====");
//        for (int i = 0; i < surveyChars.length; i++) {
//            System.out.println("Each char is = " + surveyChars[i]);
//        }
//
//        System.out.println("========= do while");
//
//        int y = 0;
//        do {
//            System.out.println("Each char is = " + surveyChars[y]);
//            y++;
//        } while (y < surveyChars.length);

    }

}
