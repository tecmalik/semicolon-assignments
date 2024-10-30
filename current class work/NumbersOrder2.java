import java.util.Scanner;
public class NumbersOrder2{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
	
		int numberCounter = 0;
		int secondNumber = 0;
		int firstNumber = 0;
		int thirdNumber = 0;
		while (numberCounter < 3){
			++numberCounter;
		System.out.println(" Enter a number : ");
		 firstNumber = input.nextInt();
		System.out.println(" Enter a number : ");
		 secondNumber = input.nextInt();
		System.out.println(" Enter a number : ");
		 thirdNumber = input.nextInt();
		
		if (firstNumber < secondNumber && secondNumber < thirdNumber){
			System.out.println(" Numbers are in increasing order ");
		}
		else if (firstNumber > secondNumber && secondNumber> thirdNumber){
			System.out.println(" Numbers are in decreasing order ");
		}
		else {
			System.out.println(" Numbers are not in order ");
		} 
		}

	}
}