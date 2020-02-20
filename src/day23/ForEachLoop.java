package day23;

public class ForEachLoop {
    public static void main(String[] args) {
        double[] prices = {99.23, 11.99, 100.23, 99.99, 56.34};

        // for each loop syntax
        // for (  dataTypeOfYourArray  variableNameForEachItem :  yourArrayVariable  ) {
        //
        //   do something with your array items
        // }

//        for (int i = 0; i < prices.length; i++) {
//
//            double eachPrice = prices[i];
//            System.out.println("eachPrice = " + eachPrice);
//
//        }
        // for each loop can only be used for ARRAY
        // there is no infinite loop ever in for each loop
        // for each loop arraydaky hemme element bilen ishleshyar
        // ayratyn bir bolegini alyp bolanok
        for (double eachPrice : prices) {
            System.out.println("eachPrice = " + eachPrice);
        }

    }
}
