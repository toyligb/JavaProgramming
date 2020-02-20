package zReplit;

import java.util.*;

public class Task100GetSandwich {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        if (str.indexOf("bread") != str.lastIndexOf("bread")) {
            str = str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread"));
            System.out.println(str);
        } else {
            System.out.println("nothing");
        }

    }

}
