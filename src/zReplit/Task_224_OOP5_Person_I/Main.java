package zReplit.Task_224_OOP5_Person_I;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person();
        System.out.println("p1.toString() = " + p1.toString());

        p1.setFirstName("Jemal");
        p1.setLastName("Gurdowa");
        p1.setAge(36);

        System.out.println("p1.toString() = " + p1.toString());

    }

}
