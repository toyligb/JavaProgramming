package day15;

public class TaskLordOfTheRing {

    public static void main(String[] args) {

        //              0123456789012345
        String movie = "Lord Of The Ring";

        String ring = movie.substring(12);
        String lord = movie.substring(0,4);
        String ofThe = movie.substring(5,11);

        System.out.println(ring + " " + ofThe + " Java " + lord);

    }

}
