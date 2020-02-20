package day55;

public class TaxiAction {

    public static void main(String[] args) {

        Engine en = new Engine("V6", 400);
        Driver d = new Driver("Pedro", 12345);
        // first character of name of driver
        // System.out.println(d.name.charAt(0));

        Taxi t1 = new Taxi(101, en, d);

        System.out.println("t1 = " + t1.toString());

        Taxi t2 = new Taxi(102, new Engine("V8", 600),
                new Driver("Luka", 57444));

        System.out.println("t2 = " + t2);

        // print out driver name and car horse power
        // driver <name> is driving the taxi with horsepower <> on the highway
        // System.out.println(t2.dr.name);

        // how do I store the t2 plate number in a variable x;
        int x = t2.plateNumber;

        // how do I store the t2 Driver field in a variable y;
        Driver y = t2.dr;

        // how do I store the t2 Engine field in a variable z;
        Engine z = t2.eng;

        // how do I get the name of the driver using t2
        System.out.println("Driver name " + y.name);
        System.out.println("Driver name " + t2.dr.name);

        // how do I get the horse power of this taxi t2
        System.out.println("Engine horsepower is " + t2.eng.horsePower);

        // how do I get the first char of the driver name of taxi t2
        System.out.println("First character of name of t2 taxi driver is " + t2.dr.name.charAt(0));

    }

}