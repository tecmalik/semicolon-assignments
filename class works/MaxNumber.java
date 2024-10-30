import java.util.Scanner;
public class MaxNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number :");
		int firstNumber = input.nextInt();
		System.out.println("Enter second number :");
		int secondNumber = input.nextInt();
		System.out.println("Enter third number :");
		int thirdNumber = input.nextInt();
		
		if (firstNumber> secondNumber && firstNumber> thirdNumber){
			System.out.print(firstNumber+"is the maximum number");
		}
		else if(secondNumber> firstNumber && secondNumber> thirdNumber){
			System.out.print(secondNumber+"is the maximum number");
		}
		else if(thirdNumber> firstNumber && thirdNumber> secondNumber){
			System.out.print(thirdNumber+" is the maximum number");
		}

		
	}
}