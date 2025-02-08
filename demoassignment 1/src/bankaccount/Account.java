

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
        if (amount <= 10)throw new IllegalArgumentException("Amount must be greater than 100");
        this.balance += amount;

    }

    public int checkBalance(String pinNumber) {
        if (!pinNumber.equals(this.pinNumber))throw new IllegalArgumentException("Invalid pinNumber");
        return this.balance;
    }

    public void withdraw(int amount, String pinNumber) {
        if (!this.validatePin(pinNumber)) throw new IllegalArgumentException("invalid pin number");
        if (!this.validateAmount(amount))throw new InsufficientFundsException("insufficient fund");
        this.balance -= amount;
    }

    private boolean validateAmount(int amount) {
        return amount > 0 && amount <= this.balance;
    }

    private boolean validatePin(String pinNumber) {
        checkPinLength(pinNumber);
        if (!pinNumber.matches("[0-9]+")) throw new InvalidAccountException("pin must be 4 digits");
        return this.pinNumber.equals(pinNumber);
    }

    private static void checkPinLength(String pinNumber) {
        if(pinNumber.length() != 4) throw new IllegalArgumentException("Invalid detail");
    }

    public void updatePin(String OldNumber, String newNumber) {
        if(!isValid(newNumber))throw new InvalidPinException("pin must be 4 digits");
        if(!this.pinNumber.equals(OldNumber)) throw new IllegalArgumentException("invalid Details");
        this.pinNumber = newNumber;
    }
    private boolean isValid(String pin) {
        if (!pin.matches("[0-9]+")) throw new InvalidAccountException("pin must be 4 digits");
        if(pin.length() != 4) throw new InvalidAccountException("pin must be 4 digits");
        return true;
    }

}
