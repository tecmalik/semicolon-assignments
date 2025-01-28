package bankaccount;

public class Account {
    private String firstName;
    private String lastName;
    private int balance = 0;
    private String pinNumber;
    private int bankAccountNumber;

    public Account(String firstName, String lastName ,String pinNumber,int accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pinNumber = pinNumber;
        this.bankAccountNumber = accountNumber;

    }

    public int getAccountNumber() {
        return this.bankAccountNumber;
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
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public int checkBalance(String pinNumber) {
        if (pinNumber.equals(this.pinNumber)) {
            return this.balance;
        }
        return -1;
    }

    public void withdraw(int amount, String pinNumber) {
        if(this.pinNumber.equals(pinNumber)){
            this.balance -= amount;
        }
    }


    public void updatePin(String OldNumber , String newNumber) {
        if (this.pinNumber.equals(OldNumber)) {
            this.pinNumber = newNumber;
        }
    }
}
