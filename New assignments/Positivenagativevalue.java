import java.util.Scanner;

public class Positivenagativevalue{
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);

		System.out.print("enter five random numbers");
		System.out.print("enter the first number ");
		int firstNumber = input.nextInt();

		System.out.print("enter the second number ");
		int secondNumber = input.nextInt();
		
		System.out.print("enter the third number ");
		int thirdNumber = input.nextInt();
			
		System.out.print("enter the forth number ");
		int forthNumber = input.nextInt();
			
		System.out.print("enter the fifth number ");
		int fifthNumber = input.nextInt();
		
		if (firstNumber > 0 ){
				System.out.printf(" this is a positive number %d%n",firstNumber);
		}
		else { System.out.printf("this is a nagative number %d%n", firstNumber); 
		}
		if (secondNumber > 0 ){
				System.out.printf(" this is a positive number %d%n", secondNumber);
		}
		else { System.out.printf(" this is a nagative number %d%n", secondNumber); 
		}
		if (thirdNumber > 0 ){
				System.out.printf(" this is a positive number %d%n",thirdNumber);
		}
		else { System.out.printf(" this is a nagative number %d%n", thirdNumber); 
		}
		if (forthNumber > 0 ){
				System.out.printf(" this is a positive number %d%n",forthNumber);
		}
		else { System.out.printf(" this is a nagative number %d%n", forthNumber); 
		}
		if (fifthNumber > 0 ){
				System.out.printf(" this is a positive number %d%n",fifthNumber);
		}
		else { System.out.printf(" this is a nagative number %d%n", fifthNumber); 
		}


		if (firstNumber == 0 ){
				System.out.printf(" this is a zero %d%n",firstNumber);
		}
		
		if (secondNumber == 0 ){
				System.out.printf(" this is a zero %d%n",secondNumber);
		}
		if (thirdNumber == 0 ){
				System.out.printf(" this is a zero %d%n",thirdNumber);
		}
		if (firstNumber == 0 ){
				System.out.printf(" this is a zero %d%n",forthNumber);
		}
		if (forthNumber == 0 ){
				System.out.printf(" this is a zero %d%n",fifthNumber);
		}


	}
} 