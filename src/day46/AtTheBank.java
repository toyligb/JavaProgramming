package day46;

public class AtTheBank {

    public static void main(String[] args) {

        ChekingAccount acc1 = new ChekingAccount("Zehra", 54321, 10000);
        acc1.deposit(100);
        System.out.println("acc1 = " + acc1);
        acc1.deposit(5000);
        System.out.println("acc1 = " + acc1);
        acc1.withdraw(5300);
        System.out.println("acc1 = " + acc1);

    }

}
