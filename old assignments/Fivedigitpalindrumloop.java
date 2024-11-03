import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 5-digit number: ");
        int number = input.nextInt();

        if (number < 10000 || number > 99999) {
            System.out.println("Number is not a five-digit number.");
            return;
        }
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println("Number is a palindrome.");
        } else {
            System.out.println("Number is not a palindrome.");
        }
    }
}
