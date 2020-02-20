package day49;

public class Tesla extends Vehicle implements Autonomous, Chargeable {

    int horsePower;
    String model;

    @Override
    public void selfDrive() {
        System.out.println(model + " self driving");
    }

    @Override
    public void start() {
        System.out.println(model + " starting");
    }

    public Tesla(int year, int horsePower, String model) {
        super(year);
        this.horsePower = horsePower;
        this.model = model;
    }

    @Override
    public void goForward() {
        super.goForward();
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
