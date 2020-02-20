package day23;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        /*
         * create long array of 5 items called salaries
         * put your salary amounts that ok for your offer
         *
         * use for each loop to iterate over them
         * and print them out
         *
         * optionally:
         * print only the salary more than 100000
         */

        long[] salaries = {95000L, 160000L, 85000L, 150000L, 185000L};
        long sum = 0;
        long max = salaries[0];

        for (long eachSalary : salaries) {
            if (eachSalary > 100000) {
                System.out.println("eachSalary = " + eachSalary);
            }
            if (max < eachSalary) {
                max = eachSalary;
            }
            sum += eachSalary;
        }
        System.out.println("max = " + max);
        System.out.println("sum = " + sum);
        for (long eachSalary : salaries) {
            if (eachSalary <= 100000) {
                continue;
            }
            System.out.println("salaries = " + eachSalary);
        }

    }

}
