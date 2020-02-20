package day16;

import java.util.*;

public class StringPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        Task 2:
            When searching from google ,
            it will always show your search keyword in tab name
            for example if you search Java
            your tab title is : Java - Google Search
            Create a program to ask user to
            enter a String with any number of word
            Create a variable called searchKeyword to save user input
            Create another String variable called tabTitle
            assign tabTitle value to searchKeyword +  "- Google Search"
            Check if tabTitle start with your searchKeyword
            and end with - Google Search
            (Assume you don't know tab title is already correct
            in real world , we will capture it with automation)
         */

        System.out.println("Enter keywoard to search:");
        String keyword = scan.nextLine();

        String tabTitle = keyword + " - Google Search";

        if (tabTitle.startsWith(keyword) && tabTitle.endsWith(" - Google Search")) {
            System.out.println("Test passed.");
        } else {
            System.out.println("Test failed.");
        }

    }

}
