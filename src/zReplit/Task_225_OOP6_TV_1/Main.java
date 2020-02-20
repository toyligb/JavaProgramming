package zReplit.Task_225_OOP6_TV_1;

public class Main {

    public static void main(String[] args) {

        TV tv1 = new TV();
        tv1.setBrand("Samsung");
        tv1.on = true;
        tv1.setChannel(3);
        tv1.setVolumeLevel(5);
        tv1.channelUp();
        tv1.volumeDown();
        System.out.println("tv1 = " + tv1.toString());

    }

}
