package zReplit;

import java.util.*;

public class Task167_ToBeOrNotToBe {

    public static void main(String[] args) {

        System.out.println(hamletQuote(false, false));

    }

    public static boolean hamletQuote(boolean toBe, boolean notToBe) {

        //return (toBe == false && notToBe == false) ? false : true;
        return toBe || notToBe;

    }

}
