package day37;

import java.util.*;

public class WarmUpTask {

    /*
    Warm up:
        Create ArrayList of String and store teamMates
        print one by one
        print reverse
        print first last
        print 2 at a time
        concat everyone in one string separated by -
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<String> teammates = new ArrayList<>();

        System.out.println("How many teammates do you have:");
        int size = scan.nextInt();

        System.out.println("Enter your teammates:");
        for (int i = 0; i < size; i++) {
            teammates.add(scan.next());
        }
        System.out.println("Teammates list = " + teammates);

        System.out.println("=================");

        for (int i = 0; i < teammates.size(); i++) {
            System.out.println("Teammate " + (i + 1) + ". " + teammates.get(i));
        }

        System.out.println("=================");

        for (int i = teammates.size() - 1; i >= 0; i--) {
            System.out.println("Teammate " + (i + 1) + ". " + teammates.get(i));
        }

        System.out.println("=================");

        System.out.println("First teammate: " + teammates.get(0));
        System.out.println("Last teammate: " + teammates.get(teammates.size() - 1));

        System.out.println("=================");

        for (int i = 0; i < teammates.size() - 1; i++) {
            System.out.println((i + 1) + ". " + teammates.get(i) + " / "
                                + (i + 2) + ". " + teammates.get(i + 1));
        }

        System.out.println("=================");

        for (int i = 0; i <= teammates.size()-2; i += 2) {
            System.out.println((i+1) + ". " + teammates.get(i) + " == "
                                + (i+2) + ". "+ teammates.get(i+1));
        }

        System.out.println("=================");

        String fullLst = "";
        for (int i = 0; i < teammates.size(); i++) {
            fullLst += teammates.get(i) + " - ";
        }
        System.out.println("fullLst = " + fullLst.substring(0, fullLst.length() - 2));

        String lstToString = teammates.toString();
        System.out.println("lstToString after replacing = \n"
                            + lstToString.replace(", ", " - ")
                            .replace("[", "").replace("]", ""));

    }

}
