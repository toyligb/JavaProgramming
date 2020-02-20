package home_tasks;

import java.util.*;

public class Task2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your search:");
        String searchKeyword = scan.nextLine();
        String firstWord = searchKeyword.substring(0, searchKeyword.indexOf(" "));
        String tabTitle = firstWord + " - Google Search";
        System.out.println(tabTitle);

    }

}
