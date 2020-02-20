package day22;

import java.util.*;

public class CanvasDayModuleLinkGenerator {

//    Here is the direct links to lead you to correct days
//    https://learn.cybertekschool.com/courses/278/modules#3317
//    this will lead you to day 21
//    https://learn.cybertekschool.com/courses/278/modules#3318
//    this will lead you to day 22
//    https://learn.cybertekschool.com/courses/278/modules#3319
//    this will lead you to day 23
//    https://learn.cybertekschool.com/courses/278/modules#3320
//    this will lead you to day 24
//    and so on So write a program to generate the links to
//    lead you to the right module of the day from day 21 all the way till day 56

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String baseURL = "https://learn.cybertekschool.com/courses/278/modules#";
        String dayMsg = "this will lead you to day ";
        int linkNo = 3297;

        System.out.println("Here is the direct links to lead you to correct days");

        for (int day = 1; day <= 56; day++) {
            System.out.println(baseURL + linkNo);
            System.out.println(dayMsg + day);
            linkNo++;
        }

    }

}
