package practice;

public class BankAccount {
    private String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    private void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000.0);
        account.displayBalance();
    }
}
