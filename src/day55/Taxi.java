package day55;

// Taxi -- Engine -- Driver -- Passengers

/*
//as soon as we want to create Taxi t1 object we need Engine eng to pass
// so first we created Engine so that we can pass when we create Taxi t1 object
// Any class can be a data type...
Engine en = new Engine("V6", 400);
Taxi t1 = new Taxi(101, en);
System.out.println("t1 = "+ t1);
//when we print t1 we get a described out put as we have toString in Taxi class
// we also get a nice output for eng because we also have a toString in our Engine class.
// Taxi has plateNumber and eng, at the same time eng has its own type and horsePower
//so we get all when we have toString ---> association. relationship between two separate classes.
 */

// Encapsulate All the fields  -->>> getter bilen setter goshmaga Encapsulation diyilyar******
// variable-leri private etneli we cagyrjak bolsan getter we setter goymaly

public class Taxi {

    int plateNumber;
    Engine eng; // just like String, we have class Engine
                    // so I can use it as data type
    Driver dr;

    public Taxi(int plateNumber, Engine eng, Driver dr) {
        this.plateNumber = plateNumber;
        this.eng = eng;
        this.dr = dr;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "Plate number = " + plateNumber +
                ", Engine = " + eng.toString() +
                ", Driver = " + dr.toString() +
                '}';
    }
}

class Engine {

    String type;
    int horsePower;

    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
    // Taxi has Driver -- Driver object has 2 attribute (name, driverID)
    // Create a class called Driver -- it has 2 attribute (name String, driverID int)

class Driver {

    String name;
    int driverID;

    public Driver(String name, int driverID) {
        this.name = name;
        this.driverID = driverID;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driverID=" + driverID +
                '}';
    }
}