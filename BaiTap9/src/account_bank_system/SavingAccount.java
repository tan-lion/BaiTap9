package account_bank_system;

public class SavingAccount extends BankAccount {

    public SavingAccount(String accountNumber, long balance, long withdraw, long deposit) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(long amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(long amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Saving account balance after withdraw: " + this.balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public SavingAccount() {
    }

    @Override
    public void display_balance() {
        System.out.println("Saving account balance: " + balance);
    }
}
