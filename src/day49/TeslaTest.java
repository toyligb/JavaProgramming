package day49;

public class TeslaTest {

    public static void main(String[] args) {

        Tesla t1 = new Tesla(2020, 250, "Model X");
        t1.start();
        t1.selfDrive();
        t1.goForward();
        t1.charge();
        System.out.println("t1 = " + t1);

    }

}