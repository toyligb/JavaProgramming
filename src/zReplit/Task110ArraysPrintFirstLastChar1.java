package zReplit;

import java.util.*;

public class Task110ArraysPrintFirstLastChar1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] words = {scan.nextLine(), scan.nextLine(), scan.nextLine(), scan.nextLine(), scan.nextLine()};

//        for (int i = 0; i < words.length; i++) {
//            for (int j = 0; j < words[i].length(); j++) {
//                System.out.println(words[i].charAt(j) + "" + words[i].charAt(words[i].length() - 1));
//                break;
//            }
//
//        }

        for (int i = 0; i < 5; i++) {
            System.out.println("" + words[i].charAt(0) + words[i].charAt(words[i].length()-1));
        }
    }

}
