package day39;

import java.util.*;

public class Garage {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.carMake = "BMW";
        car1.carModel = "X5";
        car1.year = 2019;
        car1.color = "Black";

        System.out.println("car1.carMake = " + car1.carMake);
        System.out.println("car1.carModel = " + car1.carModel);
        System.out.println("car1.year = " + car1.year);
        System.out.println("car1.color = " + car1.color);

        System.out.println("==============");

        Car car2 = new Car();
        car2.carMake = "Mercedes";
        car2.carModel = "CLS";
        car2.year = 2019;
        car2.color = "White";

        System.out.println("car2.carMake = " + car2.carMake);
        System.out.println("car2.carModel = " + car2.carModel);
        System.out.println("car2.year = " + car2.year);
        System.out.println("car2.color = " + car2.color);
        System.out.println("==============");

        car2.color = car1.color;
        System.out.println("car2.color = " + car2.color);

        car1.changeColorTo("Dark Blue");
        System.out.println("car1.color = " + car1.color);

        System.out.println("==============");

        car1.goForward();
        car2.goForward();
        car2.printCarAge();

        ArrayList<Car> cars = new ArrayList(Arrays.asList(car1, car2));

        for (Car thisCar : cars) {
            thisCar.goForward();
        }

    }

}
