package src;

public class DepositThread extends Thread {
    private BankAccount account;
    private double amount;
    private String threadName;
    private long sleepTime;

    public DepositThread(BankAccount account, double amount, String threadName, long sleepTime) {
        this.account = account;
        this.amount = amount;
        this.threadName = threadName;
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        while (true){
            try{
                account.deposit(amount, threadName);
                sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
