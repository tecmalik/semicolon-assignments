package bankaccount;

import javax.swing.*;
import java.util.Scanner;

public class BankAtm {
    static Bank bank = new Bank();
    public static void main(String[] args) {

        displayMainMenu();


    }
    public static void displayMainMenu(){
        String prompt = """
                1. Deposit
                2. Withdraw
                3. Check Balance
                4. Transfer
                5. update pin
                6. create Account
                7. Exit
                """;
        String choice = input(prompt);
        switch (choice) {
            case "1": bankDeposit();
            break;
            case "2": bankWithdraw();
            break;
            case "3": bankCheckBalance();
            break;
            case "4": bankTransfer();
            break;
            case "5":bankUpdatePin();
            break;
            case "6": createBankAccount();
            break;
            case "7": System.exit(0);
            break;
            default: prints("invalid input");
        }
    }

    private static void bankUpdatePin() {
        String pinNumber = input("old pin: ");
        String newPinNumber = input("new pin: ");
        int pinNumberInt = Integer.parseInt(pinNumber);
        //bank.
    }

    private static void bankTransfer() {
        String sender = input("Enter Account number : ");
        String receiver = input("Enter Account number : ");
        String amount = input("Enter Amount : ");
        String pinNumber = input("pin: ");
        int senderAccountNumberInt = Integer.parseInt(sender);
        int receiverAccountNumberInt = Integer.parseInt(receiver);
        int amountInt = Integer.parseInt(amount);
        bank.bankTransfer(senderAccountNumberInt,amountInt,receiverAccountNumberInt,pinNumber);
    }

    private static void bankCheckBalance(){
         String pinNumber = input("pin: ");
         String accountNumber = input("Enter Account number:");
         int accountNumberInt = Integer.parseInt(accountNumber);
         bank.checkBalance(accountNumberInt, pinNumber);
    }

    private static String bankWithdraw() {
        String accountNumber = input("Enter Account Number: ");
        String amount = input("Enter amount to withdraw: ");
        String pinNumber = input("Enter pin ");
        int amountInt = Integer.parseInt(amount);
        int accountNumberInt = Integer.parseInt(accountNumber);
        bank.withdraw( accountNumberInt , amountInt  ,pinNumber);
        return "Withdraw Successful";
    }

    private static void createBankAccount() {
        String firstName = input("Enter First Name: ");
        String lastName = input("Enter Last Name: ");
        String pin = input("pin: ");
        try {
            bank.createAccount(firstName, lastName, pin);
        }catch (Exception e) {
            prints(e.getMessage());
            displayMainMenu();
        } finally {
            prints("Account created successfully");
            displayMainMenu();
        }
    }

    private static void bankDeposit() {
        String accountNumber = input("Enter Account Number: ");
        String depositAmount = input("Enter Deposit Amount: ");
        if(pinValidation(depositAmount)) throw new IllegalArgumentException();
        int depositAmountInt = Integer.parseInt(depositAmount);
        int accountNumberInt = Integer.parseInt(accountNumber);
        bank.deposit( accountNumberInt , depositAmountInt );
    }

    private static boolean pinValidation(String depositAmount) {
        if(depositAmount.length() < 4) return true;
        if(depositAmount.length() > 4) return true;
        for(int index = 0; index < depositAmount.length(); index++) {
            if(!Character.isDigit(depositAmount.charAt(index))) return true;
         }
        return false;

    }

    public static String input(String print){
        Scanner input = new Scanner(System.in);
        prints(print);
        return input.nextLine();

        }

    public static void prints(String print) {
        //System.out.println(print);
       JOptionPane.showInputDialog(print);
    }
}
