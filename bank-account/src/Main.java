public class Main {
    public static void main(String[] args) {
        class BankAccount {
            private String name;
            private double balance;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                if (name != null && !name.trim().isEmpty()) {
                    this.name = name;
                } else {
                    System.out.println("Name cannot be empty.");
                }
            }

            public double getBalance() {
                return balance;
            }

            public void deposit(double amount) {
                if (amount > 0) {
                    balance += amount;
                } else {
                    System.out.println("Deposit amount must be positive.");
                }
            }

            public void withdraw(double amount) {
                if (amount > 0 && amount <= balance) {
                    balance -= amount;
                } else {
                    System.out.println("Invalid withdrawal amount.");
                }
            }
        }

        BankAccount account = new BankAccount();
        account.setName("Jahan Minara");
        account.deposit(100000);
        account.withdraw(20000);
        System.out.println("Current balance: " + account.getBalance());
    }
}
