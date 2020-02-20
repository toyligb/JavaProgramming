package zReplit;

import java.util.*;

public class Task140PrintFirstLastChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] words = {scan.nextLine(), scan.nextLine(), scan.nextLine(),
                scan.nextLine(), scan.nextLine()};

        String[] letters = new String[words.length];

        int i = 0;
        for (String each : words) {
            letters[i] = each.charAt(0) + "" + each.charAt(each.length() - 1);
            i++;
        }

        System.out.println(Arrays.toString(letters));

    }

}
