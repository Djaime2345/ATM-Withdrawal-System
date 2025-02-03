package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        boolean waiting = true;
        Scanner scanner = new Scanner(System.in);

        Thread t1 = new DepositThread(account, 300, "Thread 1", 1000);
        Thread t2 = new WithdrawThread(account, 200, "Thread 2", 2000);
        Thread t3 = new WithdrawThread(account, 500, "Thread 3", 3000);

        t1.start();
        t2.start();
        t3.start();

    }
}
