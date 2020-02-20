package zReplit;

import java.util.*;

public class Task157_Methods12_Time_Conversion {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());

    }

    public static void timeConversion(String s) {

        if (s.contains("AM")) {
            s = s.replace("AM", "");
            String[] splitted = s.split(":");
            if (splitted[0].equals("12")) {
                splitted[0] = "00";
            }
            s = splitted[0] + ":" + splitted[1] + ":" + splitted[2];
        } else if (s.contains("PM")) {
            s = s.replace("PM", "");
            String[] splitted = s.split(":");
            if (!splitted[0].equals("12")) {
                splitted[0] = Integer.toString(Integer.parseInt(splitted[0]) + 12);
            }
            s = splitted[0] + ":" + splitted[1] + ":" + splitted[2];
        }
        System.out.println(s);
    }

}
