package bankaccount;

import java.util.ArrayList;

public class Bank {

    ArrayList<Account> accounts = new ArrayList<>();
    private int count = 0;


    public void createAccount(String firstName, String lastName, String pin) {
        this.count++;
        Account account = new Account(firstName, lastName, pin, count);
        accounts.add(account);
    }

    public int getAccountNumber(String firstName,String lastName) {
        for (Account account : accounts) {
            if (account.getFirstname().equals(firstName) && account.getLastname().equals(lastName) ) {
                return account.getAccountNumber();
            }
        }
        throw new IllegalArgumentException(" No Account With FirstName or LastName Found");
    }

    public void deposit(int accountNumber, int amount) {
        if (!amountValidity(amount)) throw new IllegalArgumentException("Deposit amount mut be greater than 10");
        for (Account account : accounts) if (account.getAccountNumber() == accountNumber) account.deposit(amount);

    }

    private boolean amountValidity(int amount) {
        return amount > 10;
    }

    public int checkBalance(int accountNumber, String pinNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account.checkBalance(pinNumber);
            }
        } throw new IllegalArgumentException("invalid Details");
    }

    public void withdraw(int accountNumber, int amount, String pinNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.withdraw(amount, pinNumber);
            }
        }
        throw new IllegalArgumentException("invalid Details");
    }

    public void bankTransfer(int senderAccountNumber, int amount, int recipientAcctNumber, String pinNumber) {
        for (Account account : accounts) {

            if (account.getAccountNumber() == senderAccountNumber) {
                account.withdraw(amount, pinNumber);
                for (Account checkedAccount : accounts) {

                    if (checkedAccount.getAccountNumber() == recipientAcctNumber) {
                        checkedAccount.deposit(amount);
                    }
                }

            } throw new IllegalArgumentException("invalid Details");
        }
    }
    public Account getAccount( int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }

        }
        throw new IllegalArgumentException();
    }
}

