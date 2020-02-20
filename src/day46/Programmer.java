package day46;

// Programmer as super class
// JavaProgrammer   SQLProgrammer
// please override code and test under Sub classes

// JavaProgrammer
    // unique behaviour: drinkCoffee, doRepl, doJavaDevelopment

// SQLProgrammer
    // unique behaviour: writeSQLQuery, createDatabase()

// OVERRIDING IS UNIQUE FOR INSTANCE METHOD
// THERE IS NO CONCEPT OF OVERRIDING FOR ANYTHING OTHER THAN INSTANCE METHOD

public class Programmer {

    void code() {
        System.out.println("Any programmer code");
    }

    // is private method inherited? NO!!
    // SO IT CAN NOT BE OVERRIDDEN
    // private void test()   -->> wrong
    void test() {
        System.out.println("Any programmer test");
    }



}
