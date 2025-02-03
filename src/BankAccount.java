package src;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void withdraw(double amount, String threadName) {
        System.out.println(threadName + " is trying to WITHDRAW " + amount);

        while (balance < amount) {
            try{
                System.out.println(threadName + " failed to withdraw. Insufficient funds. Waiting for deposit...");
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }

        }
        balance -= amount;
        System.out.println(threadName + " successfully withdrew " + amount);
        System.out.println("Remaining balance: " + balance);

    }

    public synchronized void deposit(double amount, String threadName) {
        System.out.println(threadName + " is trying to DEPOSIT " + amount);
        balance += amount;
        System.out.println(threadName + " successfully deposit " + amount);
        System.out.println("Remaining balance: " + balance);
        notify();
    }
}
