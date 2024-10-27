import java.util.Scanner;
public class Equation{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number :");
		int firstNumber = input.nextInt();
		
		System.out.println("Enter a number :");
		int secondNumber = input.nextInt();

		System.out.println("Enter a number :");
		int thirdNumber = input.nextInt();

		double factor = secondNumber*secondNumber - 4*firstNumber*thirdNumber;

	System.out.println("The factor is " + factor);
	
	if (factor > 0) {
	  double answer1 = (-secondNumber + Math.sqrt(factor)) / (2 * firstNumber);
	  double answer2 = (-secondNumber - Math.sqrt(factor)) / (2 * firstNumber);

	   System.out.println("answer one is: " + answer1);
	   System.out.println("answer two is: " + answer2);
	}
	else if (factor == 0) {
	    double answer3 = -secondNumber / (2 * firstNumber);
		System.out.println("The answer is: " + answer3);
	}

	else {
	      System.out.println("NaN");
	}
		
		
	}
}