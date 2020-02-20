package zReplit;

import java.util.*;

public class Task128ArraysAverageTemp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = {scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                          scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                          scan.nextDouble(), scan.nextDouble()};

        for (; k < temps.length; k++) {
            total += temps[k];
        }
        avgTemp = total / temps.length;

        System.out.println(avgTemp);

    }
}
