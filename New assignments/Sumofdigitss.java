
import java.util.Scanner;
public class Sumofdigitss{ 
	public static void main(String[] args){  
		Scanner input = new Scanner(System.in);
			System.out.print("Enter a 3 digit integer :"); 
			 int integer = input.nextInt();
			 int digitOne = integer% 10; 
			 int digitTwo = (integer/10) % 10; 
			 int digitThree = (integer/100) % 10; 
			 int sumOfDigits = digitOne + digitTwo + digitThree;
			System.out.printf("The sum of the three last Entered digits is: %d%n", sumOfDigits);
		
	}
}