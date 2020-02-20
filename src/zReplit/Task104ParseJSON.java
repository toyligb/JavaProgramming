package zReplit;

import java.util.*;

public class Task104ParseJSON {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String json = scan.nextLine();
        String json2 = json;
        String search1 = "\"firstName\"";
        String search2 = "\"lastName\"";

        if (json.contains(search1)) {
            json = json.substring(json.indexOf(search1) + search1.length()+3);
            json = json.substring(0, json.indexOf("\""));
        }
        System.out.println("First name: " + json);

        if (json2.contains(search2)) {
            json2 = json2.substring(json2.indexOf(search2) + search2.length()+3);
            json2 = json2.substring(0, json2.indexOf("\""));
        }
        System.out.println("Last name: " + json2);

    }

}
