package account_bank_system;

public class BankAccount {
    protected String accountNumber;
    protected long balance;

    public BankAccount(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount() {
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void deposit(long amount) {
        this.balance += amount;
    }

    public void withdraw(long amount) {
        this.balance -= amount;
    }


    public void display_balance() {
        System.out.println("Balance: " + this.balance);
    }

    @Override
    public String toString() {
        return "Account number: " + accountNumber +
                ", Balance: " + balance;
    }
}
