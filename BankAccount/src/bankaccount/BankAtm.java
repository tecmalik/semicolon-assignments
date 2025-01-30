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
            case "6": createBankAccount();
        }
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
        int pinNumber = Integer.parseInt(depositAmount);
        try{
            bank.deposit(pinNumber);
        } catch () {
            throw new
        }

    }

    private static boolean pinValidation(String depositeAmount) {
        if(depositeAmount.length() < 4) return true;
        if(depositeAmount.length() > 4) return true;
        for(int index = 0; index < depositeAmount.length(); index++) {
            if(!Character.isDigit(depositeAmount.charAt(index))) return true;
         }
        return false;
    }

    public static String input(String print){
        Scanner input = new Scanner(System.in);
        prints(print);
        return input.nextLine();

        }

    public static void prints(String print) {
        System.out.println(print);
        //JOptionPane.showInputDialog(print);
    }
}
