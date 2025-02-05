import java.util.Scanner;
public class HighestNumberChecker{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number:");
		int firstNumber = input.nextInt();
		System.out.print("Enter  second Number:");
		int secondNumber = input.nextInt();
		System.out.print(" Enter thirdnNumber number:");
		int thirdNumber = input.nextInt();

		if (firstNumber > secondNumber && firstNumber> thirdNumber){
			System.out.print("the" + firstNumber + " is the largest number");
		}
		else if (secondNumber > firstNumber && secondNumber > thirdNumber){
			System.out.print("the " + secondNumber + " is the largest number");
		}
		else if (thirdNumber > firstNumber  && thirdNumber >secondNumber){
			System.out.print("the " + thirdNumber + " is the largest number");
		}
		else if (firstnNumber<secondNumber && firstNumber< thirdNumber){
			System.out.print("the " + firstNumber + " is the largest number");
		}
		else if (secondNumber<firstNumber && secondNumber< thirdNumber){
			System.out.print("the " + secondNumber + " is the largest number");
		}
		else if (thirdNumber<firstNumber  && thirdNumber<secondNumber){
			System.out.print("the " + thirdNumber + " is the largest number");
		}


	}
}