class BankAccount {
    private double balance;

    public void deposit(double amount) throws Exception {
        if (amount > 10000) {
            throw new Exception("Deposit amount exceeds the maximum limit of 10,000.");
        }
        balance += amount;
        System.out.println("Deposited: " + amount + ". New balance: " + balance);
    }

    public void withdraw(double amount) throws Exception {
        if (amount > 5000) {
            throw new Exception("Withdrawal amount exceeds the maximum limit of 5,000.");
        }
        if (amount > balance) {
            throw new Exception("Insufficient balance for withdrawal.");
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount + ". New balance: " + balance);
    }
    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        try {
            account.deposit(5000);
            account.deposit(12000);
        } catch (Exception e) {
            System.out.println("Error: ");
        }

        try {
            account.withdraw(3000);
            account.withdraw(6000);
        } catch (Exception e) {
            System.out.println("Error: ");
        }
    }
}