
package bankaccount;

import java.awt.Component;
import javax.swing.JOptionPane;

public class BankAtm {
    static Bank bank = new Bank();

    public BankAtm() {
    }

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        String prompt = "1. Deposit\n2. Withdraw\n3. Check Balance\n4. Transfer\n5. update pin\n6. create Account\n7. Exit\n";
        switch (input(prompt)) {
            case "1" -> bankDeposit();
            case "2" -> bankWithdraw();
            case "3" -> bankCheckBalance();
            case "4" -> bankTransfer();
            case "5" -> bankUpdatePin();
            case "6" -> createBankAccount();
            case "7" -> System.exit(0);
            default -> print("invalid input");
        }

    }

    private static void bankUpdatePin() {
        try {
            String pinNumber = input("old pin: ");
            String newPinNumber = input("new pin: ");
            int pinNumberInt = Integer.parseInt(pinNumber);
            bank.getAccount(pinNumberInt).updatePin(pinNumber, newPinNumber);
            print("Account Pin updated successfully");
        } catch (IllegalArgumentException var6) {
            print("invalid input");
        } finally {
            displayMainMenu();
        }

    }

    private static void bankTransfer() {
        try {
            String sender = input("Enter Account number : ");
            String receiver = input("Enter Account number : ");
            String amount = input("Enter Amount : ");
            String pinNumber = input("pin: ");
            int senderAccountNumberInt = Integer.parseInt(sender);
            int receiverAccountNumberInt = Integer.parseInt(receiver);
            int amountInt = Integer.parseInt(amount);
            bank.bankTransfer(senderAccountNumberInt, amountInt, receiverAccountNumberInt, pinNumber);
        } catch (IllegalArgumentException var10) {
            print("invalid input");
        } finally {
            displayMainMenu();
        }

    }

    private static void bankCheckBalance() {
        try {
            String accountNumber = input("Enter Account number:");
            String pinNumber = input("pin: ");
            int accountNumberInt = Integer.parseInt(accountNumber);
            int var10000 = bank.checkBalance(accountNumberInt, pinNumber);
            print("Account Balance: " + var10000);
        } catch (IllegalArgumentException var6) {
            print("invalid input");
        } finally {
            displayMainMenu();
        }

    }

    private static void bankWithdraw() {
        try {
            String accountNumber = input("Enter Account Number: ");
            String amount = input("Enter amount to withdraw: ");
            String pinNumber = input("Enter pin ");
            int amountInt = Integer.parseInt(amount);
            int accountNumberInt = Integer.parseInt(accountNumber);
            bank.withdraw(accountNumberInt, amountInt, pinNumber);
        } catch (IllegalArgumentException var8) {
            print("invalid input");
        } finally {
            displayMainMenu();
        }

    }

    private static void createBankAccount() {
        try {
            String firstName = input("Enter First Name: ");
            String lastName = input("Enter Last Name: ");
            String pin = input("pin: ");
            bank.createAccount(firstName, lastName, pin);
            print("Account created successfully");
            int var10000 = bank.getAccountNumber(firstName, lastName);
            print("your Account number is" + var10000);
        } catch (Exception e) {
            print(e.getMessage());
            displayMainMenu();
        } finally {
            displayMainMenu();
        }

    }

    private static void bankDeposit() {
        try {
            String accountNumber = input("Enter Account Number: ");
            String depositAmount = input("Enter Deposit Amount: ");
            if (pinValidation(depositAmount)) {
                throw new IllegalArgumentException();
            }

            int depositAmountInt = Integer.parseInt(depositAmount);
            int accountNumberInt = Integer.parseInt(accountNumber);
            bank.deposit(accountNumberInt, depositAmountInt);
        } catch (IllegalArgumentException var7) {
            print("Invalid input");
        } finally {
            displayMainMenu();
        }

    }

    private static boolean pinValidation(String depositAmount) {
        if (depositAmount.length() < 4) {
            return true;
        } else if (depositAmount.length() > 4) {
            return true;
        } else {
            for(int index = 0; index < depositAmount.length(); ++index) {
                if (!Character.isDigit(depositAmount.charAt(index))) {
                    return true;
                }
            }

            return false;
        }
    }

    public static String input(String print) {
        return JOptionPane.showInputDialog(print);
    }

    public static void print(String print) {
        JOptionPane.showMessageDialog((Component)null, print);
    }
}
