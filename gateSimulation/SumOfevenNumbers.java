import java.util.Scanner;
public class SumOfevenNumbers{
	public static void main(String[] args ){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First number : ");
		int firstNumber = input.nextInt();
		
		System.out.print("Enter Second number greater than first number : ");
		int secondNumber = input.nextInt();
		int sum = 0;
		 while(secondNumber <= firstNumber){
			System.out.print("Number must be greater than first number : ");
			secondNumber = input.nextInt();
		}
		
		while(firstNumber <= secondNumber ){
			
			if (firstNumber % 2 == 0 ){
				sum += firstNumber ;
			}
		firstNumber++;
		}
		
		
		
		System.out.print(" The sum of Even Number between "+(firstNumber-secondNumber)+" number and "+ secondNumber +" number is "+sum);

	
	}
}
