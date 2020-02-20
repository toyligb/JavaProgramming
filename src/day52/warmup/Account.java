package day52.warmup;

public class Account implements Transferable, Comparable<Account> {

    protected String name;
    private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    @Override
    public void transferAll(Account otherAccount) {
        // get the balance of current account
        // deposit to the other account
        otherAccount.balance += this.balance;
        // set current account balance to 0
        this.balance = 0;
        // or optionally use the method
//        otherAccount.deposit(this.balance);
//        this.withdraw(this.balance);
    }

    @Override
    public void transferAmount(Account otherAccount, int amountToTransfer) {
        otherAccount.deposit(amountToTransfer);
        this.balance -= amountToTransfer;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public boolean isPalindrome() {

        String nameCopy = this.name.toLowerCase().replace(" ", "");
        String reversed = "";
        for (int i = nameCopy.length() - 1; i >= 0; i--) {
            reversed += nameCopy.charAt(i);
        }
        return reversed.equalsIgnoreCase(nameCopy);
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public int compareTo(Account otherAccount) {
        if (this.balance > otherAccount.balance) {
            return 1;
        } else if (this.balance < otherAccount.balance) {
            return -1;
        } else {
            return 0;
        }
    }
}
