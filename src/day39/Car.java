package day39;

public class Car {

    String carMake;
    String carModel;
    int year;
    String color;

    // instance methods are tied to the object

   public void goForward() {
       System.out.println(carMake + " Go Forward");
   }

   public void printCarAge() {
       System.out.println("Car age is = " + (2020 - year));
   }

   public void changeColorTo(String newColor) {
       color = newColor;
   }

}
