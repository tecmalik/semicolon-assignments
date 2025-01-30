package bankaccount;

import javax.swing.*;
import java.util.ArrayList;

public class Bank {

    ArrayList<Account> accounts = new ArrayList<>();
    private int count = 0;


    public ArrayList<Account> createAccount(String firstName, String lastName, String pin) {
        this.count++;
        Account account = new Account(firstName, lastName, pin, count);
        accounts.add(account);
        return accounts;
    }

    public int getAccountNumber(String firstName,String lastName) {
        for (Account account : accounts) {
            if (account.getFirstname().equals(firstName) && account.getLastname().equals(lastName) ) {
                return account.getAccountNumber();
            }
        }
        return 0;
    }

    public void deposit(int accountNumber, int amount) {
        if (amountValidity(amount)) {
            for (Account account : accounts) {
                if (account.getAccountNumber() == accountNumber) account.deposit(amount);
            }
        }
        throw new IllegalArgumentException("Deposit amount mut be greater than 10");

    }

    private boolean amountValidity(int amount) {
        return amount > 10;
    }

    public int checkBalance(int accountNumber, String pinNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account.checkBalance(pinNumber);
            }
        } return 0;
    }

    public void withdraw(int accountName, int amount, String pinNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountName) {
                account.withdraw(amount, pinNumber);
            }
        }
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

            }

        }
    }
}
