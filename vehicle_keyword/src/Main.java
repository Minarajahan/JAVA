import java.util.Scanner;

class BankAccount{
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String AccountNumber,String AccontHolderName, double balance){
        this.accountNumber=AccountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited: "+amount);
        }
        else{
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount){
        if(amount>0){
            balance-=amount;
            System.out.println("Withdrawn: "+amount);
        }
        else{
            System.out.println("Invalid withdraw amount");
        }
    }
    public void displayAccountInfo(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Balance: "+balance);
        System.out.println(".........");
    }
}
public class Main{
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of accounts to create: ");
        int numAccount=scanner.nextInt();
        scanner.nextLine();

        BankAccount[] accounts=new BankAccount[numAccount];
        for(int i=0;i<numAccount;i++){
            System.out.println("Enter details for account: " +(i+1)+":");
            System.out.println("Account Number: ");
           String accountNumber=scanner.nextLine();
           System.out.println("Account Holder Name: ");
           String accountHolderName=scanner.nextLine();
           System.out.println("Balance: ");
           double balance=scanner.nextDouble();
           scanner.nextLine();
           accounts[i]=new BankAccount(accountNumber,accountHolderName,balance);
           System.out.println("Account created successfully!\n");
        }
        System.out.println("Account information: ");
        for(int i=0;i<numAccount;i++){
            accounts[i].displayAccountInfo();
        }
        System.out.println("Enter account index (1 to "+ numAccount+") to deposit: ");
        int accountIndex=scanner.nextInt()-1;
        System.out.println("Enter diposit Ammount: ");
        double dipositAmount=scanner.nextDouble();
        accounts[accountIndex].deposit(dipositAmount);
        System.out.println("Enter the account index (1 to "+ numAccount+") to withdraw: ");
        accountIndex=scanner.nextInt()-1;
        System.out.println("Enter withdraw Ammount: ");
        double withdrawAmount=scanner.nextDouble();
        accounts[accountIndex].withdraw(withdrawAmount);
            System.out.println("Updated Account Information: ");
            for(int i=0;i<numAccount;i++){
                accounts[i].displayAccountInfo();
            }
            scanner.close();

    }

}
