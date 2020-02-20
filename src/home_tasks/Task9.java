package home_tasks;

import java.util.*;

public class Task9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a valid URL:");
        String url = scan.next();

        int firstDot = url.indexOf('.');
        int lastDot = url.lastIndexOf('.');
        String nameOfWebSite = url.substring(firstDot+1, lastDot);
        System.out.println("Index of first Dot is: " + firstDot);
        System.out.println("Index of last Dot is: " + lastDot);
        System.out.println("nameOfWebSite = " + nameOfWebSite);

    }

}
