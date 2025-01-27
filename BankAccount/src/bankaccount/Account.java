package bankaccount;

public class Account {
    private int balance = 0;

    public boolean isEmpty() {
        return balance == 0;
    }

    public boolean isNotEmpty() {
        return balance != 0;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }



}
