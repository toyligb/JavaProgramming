package day23;

public class ForEachLoopPracticeFindMax {

    public static void main(String[] args) {

        long[] salary = new long[]{100000L, 200000L, 150000L, 115000L, 60000L};
        long maxSalary = salary[0];

        for (long eachItem : salary) {
            if (eachItem > maxSalary) {
                maxSalary = eachItem;
            }
        }
        System.out.println("maxSalary = " + maxSalary);
    }

}
