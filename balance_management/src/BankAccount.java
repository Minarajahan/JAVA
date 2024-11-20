public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void DepositAmount(double amount) {
        if (amount > 10000) {
            System.out.println("Deposit amount cannot exceed 10000 RMB in a day.");
        } else {
            balance += amount;
            System.out.println("Deposit successful! Current balance: " + balance + " RMB.");
        }
    }
    public void WithdrawAmount(double amount) {
        if (amount > 5000) {
            System.out.println("Withdraw amount cannot exceed 5000 RMB in a day.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Current balance: " + balance + " RMB.");
        } else {
            balance -= amount;
            System.out.println("Withdraw successful! Current balance: " + balance + " RMB.");
        }
    }

    public void DisplayBalance() {
        System.out.println("Current balance: " + balance + " RMB.");
    }


    public static void main(String[] args) {
        BankAccount account = new BankAccount(10000);

        account.DepositAmount(8000);
        account.DepositAmount(12000);

        account.WithdrawAmount(3000);
        account.WithdrawAmount(6000);
        account.WithdrawAmount(8000);
    }
}
