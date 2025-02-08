

package bankaccount;

public class Account {
    private String firstName;
    private String lastName;
    private int balance = 0;
    private String pinNumber;
    private int bankAccountNumber;

    public Account(String firstName, String lastName, String pinNumber, int accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pinNumber = pinNumber;
        this.bankAccountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return this.bankAccountNumber;
    }

    public String getFirstname() {
        return this.firstName;
    }

    public String getLastname() {
        return this.lastName;
    }

    public boolean isEmpty() {
        return this.balance == 0;
    }

    public void deposit(int amount) {
        if (amount <= 10) {
            throw new IllegalArgumentException("Amount must be greater than 100");
        } else {
            this.balance += amount;
        }
    }

    public int checkBalance(String pinNumber) {
        if (pinNumber.equals(this.pinNumber)) {
            return this.balance;
        } else {
            throw new IllegalArgumentException("Invalid pinNumber");
        }
    }

    public void withdraw(int amount, String pinNumber) {
        if (!this.validatePin(pinNumber)) throw new IllegalArgumentException("invalid pin number");
        if (!this.validateAmount(amount))throw new IllegalArgumentException("insufficient fund");
        this.balance -= amount;

    }

    private boolean validateAmount(int amount) {
        return amount > 0 && amount <= this.balance;
    }

    private boolean validatePin(String pinNumber) {
        checkPinLength(pinNumber);
        for (int index = 0; index < pinNumber.length(); index++) {
            if (pinNumber.charAt(index) == '0') throw new IllegalArgumentException("pin must be a Number");
        }
        return this.pinNumber.equals(pinNumber);
    }

    private static void checkPinLength(String pinNumber) {
        if(pinNumber.length() != 4) throw new IllegalArgumentException("Invalid detail");
    }

    public void updatePin(String OldNumber, String newNumber) {
        if (this.validatePin(this.pinNumber) && this.pinNumber.equals(OldNumber)) {
            this.pinNumber = newNumber;
        }

        throw new IllegalArgumentException("Invalid details");
    }
}
