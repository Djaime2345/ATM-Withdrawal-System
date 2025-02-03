package src;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Thread t1 = new User(account, 700, "Thread 1");
        Thread t2 = new User(account, 500, "Thread 2");

        t1.start();
        t2.start();
    }
}
