 class BankAccount {
    private double balance;
    private int dailyDeposit;
    private int dailyWithdrawal;
    private String[] records;
    private int recordCount;

    public BankAccount() {
        this.balance = 0;
        this.dailyDeposit = 0;
        this.dailyWithdrawal = 0;
        this.records = new String[100];
        this.recordCount = 0;
    }

    public void depositAmount(double amount) {
        if (dailyDeposit + amount > 10000) {
            System.out.println("Deposit amount cannot exceed 10000 RMB in a day.");
            return;
        }
        balance += amount;
        dailyDeposit += amount;
        addRecord("Deposited " + amount + " RMB");
        System.out.println("Deposited " + amount + " RMB. New balance: " + balance + " RMB");
    }

    public void withdrawAmount(double amount) {
        if (dailyWithdrawal + amount > 5000) {
            System.out.println("Withdrawal amount cannot exceed 5000 RMB in a day.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        balance -= amount;
        dailyWithdrawal += amount;
        addRecord("Withdrew " + amount + " RMB");
        System.out.println("Withdrew " + amount + " RMB. New balance: " + balance + " RMB");
    }

    public void showTotal() {
        System.out.println("Total balance: " + balance + " RMB");
        System.out.println("Transaction records:");
        for (int i = 0; i < recordCount; i++) {
            System.out.println(records[i]);
        }
    }

    private void addRecord(String record) {
        if (recordCount < records.length) {
            records[recordCount] = record;
            recordCount++;
        } else {
            System.out.println("Record limit reached. Cannot add more transactions.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.depositAmount(5000);
        account.depositAmount(6000);
        account.withdrawAmount(3000);
        account.withdrawAmount(4000);
        account.showTotal();
    }
}
