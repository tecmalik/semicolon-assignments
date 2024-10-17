import java.util.Scanner;

public class Positivenagativevalue{
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		double positiveNumbers = 0;
		double negativeNumbers = 0;
		double zeroNumbers = 0;

		System.out.print("enter five random numbers");
		System.out.print("enter the first number ");
		double firstNumber = input.nextDouble();

		System.out.print("enter the second number ");
		double secondNumber = input.nextDouble();
		
		System.out.print("enter the third number ");
		double thirdNumber = input.nextDouble();
			
		System.out.print("enter the forth number ");
		double forthNumber = input.nextDouble();
			
		System.out.print("enter the fifth number ");
		double fifthNumber = input.nextDouble();
			
		if (firstNumber == 0) { 
			zeroNumbers++;
		} else if (firstNumber < 0) {
			negativeNumbers++;
		} else { positiveNumbers++;
			}					
			
	}
} 