package day31;

public class CallingOneMethodInsideAnother {

    public static void finallyAwake() {

        MethodPractice3.wakeUp();
        MethodPractice3.drinkCoffee();

    }

    public static void main(String[] args) {

        finallyAwake();
        MethodPractice3.drinkCoffee();

    }

}
