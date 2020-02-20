package day29;

public class HeroIdentity {

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
        String stars = "";

        for (int i = 0; i < heroSplitted[1].length(); i++) {
            stars += "*";
        }

        heroSplitted[1] = stars;

        System.out.println(heroSplitted[0] + "-" + heroSplitted[1]);

    }

}
