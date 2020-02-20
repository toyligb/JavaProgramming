package zReplit;

import java.util.*;

public class Task101EqualsJavaPython {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
//        int countJ = 0;
//        int countP = 0;
//
//        for (int i = 0; i < sentence.length()-3; i++) {
//            if (sentence.substring(i, i+4).contains("java")) {
//                countJ++;
//            }
//        }
//        for (int j = 0; j < sentence.length() - 5; j++) {
//            if (sentence.substring(j, j+6).contains("python")) {
//                countP++;
//            }
//        }
//
//        boolean out = (countJ == countP) ? true : false;
//        System.out.println(out);

        int countJava = 0;
        int countPython = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.substring(i).startsWith("java")) {
                countJava++;
            } else if (sentence.substring(i).startsWith("python")) {
                countPython++;
            }
        }
        System.out.println(countJava == countPython);

    }

}
