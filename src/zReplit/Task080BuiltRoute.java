package zReplit;

import java.util.*;

public class Task080BuiltRoute {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();
        String AB = "right";
        String BC = "down";
        String CD = "left";
        String DA = "up";

        if (start.equalsIgnoreCase(end)) {
            System.out.println(end + " found");
        } else if (start.equalsIgnoreCase("A") && end.equalsIgnoreCase("B")) {
            System.out.println(AB + ": " + end + " found");
        } else if (start.equalsIgnoreCase("A") && end.equalsIgnoreCase("C")) {
            System.out.println(AB + " > " + BC + ": " + end + " found");
        } else if (start.equalsIgnoreCase("A") && end.equalsIgnoreCase("D")) {
            System.out.println(AB + " > " + BC + " > " + CD + ": " + end + " found");
        } else if (start.equalsIgnoreCase("B") && end.equalsIgnoreCase("C")) {
            System.out.println(BC + ": " + end + " found");
        } else if (start.equalsIgnoreCase("B") && end.equalsIgnoreCase("D")) {
            System.out.println(BC + " > " + CD + ": " + end + " found");
        } else if (start.equalsIgnoreCase("B") && end.equalsIgnoreCase("A")) {
            System.out.println(BC + " > " + CD + " > " + DA + ": " + end + " found");
        } else if (start.equalsIgnoreCase("C") && end.equalsIgnoreCase("D")) {
            System.out.println(CD + ": " + end + " found");
        } else if (start.equalsIgnoreCase("C") && end.equalsIgnoreCase("A")) {
            System.out.println(CD + " > " + DA + ": " + end + " found");
        } else if (start.equalsIgnoreCase("C") && end.equalsIgnoreCase("B")) {
            System.out.println(CD + " > " + DA + " > " + AB + ": " + end + " found");
        } else if (start.equalsIgnoreCase("D") && end.equalsIgnoreCase("A")) {
            System.out.println(DA + ": " + end + " found");
        } else if (start.equalsIgnoreCase("D") && end.equalsIgnoreCase("B")) {
            System.out.println(DA + " > " + AB + ": " + end + " found");
        } else {
            System.out.println(DA + " > " + AB + " > " + BC + ": " + end + " found");
        }

    }

}
