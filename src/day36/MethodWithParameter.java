package day36;

public class MethodWithParameter {

    public static void main(String[] args) {

        addOneHundred(25);
        addOneHundred(new Integer(100));

        int num = 7;
        addOneHundred(num);
        System.out.println(num);

        num = addOneHundredAndReturn(num);
        System.out.println(num);

    }

    public static void addOneHundred(int x) {

        System.out.println(x + 100);

    }

    public static int addOneHundredAndReturn(int y) {

        y += 100;
        return y;

    }
}
