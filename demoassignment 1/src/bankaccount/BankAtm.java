
package bankaccount;

import java.awt.Component;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class BankAtm {
    static Bank bank = new Bank();
//    static Scanner input = new Scanner(System.in);

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
            default -> {
                print("invalid input");
                displayMainMenu();
            }

        }

    }

    private static void bankUpdatePin() {
        try {
            String pinNumber = input("old pin: ");
            String newPinNumber = input("new pin: ");
            int pinNumberInt = Integer.parseInt(pinNumber);
            bank.getAccount(pinNumberInt).updatePin(pinNumber, newPinNumber);
            print("Account Pin updated successfully");
        } catch (IllegalArgumentException e) {
            print("invalid input");
        } catch (InvalidPinException e) {
            print("pin must be 4 digits");
        } finally {
            displayMainMenu();
        }

    }

    private static void bankTransfer() {
        try {
            String sender = input("Enter Sender Account number : ");
            String receiver = input("Enter recipient Account number : ");
            String amount = input("Enter Amount : ");
            String pinNumber = input("pin: ");
            int senderAccountNumberInt = Integer.parseInt(sender);
            int receiverAccountNumberInt = Integer.parseInt(receiver);
            int amountInt = Integer.parseInt(amount);
            bank.bankTransfer(senderAccountNumberInt, amountInt, receiverAccountNumberInt, pinNumber);
            print("Transfer was successful");
        } catch (IllegalArgumentException e) {
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
            int accountBalance = bank.checkBalance(accountNumberInt, pinNumber);
            print("Account Balance: " + accountBalance );
        } catch (IllegalArgumentException e) {
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
            print("withdraw was successful");
        } catch (IllegalArgumentException e) {
            print("invalid input");
        } catch (InsufficientFundsException e ){
            print("insufficient funds");
        }finally {
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
            int accountNumber = bank.getAccountNumber(firstName, lastName);
            print("your Account number is " + accountNumber);
        } catch (IllegalArgumentException e) {
            print(e.getMessage());
            displayMainMenu();
        }catch (InvalidAccountException e) {
            print("pin must be 4 digits");
        } finally {
            displayMainMenu();
        }

    }

    private static void bankDeposit() {
        try {
            String accountNumber = input("Enter Account Number: ");
            String depositAmount = input("Enter Deposit Amount: ");
            int depositAmountInt = Integer.parseInt(depositAmount);
            int accountNumberInt = Integer.parseInt(accountNumber);
            bank.deposit(accountNumberInt, depositAmountInt);
            print(depositAmountInt+" deposited successfully");
        } catch (IllegalArgumentException e) {
            print("Invalid input");
        } catch (InvalidAccountException e) {
            print("invalid Account Number");
        } finally {
            displayMainMenu();
        }

    }


    public static String input(String print) {
        return JOptionPane.showInputDialog(print);
//        System.out.print(print);
//        return input.nextLine();
    }

    public static void print(String print) {
        JOptionPane.showMessageDialog((Component)null, print);
    }
}
