package zReplit;

import java.util.*;

public class Task211_MethodsWithArrayLists13_DeliveryCalc {

    public static int refuel_times(ArrayList<Integer> deliveries, int max_fuel) {

        int stops = 0;
        int sumDel = 0;
        for (int each : deliveries) {
            sumDel += each;
        }
        if (sumDel % max_fuel == 0) {
            stops = sumDel / max_fuel;
        } else {
            stops = sumDel / max_fuel + 1;
        }

        return stops;

    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(100);
        arr.add(200);
        arr.add(10);
//        arr.add(2);
//        arr.add(6);
        int times = refuel_times(arr, 10);
        System.out.println(times);

    }

}
