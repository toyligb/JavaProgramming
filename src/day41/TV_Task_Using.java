package day41;

public class TV_Task_Using {

    public static void main(String[] args) {

        TV_Task tv1 = new TV_Task();
        tv1.setName("Sony");
        tv1.setOn(true);
        tv1.setCurrentChannel(5);
        System.out.println(tv1);
        System.out.println("tv1.currentChannel = " + tv1.currentChannel);

        System.out.println("tv1.name = " + tv1.name);
        System.out.println("tv1.isOn = " + tv1.isOn);
        System.out.println("tv1.currentChannel = " + tv1.currentChannel);
        tv1.moveForward();
        tv1.moveForward();
        tv1.moveForward();
        tv1.moveBackward();
        System.out.println("tv1.currentChannel = " + tv1.currentChannel);

    }

}
