package bankaccount;

public class Account {
    private String firstName;
    private String lastName;
    private int balance = 0;
    private String pinCode;;

    public Account(String firstName, String lastName ,String pinCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pinCode = pinCode;
    }

    public String getFirstname() {
        return firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public boolean isEmpty() {
        return balance == 0;
    }

    public boolean isNotEmpty() {
        return balance != 0;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public int checkBalance() {
        return balance;
    }

    public void withdraw(int amount, String pinCode) {
        if(this.pinCode.equals(pinCode)){
            this.balance -= amount;
        }
    }


}
