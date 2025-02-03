package src;

public class WithdrawThread extends Thread {
    private BankAccount account;
    private double amount;
    private String threadName;
    private long sleepTime;

    public WithdrawThread(BankAccount account, double amount, String threadName, long sleeptime) {
        this.account = account;
        this.amount = amount;
        this.threadName = threadName;
        this.sleepTime = sleeptime;
    }

    @Override
    public void run() {
        while (true){
            try{
                account.withdraw(amount, threadName);
                sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
