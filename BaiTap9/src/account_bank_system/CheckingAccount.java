package account_bank_system;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, long balance) {
        super(accountNumber, balance);
    }

    public CheckingAccount() {
    }

    @Override
    public void deposit(long amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(long amount) {
        this.balance -= amount;
    }

    @Override
    public void display_balance() {
        System.out.println("Payment account balance: " + balance);
    }
}
