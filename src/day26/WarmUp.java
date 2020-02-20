package day26;

import java.util.*;

public class WarmUp {

    public static void main(String[] args) {

        int[] myNumbers = new int[4];
        myNumbers[0] = 10;
        myNumbers[1] = 40;
        myNumbers[2] = 30;
        myNumbers[3] = 7;

        myNumbers[2] = myNumbers[0] + myNumbers[1];

        int temp = myNumbers[0];
        myNumbers[0] = myNumbers[myNumbers.length-1];
        myNumbers[myNumbers.length-1] = temp;
        System.out.println(myNumbers[0]);
        System.out.println(myNumbers[1]);
        System.out.println(myNumbers[2]);
        System.out.println(myNumbers[3]);
        temp = myNumbers[1];
        myNumbers[1] = myNumbers[2];
        myNumbers[2] = temp;

        System.out.println(Arrays.toString(myNumbers));

        System.out.println("=============");

        String name1 = "Emma";
        String name2 = "Jason";

        String tempContainer = name1;
        name1 = name2;
        name2 = tempContainer;

        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);

    }
}
