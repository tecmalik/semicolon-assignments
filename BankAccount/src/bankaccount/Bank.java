package bankaccount;

import java.util.ArrayList;

public class Bank {
    private String Bankname;
    ArrayList<Account> accounts = new ArrayList<>();
    private int count;


    public ArrayList<Account> createAccount(String firstName, String lastName, String pin) {
        this.count++;
        Account account = new Account(firstName, lastName, pin, count);
        accounts.add(account);
        return accounts;
    }

    public int getAccountNumber() {
        return this.count;
    }
}
