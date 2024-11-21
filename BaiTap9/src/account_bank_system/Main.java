package account_bank_system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declare
        BankAccount bankAccount = new BankAccount();
        BankAccount checkingAccount = new CheckingAccount();
        BankAccount savingAccount = new SavingAccount();

        //Input
        System.out.println("Enter account number: ");
        String accountNumber = sc.nextLine();
        bankAccount.setAccountNumber(accountNumber);
        System.out.println("Enter balance: ");
        long balance = sc.nextLong();
        bankAccount.setBalance(balance);

        //Output
        System.out.println("Account number: " + bankAccount.getAccountNumber());
        System.out.println("Account balance: " + bankAccount.getBalance());
        //Deposit
        System.out.println("Enter the amount to deposit: ");
        long amountDeposit = sc.nextLong();
        bankAccount.deposit(amountDeposit);
        System.out.println("Account balance after deposit: " + bankAccount.getBalance());
        //Withdraw
        System.out.println("Enter the amount to withdraw: ");
        long amountWithdraw = sc.nextLong();
        bankAccount.withdraw(amountWithdraw);
        System.out.println("Account balance withdraw: " + bankAccount.getBalance());

        // Checking account deposit
        System.out.println("Enter the amount to deposit (Checking account): ");
        amountDeposit = sc.nextLong();
        bankAccount.withdraw(amountDeposit);
        checkingAccount.setBalance(amountDeposit);
        System.out.println("Account balance: " + bankAccount.getBalance());
        System.out.println("Checking account balance: " + checkingAccount.getBalance());
        System.out.println("Enter the amount to withdraw (Checking account): ");
        amountWithdraw = sc.nextLong();
        checkingAccount.withdraw(amountWithdraw);
        System.out.println("Checking account balance after withdraw: " + checkingAccount.getBalance());

        //Saving account deposit
        System.out.println("Enter the amount to deposit (Saving account): ");
        amountDeposit = sc.nextLong();
        bankAccount.withdraw(amountDeposit);
        savingAccount.setBalance(amountDeposit);
        System.out.println("Account balance: " + bankAccount.getBalance());
        System.out.println("Saving account balance: " + savingAccount.getBalance());
        System.out.println("Enter the amount to withdraw (Saving account): ");
        amountWithdraw = sc.nextLong();
        savingAccount.withdraw(amountWithdraw);


    }
}
