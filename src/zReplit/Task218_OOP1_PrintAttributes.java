package zReplit;

public class Task218_OOP1_PrintAttributes {

    public static void main(String[] args) {

        Atts a = new Atts();
        a.name = "ball";
        a.color = "red";
        a.amount = 1;

        System.out.println(a.asString());

    }

    public static class Atts {

        String name;
        String color;
        int amount;

        public String asString() {

            return "name: " + name + " color: " + color + " amount: " + amount;

        }

    }

}
