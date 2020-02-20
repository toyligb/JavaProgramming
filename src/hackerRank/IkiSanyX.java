package hackerRank;

import java.util.*;

public class IkiSanyX {

    public static void main(String[] args) {

        String str = "123456";
        boolean result;
        int xIndex = str.indexOf("x");
        if (xIndex == -1) {
            result = false;
        } else if (xIndex+1 >= str.length()) {
            result = false;
        } else {
            result = str.substring(xIndex+1, xIndex+2).equals("x");
        }

        System.out.println("result = " + result);

        for (int i = 0; i <= str.length()-1; i+=2) {
            System.out.print(str.charAt(i) + "");
        }

    }

}
