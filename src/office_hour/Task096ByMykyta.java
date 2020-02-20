package office_hour;

import java.util.*;

public class Task096ByMykyta {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word / seperator / count:");
        String word = scan.nextLine();
        String sep = scan.next();
        int count = scan.nextInt();
        for (int i = 1; i <= count; i++) {
            if (i != count) {
                System.out.print(word + sep);
            } else {
                System.out.print(word);
            }
        }

    }

}
