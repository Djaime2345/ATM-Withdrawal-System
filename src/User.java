package src;

public class User extends Thread {
    private BankAccount account;
    private double amount;
    private String threadName;

    public User(BankAccount account, double amount, String threadName) {
        this.account = account;
        this.amount = amount;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        account.withdraw(amount, threadName);
    }
}
