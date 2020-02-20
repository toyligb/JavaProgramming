package zReplit;

import java.lang.reflect.Array;
import java.util.*;

public class Task193_MethodsWithArrayList3_CombineArrays {

    public static void main(String[] args) {

        String[] arr1 = new String[]{"f", "o", "o"};
        String[] arr2 = new String[]{"b", "a", "r"};
        System.out.println(combineRs(arr1, arr2));

    }

    public static String combineRs(String[] r1, String[] r2) {

        ArrayList<String> combined = new ArrayList<>();
        combined.addAll(Arrays.asList(r1));
        combined.addAll(Arrays.asList(r2));

        String result = "";
        for (int i = 0; i < combined.size(); i++)
            result += combined.get(i);
        return result;
    }

}
