package office_hour;

import java.util.*;

public class Task106ByMykyta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = scan.nextLine();
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'
                    || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                result += word.charAt(i);
                System.out.print(word.charAt(i));
            }
        }
        System.out.println("\nresult = " + result);
    }
}
