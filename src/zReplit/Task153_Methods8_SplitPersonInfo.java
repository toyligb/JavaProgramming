package zReplit;

import java.util.*;

public class Task153_Methods8_SplitPersonInfo {

    public static void person(String info) {

        String[] personData = info.split(",");
        System.out.println("person name: " + personData[0]
                            + " last name: " + personData[1]
                            + " age: " + personData[2]);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        person(s);

    }

}
