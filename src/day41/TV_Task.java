package day41;

public class TV_Task {

    String name;
    boolean isOn;
    int currentChannel;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel < 0 || currentChannel > 50) {
            System.out.println("Invalid channel!");
            return;
        }
        if (isOn) {
            this.currentChannel = currentChannel;
        } else {
            System.out.println("Turn on the TV first!");
        }
    }

    public void turnON() {
        if (!isOn) {
            System.out.println("Turning ON the TV!");
            isOn = true;
        }
    }

    public void turnOFF() {
        if (isOn) {
            System.out.println("Turning OFF the TV!");
            isOn = false;
        }
    }

    public String toString() {
        return "TV_Task{" +
                "name='" + name + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }

    public void moveForward() {
        if (isOn) {
            setCurrentChannel(currentChannel + 1);
        } else {
            System.out.println("Turn ON your TV first!");
        }
    }

    public void moveBackward() {
        if (isOn) {
            setCurrentChannel(currentChannel - 1);
        } else {
            System.out.println("Turn ON your TV first!");
        }
    }

}
