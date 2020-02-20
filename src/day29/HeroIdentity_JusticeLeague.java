package day29;

public class HeroIdentity_JusticeLeague {

    public static void main(String[] args) {

        String[] allHeroes = {"Superman-Clark Kent",
                "Batman-Bruce Wayne",
                "Wonder Woman-Princess Diana",
                "Aquaman-Arthur Orin Curry",
                "Wonder Woman-Princess Diana",
                "Cyborg-Victor Stone",
                "The Flash-Barry Allen ",
                "Green Lantern-Hal Jordan",
                "Green Arrow-Oliver Queen",
                "Atom-Ray Palmer",
                "Hawkman-Carter Hall",
                "Hawkgirl-Shiera Hall",
                "Zantana-Zantana Zatara",
                "Martian Manhunter-John Jones"};

        for (String eachHero : allHeroes) {
            // System.out.println("eachHero = " + eachHero);
            String hero = eachHero;
            String[] heroSplitted = hero.split("-");
            String stars = "";

            for (int i = 1; i <= heroSplitted[1].length(); i++) {
                stars += "*";
            }
            heroSplitted[1] = stars;
            System.out.println("Hero: " + eachHero);
            System.out.println("Hero X: " + heroSplitted[0] + "-" + heroSplitted[1]);
        }

    }

}
