package zReplit;

import java.util.*;

public class Task180_MethodsWithString3_CoverME {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter main word:");
        String main = scan.nextLine();

        System.out.println("Enter coverME word:");
        String coverME = scan.nextLine();

        System.out.println(coverString(main, coverME));

    }

    private static String coverString(String main, String coverME) {

//        if (main.contains(coverME)) {
//            String result = "[" + coverME + "]";
//            return main.replace(coverME, result);
//        }
//        return "[" + main + "]";
        String result = (main.contains(coverME))? main.replace(coverME, "[" + coverME + "]") :
                            "[" + main + "]";
        return result;
    }

}
