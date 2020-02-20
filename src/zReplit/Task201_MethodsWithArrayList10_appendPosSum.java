package zReplit;

import java.util.*;

public class Task201_MethodsWithArrayList10_appendPosSum {

    public static void main(String[] args) {


    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> lst) {

        ArrayList<Integer> lstPosSum = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > 0) {
                lstPosSum.add(lst.get(i));
                sum += lst.get(i);
            }
        }

        lstPosSum.add(sum);

        return lstPosSum;

    }

}
