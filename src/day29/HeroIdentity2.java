package day29;

public class HeroIdentity2 {

    public static void main(String[] args) {

        String hero1 = "Superman-Clark J Kent";
        // hide this hero identity
        // String heroX = "Superman-************";

        // given a String with hero code and name separated by -
        // turn this String into hero code and * with same length as hero name

        // PLain English logic :
        // split it by - to get the code and the full name
        // get the length of full name
        // generate stars with same length as full name
        // concatenate herocode with dash and stars and save it

        // OR one the stars is generated, replace full name with stars

        String[] heroSplitted = hero1.split("-");
        String heroCode = heroSplitted[0];
        String fullName = heroSplitted[1];

        String stars = "";

        for (int i = 1; i <= fullName.length(); i++) {
            stars += "*";
        }
        System.out.println("stars = " + stars);

        String heroX = hero1.replace(fullName, stars);

        System.out.println("hero1 = " + hero1);
        System.out.println("heroX = " + heroX);

    }

}
