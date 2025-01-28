package bankaccount;

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
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.deposit(amount);
            }
        }
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

}
