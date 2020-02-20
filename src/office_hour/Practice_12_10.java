package office_hour;

public class Practice_12_10 {
    public static void main(String[] args) {

        String[] cars = {"bmw", "vw", "audi"};

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        for (String carModel : cars) {
            System.out.println(carModel);
            System.out.println("I am finished with car model " + carModel);
        }

        int[] ages = {23, 43, 5, 7, 87};
        System.out.println(ages[2]);
        System.out.println(ages[3] - ages[2]);

    }

}
