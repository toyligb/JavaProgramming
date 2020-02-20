package day03;

public class PrimitivesPractices {

    public static void main(String[] args) {

        byte letterCount = 26;
        System.out.println("The letter count is " + letterCount + ", and it is stored in byte.");
        short sheepCount = 300;
        System.out.println("The sheep count is " + sheepCount + ", and it is stored in short.");
        int catCount = 20;
        System.out.println("The cat count is " + catCount + ", and it is stored in int.");
        long mileToSun = 10000000L;
        long mileToMoon = 500000l;
        System.out.println("The mile to Sun is " + mileToSun + ", \nand mile to Moon is " + mileToMoon + ", and it is in long.");
        //---------floating point-----------
        // you must add f at the end of number to indicate this is float data type
        // uppercase lowercase does not matter, but it's mandatory
        float priceOfBanana = 1.99f;
        float priceOfPotato = 2.49F;
        System.out.println("The price of Banana is " + priceOfBanana + ", price of Potato is " + priceOfPotato + ", and it is stored in float.");
        //--------------- larger floating point numbers -------
        double priceOfIpad1 = 355.99d ;
        double priceOfIpadPro = 1024.99D ;
        // compiler automatically assume it's double so it's not require to have d
        // However for good programming habit, add them always
        double priceOfMac = 2299.99 ;
        System.out.println("The prices for Ipad1, IpadPro, Mac are: " + priceOfIpad1 + ", " + priceOfIpadPro + ", " + priceOfMac + ", and these are atored in double.");
        // If you have a whole number by itself, compiler automatically assume it's an int
        // If you have a fractional number by itself, compiler automatically assume it's an double

    }

}
